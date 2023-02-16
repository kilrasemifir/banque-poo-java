package fr.banque;

public interface ICompteRemunere extends ICompte {
    double getTaux();

    void setTaux(double taux);

    default double calculerInterets(){
        return this.getSolde()*this.getTaux();
    }

    default void verserInterets(){
        this.ajouter(this.calculerInterets());
    }
}
