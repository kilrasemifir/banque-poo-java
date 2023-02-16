package fr.banque;

public class Main {

    public static void main(String[] args) {
        Compte compte = new Compte(1);
        CompteRemunere compteRemunere = new CompteRemunere(2, 100, 0.20);
        compteRemunere.verserInterets();
        System.out.println(compteRemunere);
        Client client = new Client(1, "Jean", "Michmich", 20);
        Compte compte1 = client.getCompte(2);
        client.ajouterCompte(compte);
        System.out.println(client);
        System.out.println(client.getCompte(1));
        client.ajouterCompte(new Compte(2));
        System.out.println(client);
    }
}
