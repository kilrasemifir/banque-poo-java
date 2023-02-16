package fr.banque;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ClientMap {

    private int numero;
    private String nom;
    private String prenom;
    private int age;
    private Map<Integer, Compte> comptes = new HashMap<>();

    public ClientMap(int numero, String nom, String prenom, int age) {
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
        return this.comptes.get(numeroCompte);
    }

    public void ajouterCompte(Compte compte){
        if (this.comptes.size() < 5){
            this.comptes.put(compte.getNumero(), compte);
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
}
