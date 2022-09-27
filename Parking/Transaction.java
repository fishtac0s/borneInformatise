package Parking;

public class Transaction {

    private String codeStationnement;
    private int heureTransaction;

    GregorianCalendar present = new GregorianCalendar();


    public Transaction() {
        this.codeStationnement = codeStationnement;
        this.heureTransaction = heureTransaction;
    }

    public String getCodeStationnement() {
        return codeStationnement;
    }

    public boolean verificationCodeStatonnement() {
        boolean ok = false;
        if (getCodeStationnement().charAt(0) == this.codeStationnement.matches([a-zA-Z]{1})){
            ok = true;
        }
        return ok;
    }

    public int Tarif(){

        if (verificationCodeStatonnement() == true){

        }
        return 0;
    }


}
