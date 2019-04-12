package pageobject;

public enum CanadaStatesEnum {
	
	Alberta("Alberta",0,5,0),
	BritishColumbia("British Columbia",7,5,0),
	Manitoba("Manitoba",8,5,0),
	NewBrunswick("New Brunswick",0,0,15),
	NewfoundlandandLabrador("Newfoundland and Labrador",0,0,15),
	NorthwestTerritories("Northwest Territories",0,5,0),
	NovaScotia("Nova Scotia",0,0,15),
	Nunavut("Nunavut",0,5,0),
	Ontario("Ontario",0,0,13),
	PrinceEdwardIsland("Prince Edward Island",0,0,15),
	Québec("Québec",9.975,5,0),
	Saskatchewan("Saskatchewan",6,5,0),
	YukonTerritory("Yukon Territory",0,5,0);
	
    String stateName;
    double PST;
    double GST;
    double HST;

	CanadaStatesEnum(String stateName,double PST,double GST,double HST){
        this.stateName = stateName;
        this.PST = PST;
        this.GST = GST;
        this.HST = HST;
    }
	
	public double calculateTax() {
		return this.PST + this.GST +this.HST;
	}
	
	



}

