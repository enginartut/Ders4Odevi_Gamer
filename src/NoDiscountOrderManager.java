public class NoDiscountOrderManager implements OrderService{
    @Override
    public void order(Campaign campaign) {
        System.out.println(" İndirim hakkınız bulunmamaktadır. fiyat :"+campaign.price);
    }
}
