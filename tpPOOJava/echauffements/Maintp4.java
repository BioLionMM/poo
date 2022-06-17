package tpPOOJava.echauffements;

import java.util.ArrayList;
import java.util.Scanner;

public class Maintp4 {
    public static void main(String[] args) {
        //met en majuscule les premieres lettres de chaque mot
        Scanner input=new Scanner(System.in);
        System.out.println("Saisissez une phrase: ");
        String phrase=input.nextLine();

        String[] phraseSplit=phrase.split(" ");
        System.out.println("Resultat: ");
        for(String mot: phraseSplit){
            String cap = mot.substring(0, 1).toUpperCase() + mot.substring(1,mot.length());
            System.out.printf("%s ",cap);
        }
        System.out.printf("\n");
    }
}
