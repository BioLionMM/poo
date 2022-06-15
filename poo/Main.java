package poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*System.out.println("***********");
        System.out.println("**Objet 1**");
        System.out.println("************\n");
        Rectangle terrain=new Rectangle();
        System.out.println("Etat inital de l'objet après " +
                "création\n======================");
        System.out.println("La longueur : "+terrain.longueur);
        System.out.println("La largeur : "+terrain.largeur);

        System.out.println("Etat de l'objet après avoir fourni des " +
                "valeur\n==========================");
        terrain.longueur=500;
        terrain.largeur=350;
        System.out.println("La longueur : "+terrain.longueur);
        System.out.println("La largeur : "+terrain.largeur);
        System.out.println("Surface : "+terrain.calculDeLaSurface());
        System.out.println("Perimète : "+terrain.calculDuPerimetre());


        System.out.println("***********");
        System.out.println("**Objet 2**");
        System.out.println("************\n");
        Rectangle parcelle=new Rectangle();
        System.out.println("La longueur : "+parcelle.longueur);
        System.out.println("La largeur : "+parcelle.largeur);*/

        Personne exemplePersonne=new Personne();
        Scanner input=new Scanner(System.in);

        System.out.println("Entrez nom, prenom, pays, true si vous etes marié, false sinon, puis nombre d'enfants séparés par un retour à la ligne: ");
        exemplePersonne.firstName=input.nextLine();
        exemplePersonne.lastName=input.nextLine();
        exemplePersonne.pays=input.nextLine();
        exemplePersonne.married=input.nextBoolean();
        exemplePersonne.nombreEnfants=input.nextInt();

        exemplePersonne.getInfos();
    }

}
