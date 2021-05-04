public class Main {

    public static void main(String[] args) {
	 GamerManager gamerManager= new GamerManager(new MerlisValidationManager());
	 gamerManager.add(new Gamer(1,"Engin","Artut",1980,123456789));

	 CampaignManager campaignManager=new CampaignManager(new NoDiscountOrderManager());
	 campaignManager.addCampaign(new Campaign(1,"Crazy Sky","Sport Games",1000));
    }
}
