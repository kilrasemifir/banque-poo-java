package fr.banque;

public interface ICompte {
    int getNumero();

    double getSolde();

    void setSolde(double solde);

    void ajouter(double montant);

    void retirer(double montant);
}
