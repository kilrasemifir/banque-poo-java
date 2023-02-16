package fr.banque2;

public class Main {

    public static void main(String[] args) {
        CompteImpl compte = new CompteImpl(1);
        CompteRemunereImpl compteRemunere = new CompteRemunereImpl(2, 100, 0.20);
        compteRemunere.verserInterets();
        System.out.println(compteRemunere);
        Client client = new Client(1, "Jean", "Michmich", 20);
        Compte compte1 = client.getCompte(2);
        client.ajouterCompte(compte);
        System.out.println(client);
        System.out.println(client.getCompte(1));
        client.ajouterCompte(new CompteImpl(2));
        System.out.println(client);
    }
}
