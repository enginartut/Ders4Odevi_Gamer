public class MerlisValidationManager implements  UserValidation{
    @Override
    public boolean validate(Gamer gamer) {
        if(gamer.firstName.equals("Engin") && gamer.lastname.equals("Artut")&&
                gamer.birthOfYear==1980&&gamer.tcNumber==123456789){
            return true;
        }
        else
        {
            return false;
        }
    }
}
