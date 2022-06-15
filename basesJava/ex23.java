package basesJava;

import java.util.*;

public class ex23 {
    public static void main(String[] args) {
        /*
        Ecrire un programme Java qui permet à l'utilsation de déclarer 2 tableaux:
        1 tableau correspondant au numéro du jour de la semaine(ex : 1 pour Lundi)(de 1 a 7)
        1 tableau correspondant au nom des jours de la semaine(Ex : Lundi)
        Associer les 2 informations dans un HashMap
        Pas de doublons
        Permettre à l'utilisation d'associer via un HasMap le numéro correspondant au jour et le jour de la semaine correspondant.
        Pour les jours de la semaine et le numéros correspondant, veuillez stocker les données dans des Set(recherche sur internet)*/
        int[] numerosSemaine=new int[7];
        String[] joursSemaine=new String[7];

        Scanner input=new Scanner(System.in);

        System.out.println("Entrez les numeros des jours de la semaine dans l'ordre.");
        int nextNum=input.nextInt();
        int i=0;

        while(i<6){
            if(nextNum<8 && nextNum>0) {
                numerosSemaine[i] = nextNum;
                i++;
            }
            else{
                System.out.println("erreur: Entrez un numero entre 1 et 7.");
            }
            nextNum=input.nextInt();
        }
        if(nextNum<8 && nextNum>0) {
            numerosSemaine[i] = nextNum;
        }


        System.out.println("Entrez les jours de la semaine dans l'ordre.");
        String[] joursValides={"Lundi","Mardi","Mercredi","Jeudi","Vendredi","Samedi","Dimanche"};
        input.nextLine();
        String nextDay=input.nextLine();
        i=0;
        while(i<6){
            if(Arrays.asList(joursValides).contains(nextDay)){
                joursSemaine[i]=nextDay;
                i++;
            }
            else{
                System.out.println("erreur: Ecrivez un jour valide.");
            }
            nextDay=input.nextLine();
        }

        if(Arrays.asList(joursValides).contains(nextDay)){
            joursSemaine[i]=nextDay;
        }

        //numerosSemaine={1,2,3,4,5,6,7};
        //joursSemaine= {"Lundi","Mardi","Mercredi","Jeudi","Vendredi","Samedi","Dimanche"};

        HashMap<Integer,String> correspJoursSemaine=new HashMap<Integer,String>();

        for(int j:numerosSemaine){
            correspJoursSemaine.put(j,joursSemaine[j-1]);
        }

        System.out.println(correspJoursSemaine);

        System.out.println("Entrez un numero: ");
        int numEntre=input.nextInt();
        String joursCorresp=correspJoursSemaine.get(numEntre);
        System.out.printf("Le jour correspondant est: %s\n",joursCorresp);

        /*ArrayList arlistNum = new ArrayList(Arrays.asList(numerosSemaine));
        ArrayList arlistJours = new ArrayList(Arrays.asList(joursSemaine));

        //avec les sets
        Set<Integer> setNumerosSemaine = new HashSet<Integer>(arlistNum);
        Set<String> setJoursSemaine = new HashSet<String>(arlistJours);*/

    }
}
