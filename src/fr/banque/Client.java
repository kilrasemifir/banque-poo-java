package fr.banque;

import java.util.Arrays;

public class Client {

    private int numero;
    private String nom;
    private String prenom;
    private int age;
    private Compte[] comptes = new Compte[5];

    public Client(int numero, String nom, String prenom, int age) {
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
        for(Compte compte: this.comptes){
            if (compte!= null && numeroCompte == compte.getNumero() ){
                return compte;
            }
        }
        throw new BanqueException("Aucun compte ne porte ce numero!");
    }

    public void ajouterCompte(Compte compte){
        for (int index = 0; index < 5; index++) {
            if (this.comptes[index] == null){
                this.comptes[index] = compte;
                return;
            }
        }
        throw new BanqueException("Vous avez deja 5 comptes");
    }

    @Override
    public String toString() {
        return "Client{" +
                "numero=" + numero +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", comptes=" + Arrays.toString(comptes) +
                '}';
    }

    public void ajouterComptev2(Compte compte){
        boolean placer = false;
        for (int index = 0; index < 5; index++) {
            if (this.comptes[index] == null){
                this.comptes[index] = compte;
                placer = true;
                break;
            }
        }
        if (!placer){
            System.out.println("Vous avez deja 5 comptes");
        }


    }
}
