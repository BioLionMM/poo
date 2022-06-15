package basesJava;

import java.util.ArrayList;
import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        /*TP 21.

        Ecrire un programme Java demande à l'utilisateur de saisir  liste de langages de programmations à partir du clavier.

        Une fois le tableau rempli, l'utilisateur sera appelé à saisir les noms des langages qu'il souhaite retirer de liste.

        Le programme devra ensuite retirer ces langages et afficher l'état du tableau avant et après la suppression.*/

        Scanner input=new Scanner(System.in);
        String nextEntry;


        ArrayList<String> langagesDeProgrammation=new ArrayList<>();


        System.out.println("Saisissez une liste de langages de programmation separes par des retours a la ligne. " +
                "Ecrivez N quand vous avez termine. \n Saisissez un langage: ");
        nextEntry=input.nextLine();
        while(!nextEntry.equals("N")){
            langagesDeProgrammation.add(nextEntry);
            nextEntry=input.nextLine();
        }

        ArrayList<String> langagesDeProgrammationApresSuppression = (ArrayList<String>) langagesDeProgrammation.clone();

        if (langagesDeProgrammation.size()>0){
            System.out.println("Saisissez les langages que vous voulez retirer separes par des retours a la ligne. "+
                    "Ecrivez N quand vous avez termine. \n Saisissez un langage: ");
            nextEntry=input.nextLine();
            while(!nextEntry.equals("N")){
                langagesDeProgrammationApresSuppression.remove(nextEntry);
                nextEntry=input.nextLine();
            }
        }


        System.out.println("Avant suppression:");
        for(int i=0;i<langagesDeProgrammation.size();i++){
            System.out.println(langagesDeProgrammation.get(i));
        }

        if (langagesDeProgrammation.size()>0) {
            System.out.println("Apres suppression:");
            for (int i = 0; i < langagesDeProgrammationApresSuppression.size(); i++) {
                System.out.println(langagesDeProgrammationApresSuppression.get(i));
            }
        }

    }
}
