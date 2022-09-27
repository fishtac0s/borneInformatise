package Parking;

public class Transaction {
    private String codeStationnement;


    public Transaction() {
        this.codeStationnement = codeStationnement;
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
}
