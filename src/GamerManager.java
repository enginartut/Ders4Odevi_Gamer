public class GamerManager implements GamerService{


    UserValidation userValidation;

    public GamerManager(UserValidation userValidation) {
        this.userValidation = userValidation;
    }

    @Override
    public void add(Gamer gamer) {
        if(userValidation.validate(gamer)){
            System.out.println("Kayıt olundu :"+gamer.firstName+" "+gamer.lastname);
        }
        else{
            System.out.println("Doğrulama sağlanamadığından kayıt yapılamadı");
        }
    }

    @Override
    public void delete(Gamer gamer) {
        System.out.println("Kayıt silindi :"+gamer.firstName+" "+gamer.lastname);
    }

    @Override
    public void update(Gamer gamer) {
        System.out.println("Kayıt güncellendi :"+gamer.firstName+" "+gamer.lastname);
    }
}
