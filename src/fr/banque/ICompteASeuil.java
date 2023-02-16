package fr.banque;

public interface ICompteASeuil extends ICompte {
    double getSeuil();

    void setSeuil(double seuil);

    @Override
    default void retirer(double montant){
        if (this.getSolde() - montant < this.getSeuil()){
            System.out.println("Vous n'avez pas assez d'argent!!");
        } else {
            this.setSolde(this.getSolde() - montant);
        }
    }
}
