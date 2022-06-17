package tpPOOJava.echauffements;

import java.util.*;

public class Maintp3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Saisissez votre premier mot: ");
        String premierMot=input.nextLine();
        System.out.println("Saisissez votre deuxieme mot: ");
        String deuxiemeMot=input.nextLine();
        premierMot=premierMot.replace(" ","");
        deuxiemeMot=deuxiemeMot.replace(" ","");

        if(premierMot.length()==deuxiemeMot.length()){
            char[] premierMotCharArray=premierMot.toLowerCase().toCharArray();
            char[] deuxiemeMotCharArray=deuxiemeMot.toLowerCase().toCharArray();
            Arrays.sort(premierMotCharArray);
            Arrays.sort(deuxiemeMotCharArray);


            if(Arrays.equals(premierMotCharArray,deuxiemeMotCharArray)){
                System.out.printf("%s et %s sont des anagrammes.\n",premierMot,deuxiemeMot);
            }
            else{
                System.out.printf("%s et %s ne sont pas des anagrammes.\n",premierMot,deuxiemeMot);
            }

        }
        else{
            // longueurs differentes.
            System.out.printf("%s et %s ne sont pas des anagrammes.\n",premierMot,deuxiemeMot);
        }

    }
}
