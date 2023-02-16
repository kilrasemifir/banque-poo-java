package fr.banque2;

public class CompteRemunereImpl extends CompteImpl implements CompteRemunere {
    private double taux;

    public CompteRemunereImpl(int numero, double taux) {
        this(numero, 0, taux);
    }

    public CompteRemunereImpl(int numero, double solde, double taux) {
        super(numero, solde);
        this.setTaux(taux);
    }

    public double getTaux() {
        return taux;
    }

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

    public double calculerInterets(){
        return this.solde * this.taux;
    }

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
