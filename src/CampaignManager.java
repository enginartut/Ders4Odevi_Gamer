public class CampaignManager implements CampaignService {

    OrderService orderService;

    public CampaignManager(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public void addCampaign(Campaign campaign) {
        System.out.println("Kampanya eklendi :"+campaign.name);
        orderService.order(campaign);
    }

    @Override
    public void deleteCampaign(Campaign campaign) {
        System.out.println("Kampanya eklendi :"+campaign.name);
    }

    @Override
    public void updateCampaign(Campaign campaign) {
        System.out.println("Kampanya eklendi :"+campaign.name);
    }
}
