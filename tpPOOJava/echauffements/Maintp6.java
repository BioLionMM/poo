package tpPOOJava.echauffements;

import java.util.HashMap;
import java.util.Scanner;

public class Maintp6 {
    public static void main(String[] args) {
        /*Écrire une méthode Java qui prend en paramètre un tableau 2D, et un nombre.

        La méthode devrait nous retourner la valeur correspond au nombre de fois
        que ce nombre se trouve dans le tableau et ses différentes positions.
        */
        Scanner input=new Scanner(System.in);
        System.out.println("Nombre de lignes?");
        System.out.println("Nombre de colonnes?");
        int nbreLignes=2;
        int nbreColonnes=3;
        HashMap<Integer,Integer> compteNbre=new HashMap<Integer,Integer>();
        HashMap<Integer,String> getPosNbre=new HashMap<Integer,String>();

        System.out.println("Quel nombre chercher?");
        int nbreAChercher=1;
        int currentNb;

        int[][] tableau={{1,1,2},{2,5,1}};
        for(int i=0;i<nbreLignes;i++){
            for(int j=0;j<nbreColonnes;j++){
                currentNb=tableau[i][j];
                if(compteNbre.containsKey(currentNb)){
                    compteNbre.put(currentNb,compteNbre.get(currentNb)+1);
                    getPosNbre.put(currentNb,getPosNbre.get(currentNb)+", ("+i+","+j+")");
                }
                else{
                    compteNbre.put(currentNb,1);
                    getPosNbre.put(currentNb,"("+i+","+j+")");
                }

            }//end for
        }//end for lignes

        System.out.printf("Le nombre %d est trouve %d fois aux positions:\n %s",
                nbreAChercher,compteNbre.get(nbreAChercher),getPosNbre.get(nbreAChercher));
    }
}
