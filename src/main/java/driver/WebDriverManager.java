package driver;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.RemoteWebDriver;

import util.PropertyUtils;

/**
 * This will provide instance of thread-safe WebDriver object
 *
 * @author prat3ik
 */
public class WebDriverManager {

    public static ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();
    static final Logger LOGGER = Logger.getLogger(String.valueOf(WebDriverManager.class));

    public static void setThreadLocalWebDriver(final WebDriver driver) {
        webDriver.set(driver);
    }

    public static WebDriver getThreadLocalDriver() {
        WebDriver driver = webDriver.get();
        if (driver == null) {
            throw new RuntimeException("Driver is not created for this Thread");
        }
        return driver;
    }

    public static void createThreadLocalWebDriver() {
        WebDriver driver = null;
        try {
            driver = WebDriverFactory.getWebDriver();
            LOGGER.info("Driver successfully initialized.");
        } catch (Exception e) {
            LOGGER.info("Exception has occurred while assigning the driver object in manager class.");
            e.printStackTrace();

        }
        if (driver == null) {
            LOGGER.info("Driver is null.");
            throw new RuntimeException("Unable to retrieve driver. Grid might be down");
        }
        setTimeOuts(driver);
        webDriver.set(driver);
        LOGGER.info("Test execution has started......");
    }

    /**
     * RemoteWebDriver does not implement the TakesScreenshot class if the
     * driver does have the Capabilities to take a screenshot then Augmenter
     * will add the TakesScreenshot methods to the instance
     */
    public static WebDriver getScreenshotableWebDriver() {
        final WebDriver augmentedDriver = new Augmenter().augment(WebDriverManager.getThreadLocalDriver());
        return augmentedDriver;
    }

    private static void setTimeOuts(WebDriver driver) {
        int implicitWait = PropertyUtils.getIntegerProperty("implicit.wait", 10);
        int pageLoadWait = PropertyUtils.getIntegerProperty("pageload.wait", 30);
        driver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(pageLoadWait, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
    }

    private static void maximize(final WebDriver driver) {
        /*
         * This is workaround for maximizing Chrome browser in selenium grid
         * setup.
         */
        final String chromeBrowserName = "chrome";
        if (driver.getClass().isAssignableFrom(RemoteWebDriver.class)
                && chromeBrowserName.equals(((RemoteWebDriver) driver).getCapabilities().getBrowserName())) {
            // logger.info("Maximizing chrome browser by setSize() API");
            final int screenHeightForMaximizingChromeBrowser = 1200;
            final int screenWidthForMaximizingChromeBrowser = 1920;
            driver.manage().window().setSize(
                    new Dimension(screenWidthForMaximizingChromeBrowser, screenHeightForMaximizingChromeBrowser));
        } else {
            driver.manage().window().maximize();
        }
        // logger.info("Browser Window size: " +
        // driver.manage().window().getSize());
    }
}
