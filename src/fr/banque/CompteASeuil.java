package fr.banque;

public class CompteASeuil extends Compte implements ICompteASeuil {
    private double seuil;

    public CompteASeuil(int numero) {
        this(numero, 0, 0);
    }

    public CompteASeuil(int numero, double solde) {
        this(numero, solde, 0);
    }

    public CompteASeuil(int numero, double solde, double seuil) {
        super(numero, solde);
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
            throw new BanqueException("Vous n'avez pas assez d'argent!!");
        } else {
            this.solde -= montant;
        }
    }

    @Override
    public String toString() {
        return "CompteASeuil{" +
                "numero="+ getNumero() +
                ", seuil=" + seuil +
                ", solde=" + solde +
                '}';
    }
}
