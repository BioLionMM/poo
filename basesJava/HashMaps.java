package basesJava;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;


public class HashMaps {
    public static void main(String[] args) {
        ArrayList<String> programmingLanguages=new ArrayList<>();
        System.out.println(programmingLanguages);

        programmingLanguages.remove("python");
        System.out.println(programmingLanguages);


        HashMap<String,String> identite=new HashMap<>();
        identite.put("nom","Lisangola");
        identite.put("prenom","Christian");


        System.out.println(identite.get("nom"));

        String phrase="je suis dans une joie immense";
//
        HashMap<Character,Integer> occurenceLettres=new HashMap<>();

        //System.out.println(occurenceLettres);

        //occurenceLettres.put("a",5);
//        System.out.println(occurenceLettres);
        for(int i=0;i<phrase.length();i++){
//            System.out.println(phrase.charAt(i));
            char key=phrase.charAt(i);
            if(occurenceLettres.containsKey(key)){
                int previousValue=occurenceLettres.get(key);
                occurenceLettres.replace(key,previousValue+1);
            }else{
                occurenceLettres.put(key,1);
            }

        }
        System.out.println(occurenceLettres);
        System.out.println("Occurence de s : "+occurenceLettres.get('s'));

        //VS:
        Scanner input=new Scanner(System.in);

        System.out.print("Combien de langages souhaitez-vous ajouter?");
        int nombreDeLangages=input.nextInt();

        input.nextLine();
        HashMap<String,String> langages=new HashMap<>();
        for(int i=1;i<=nombreDeLangages;i++){
            if(i==1){
                System.out.printf("Insérer le %der langage : ",i);
            }else{
                System.out.printf("Insérer le %dème langage : ",i);
            }
            String langage=input.nextLine();
            langages.put(langage,langage);
        }
        System.out.println(langages);

        System.out.println("Quel langage souhaitez-vous supprimer ? ");
        String langageASupprimer=input.nextLine();
        langages.remove(langageASupprimer);

        System.out.println("Après la suppression");
        System.out.println(langages);


        //HashMap<String,String> identite=new HashMap<>();
        identite.put("nom","Lisangola");
        identite.put("prenom","Christian");
        identite.put("pays","République Tchèque");


        for(Map.Entry<String,String> maVariable:identite.entrySet()){
            System.out.println(maVariable.getKey()+" => "+maVariable.getValue());
        }

        int[] nombres={1,2,3,4,5,6,7,8,9,10};

        //La boucle forEach
        for(int nombre:nombres){
            System.out.println(nombre);
        }

// ou:

        for(Map.Entry<String,String> maVariable:identite.entrySet()){
            System.out.println(maVariable.getKey()+" => "+maVariable.getValue());
        }

        nombres=new int[]{1,2,3,4,5,6,7,8,9,10};

        //La boucle forEach
        for(int nombre:nombres){
            System.out.println(nombre);
        }

    }
}
