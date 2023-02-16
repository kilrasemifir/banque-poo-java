package fr.banque;

public class CompteASeuilRemunere extends CompteRemunere implements ICompteASeuil{
    private double seuil;

    public CompteASeuilRemunere(int numero, double taux) {
        this(numero, 0, taux, 0);
    }

    public CompteASeuilRemunere(int numero, double solde, double taux, double seuil) {
        super(numero, solde, taux);
        this.seuil = seuil;
    }

    @Override
    public double getSeuil() {
        return seuil;
    }

    @Override
    public void setSeuil(double seuil) {
        this.seuil = seuil;
    }

    @Override
    public void retirer(double montant) {
        if (this.solde - montant < this.seuil){
            System.out.println("Vous n'avez pas assez d'argent!!");
        } else {
            this.solde -= montant;
        }
    }
}
