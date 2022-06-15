package poo;

public class Personne {
    /*TP 1 POO:

    Ecrire une classe Personne qui est décrit par les données suivantes:
    firstName
            lastName
    pays
    married(booléen)
    nombreEnfants

    On doit avoir une méthode qui retourne un string nomComplet

    Dans le main, vous devez à partir du clavier demander à l'utilisateur de
    fournir toutes ces données et enfin les afficher dans main.*/
    String firstName;
    String lastName;
    String pays;
    boolean married;
    int nombreEnfants;

    void getInfos(){
        System.out.printf("%s %s \nPays: %s\nMarie?: %s\nNbre d'enfants: %d\n",firstName,lastName,
                pays, married?"oui":"non",nombreEnfants);
    }
}
