package fr.banque;

public class CompteRemunere extends Compte implements ICompteRemunere {
    private double taux;

    public CompteRemunere(int numero, double taux) {
        this(numero, 0, taux);
    }

    public CompteRemunere(int numero, double solde, double taux) {
        super(numero, solde);
        this.setTaux(taux);
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
    public double calculerInterets(){
        return this.solde * this.taux;
    }

    @Override
    public void verserInterets(){
        this.solde += this.calculerInterets();
    }

    public String toString() {
        return "CompteRemunere{" +
                "numero=" + this.getNumero() +
                ", taux=" + taux +
                ", solde=" + solde +
                '}';
    }
}
