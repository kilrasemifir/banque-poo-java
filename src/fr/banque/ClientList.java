package fr.banque;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClientList {

    private int numero;
    private String nom;
    private String prenom;
    private int age;
    private List<Compte> comptes = new ArrayList<>();

    public ClientList(int numero, String nom, String prenom, int age) {
        this.numero = numero;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public int getNumero() {
        return numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Recherche un compte parmit la liste des comptes du client en fonction
     * de son numero de compte. Si aucun compte n'est trouvé, affiche
     * un message dans la console pour le notifier qu'il y a un probléme
     * et retourne null
     * @param numeroCompte numero de compte.
     * @return un compte ou null
     */
    public Compte getCompte(int numeroCompte){
        var res = this.comptes.stream()
                .filter(cpt -> cpt.getNumero() == numeroCompte).findFirst();
        return res.orElseThrow(()->new BanqueException("Aucun compte ne porte ce numero!"));

    }

    public void ajouterCompte(Compte compte){
        if (this.comptes.size() <5){
            this.comptes.add(compte);
        }else {
            throw new BanqueException("Vous avez deja 5 comptes");
        }
    }

    @Override
    public String toString() {
        return "Client{" +
                "numero=" + numero +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", comptes=" + comptes +
                '}';
    }

}
