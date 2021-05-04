public class DiscountedOrderManager implements OrderService {


    @Override
    public void order(Campaign campaign) {
        campaign.price *= 0.9;
        System.out.println("Kampanyada indirim kazandınız. Yeni fiyat " + campaign.price);
    }
}
