package fr.banque2;

public class CompteASeuilImpl extends CompteImpl implements CompteASeuil {
    private double seuil;

    public CompteASeuilImpl(int numero) {
        this(numero, 0, 0);
    }

    public CompteASeuilImpl(int numero, double solde) {
        this(numero, solde, 0);
    }

    public CompteASeuilImpl(int numero, double solde, double seuil) {
        super(numero, solde);
        this.seuil = seuil;
    }

    public double getSeuil() {
        return seuil;
    }

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

    @Override
    public String toString() {
        return "CompteASeuil{" +
                "numero="+ getNumero() +
                ", seuil=" + seuil +
                ", solde=" + solde +
                '}';
    }
}
