package fr.banque;

/**
 * Représente un compte banquaire.
 */
public class Compte implements ICompte {
    private final int numero;
    protected double solde = 0;

    public Compte(int numero){
        this(numero, 0);
    }

    /**
     * Constructeur complet pour la création d'un compte banquaire.
     * @param numero du compte. Il dit être unique.
     * @param solde du compte.
     */
    public Compte(int numero, double solde){
        this.numero = numero;
        this.solde = solde;
    }

    @Override
    public int getNumero() {
        return numero;
    }

    @Override
    public double getSolde() {
        return solde;
    }

    @Override
    public void setSolde(double solde) {
        this.solde = solde;
    }

    /**
     * Ajoute un <i>montant</i> au solde du compte.
     * Peut aussi retirer si la somme est negative.
     * @param montant
     */
    @Override
    public void ajouter(double montant){
        if(montant < 0){
            System.out.println("Vous ne pouvez pas ajouter de l'argent negatif.");
        } else {
            this.solde += montant;
        }
    }

    /**
     * Retirer un <i>montant</i> du solde du compte.
     * @param montant à retirer
     */
    @Override
    public void retirer(double montant){
        this.solde -= montant;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "numero=" + numero +
                ", solde=" + solde +
                '}';
    }
}
