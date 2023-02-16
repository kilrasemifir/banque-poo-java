package fr.banque;

public class CompteASeuilRemunereV2 extends Compte implements ICompteASeuil, ICompteRemunere{

    private double taux;
    private double seuil;

    public CompteASeuilRemunereV2(int numero, double solde, double taux, double seuil) {
        super(numero, solde);
        this.taux = taux;
        this.seuil = seuil;
    }

    @Override
    public double getTaux() {
        return taux;
    }

    @Override
    public void setTaux(double taux) {
        if (taux < 0){
            System.out.println("Le taux ne peut pas être inf 0%");
            this.taux = 0.;
        } else if (taux > 1) {
            System.out.println("Le taux ne peut être sup a 100%");
            this.taux = 1.;
        } else {
            this.taux = taux;
        }
    }

    @Override
    public double getSeuil() {
        return seuil;
    }

    @Override
    public void setSeuil(double seuil) {
        this.seuil = seuil;
    }
}
