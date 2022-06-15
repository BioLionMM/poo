package basesJava;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;
import java.util.HashMap;

public class ex22 {
    public static void main(String[] args) {
        /*TP 22.
        Ecrire un programme Java qui remplit un tableau avec une liste des adresse email :
         christian.lisangola@gmail.com, jean.paul@gmail.com, alain@gmail.com, lydie@yahoo.fr,
          josephine.lajoie@yahoo.com, luise@hotmail.fr, philemon.turion@gmail.com, jules.cesar@hotmail.fr

        Ensuite le programme va afficher en % le taux d'adresse gmail, yahoo et hotmail.

        Essayer de le résoudre au plus, et essayer approche basé sur le HMap.*/

        ArrayList<String> adressesMail=new ArrayList<>();
        HashMap<String, ArrayList<String>> eMailsTypes= new HashMap<String, ArrayList<String>>();

        float gmail=0f;
        float yahoo=0f;
        float hotmail=0f;

        System.out.println("Entrez des addresses email separees par des retours a la ligne. \n Ecrivez N pour terminer. :");
        Scanner input=new Scanner(System.in);
        ArrayList<String> listGmail=new ArrayList<>();
        ArrayList<String> listYahoo=new ArrayList<>();
        ArrayList<String> listHotmail=new ArrayList<>();

        String nextEntry=input.nextLine();
        if(nextEntry.equals('N')){
            System.out.println("No entries.");
        }
        else{
            adressesMail.add(nextEntry);
            while(!nextEntry.equals("N")){

                if(nextEntry.matches("\\w+@gmail\\.[\\w]{2,3}$")){
                    listGmail.add(nextEntry);

                    gmail++;
                }else if(nextEntry.matches("\\w+@yahoo\\.[\\w]{2,3}$")){
                    listYahoo.add(nextEntry);
                    yahoo++;
                }else if(nextEntry.matches("\\w+@hotmail\\.[\\w]{2,3}$")){
                    listHotmail.add(nextEntry);
                    hotmail++;
                }
                adressesMail.add(nextEntry);
                nextEntry=input.nextLine();

            }

            eMailsTypes.put("gmail", listGmail);
            eMailsTypes.put("yahoo",listYahoo);
            eMailsTypes.put("hotmail",listHotmail);


            float total=(float)adressesMail.size()-1.0f;
            System.out.println(total);
            float pourcentGmail=0f;
            float pourcentYahoo=0f;
            float pourcentHotmail=0f;

            if(gmail>0){
                pourcentGmail=100*gmail/total;
            }
            if(yahoo>0){
                pourcentYahoo=100*yahoo/total;
            }
            if(hotmail>0){
                pourcentHotmail=100*hotmail/total;
            }

            //maintenant voir les proportions
            System.out.printf("Les pourcentages sont: \ngmail: %.2f\nyahoo: %.2f\nhotmail: %.2f\n\n",
                    pourcentGmail,pourcentYahoo,pourcentHotmail);
            //System.out.println(eMailsTypes.get("gmail"));
            System.out.printf("HashMap: Les pourcentages sont: \ngmail: %.2f\nyahoo: %.2f\nhotmail: %.2f\n\n",
                    100*eMailsTypes.get("gmail").size()/total,
                    100*eMailsTypes.get("yahoo").size()/total,
                    100*eMailsTypes.get("hotmail").size()/total);
        }


    }
}
