package tpPOOJava.echauffements;

import java.util.HashMap;
import java.util.Scanner;

public class Maintp5 {
    public static void main(String[] args) {
        //entrer une phrase
        //reperer les doublons de caracteres et de mots
        //les retirer.
        //afficher le resultat
        Scanner input=new Scanner(System.in);
        System.out.println("Saisissez une phrase: ");
        String phrase=input.nextLine();
        String phraseSansDoublons="";

        HashMap<Character, Integer> compteCaracteres=new HashMap<Character, Integer>();

        for(int i=0;i<phrase.length();i++){
            if(compteCaracteres.containsKey(phrase.charAt(i))){
                compteCaracteres.put(phrase.charAt(i),compteCaracteres.get(phrase.charAt(i))+1);
            }
            else{
                compteCaracteres.put(phrase.charAt(i),1);
                phraseSansDoublons=phraseSansDoublons+phrase.charAt(i);
            }
        }//end for on characters.


        System.out.printf("Pour la phrase suivante:\n%s\nLa phrase sans doublons est %s.\n ",phrase,phraseSansDoublons);
        for(char caractere : compteCaracteres.keySet()){
            System.out.printf("%s : %d\n",caractere,compteCaracteres.get(caractere));
        }

        //pour supprimer les mots
        String[] listeMots=phrase.split(" ");
        String phraseSansMotsDoublons="";

        HashMap<String, Integer> compteMots=new HashMap<String, Integer>();

        for(int i=0;i<listeMots.length;i++){
            if(compteMots.containsKey(listeMots[i])){
                compteMots.put(listeMots[i],compteMots.get(listeMots[i])+1);
            }
            else{
                compteMots.put(listeMots[i],1);
                phraseSansDoublons=phraseSansDoublons+" "+listeMots[i];
            }
        }//end for on characters.


    }
}
