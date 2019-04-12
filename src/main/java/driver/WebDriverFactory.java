package driver;

import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import util.PropertyUtils;
import util.WaitUtils;

import java.util.logging.Logger;
import test.BaseTestCase;


/**
 * This is used to get browser specific WebDriver instance
 *
 * @author pratikpat
 */
public class WebDriverFactory {

    static final Logger LOGGER = Logger.getLogger(String.valueOf(BaseTestCase.class));
    static WaitUtils waitUtils = new WaitUtils();

    public enum BrowserType {
        FIREFOX, CHROME,SAFARI;
    }

    public static WebDriver getWebDriver() {
        WebDriver driver = null;
        final String remoteURL = PropertyUtils.getProperty("remote.url", "getProperty");
        final BrowserType browserType = BrowserType.valueOf(PropertyUtils.getProperty("automation.browser", "CHROME"));
        final String environmentType = PropertyUtils.getProperty("automation.execution.type", "local");
        ChromeOptions chromeOptions = new ChromeOptions();
        FirefoxOptions firefoxOptions = new FirefoxOptions();

        // REMOTE EXECUTION

            switch (browserType) {
                case FIREFOX:
                    System.setProperty("webdriver.gecko.driver", "/Users/imac/Documents/projects/paths/geckodriver");
                    LOGGER.info("Local:FF - started!!!");
                    if (PropertyUtils.getProperty("automation.execution.mode").equals("headless")) {
                        LOGGER.info("Local:Headless:FF - started!!!");
                        try {
                            driver = new FirefoxDriver(firefoxOptions.setHeadless(true));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        LOGGER.info("Local:Headless:FF - ended!!!");
                    } else {
                        LOGGER.info("Local:Normal:FF - started!!!");
                        driver = new FirefoxDriver();
                        LOGGER.info("Local:Normal:FF - ended!!!");
                    }
                    break;
                case CHROME:
                    System.setProperty("webdriver.chrome.driver", "/Users/imac/Documents/projects/paths/chromedriver");
                    LOGGER.info("Local:Chrome - started!!!");
//                    chromeOptions.addArguments("--window-size=1920,1200");
                    if (PropertyUtils.getProperty("automation.execution.mode").equals("headless")) {
                        LOGGER.info("Local:Headless:Chrome - started!!!");
                        chromeOptions.addArguments("--headless");
                        try {
                            driver = new ChromeDriver(chromeOptions);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        LOGGER.info("Local:Headless:Chrome - ended!!!");
                    } else {
                        LOGGER.info("Local:Normal:Chrome - started!!!");
                        driver = new ChromeDriver(chromeOptions);
                        LOGGER.info("Local:Normal:Chrome - ended!!!");
                    }
                    break;
                case SAFARI:
                    LOGGER.info("Local:FF - started!!!");
                    if (PropertyUtils.getProperty("automation.execution.mode").equals("headless")) {
                        LOGGER.info("Local:Headless:FF - started!!!");
                        try {
                            driver = new SafariDriver();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        LOGGER.info("Local:Headless:FF - ended!!!");
                    } else {
                        LOGGER.info("Local:Normal:FF - started!!!");
                        driver = new SafariDriver();
                        LOGGER.info("Local:Normal:FF - ended!!!");
                    }
                    break;

            }


            driver.manage().window().maximize();

        return driver;
    }
}