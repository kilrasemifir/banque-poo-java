package fr.banque2;

public class CompteASeuilRemunere
        extends CompteRemunereImpl
        implements CompteASeuil {
    private double seuil;

    public CompteASeuilRemunere(int numero, double taux) {
        this(numero, 0, taux, 0);
    }

    public CompteASeuilRemunere(int numero, double solde, double taux, double seuil) {
        super(numero, solde, taux);
        this.seuil = seuil;
    }

    public double getSeuil() {
        return seuil;
    }

    public void setSeuil(double seuil) {
        this.seuil = seuil;
    }

    public void retirer(double montant) {
        if (this.solde - montant < this.seuil){
            System.out.println("Vous n'avez pas assez d'argent!!");
        } else {
            this.solde -= montant;
        }
    }
}
