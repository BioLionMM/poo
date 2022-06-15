import java.util.Scanner;
import java.util.Arrays;

public class ex16 {
    public static void main(String[] args) {
        /*Ecrire un programme Java qui demande à l'utilisateur de remplir un tableau d'entiers à partir du clavier.
        Puis le programme devra lui demander d'entrer un nombre à rechercher dans le tableau.
        Si nombre existe, le programme lui dira que le nombre existe et le nombre de
        fois qu'ils se retrouve dans le tableau
        Sinon le programme lui dira que le nombre recherché n'existe pas dans le tableau
        Ex : tableau saisi à partir du clavier : 12,45,6,7,12,23,33,6,22,3,6
         ->Entrer un nombre à rechercher : 6
        ->6 existe et se retrouve 3 fois dans le tableau*/
        var input = new Scanner(System.in);

        System.out.println("Combien d'elements dans le tableau?");
        int taille = input.nextInt();
        int nouvelElmnt = 0;

        //on remplit le tableau
        int[] tableau = new int[taille];
        for (int i = 0; i <= taille - 1; i++) {
            System.out.printf("Entrez un element:");
            nouvelElmnt = input.nextInt();
            tableau[i] = nouvelElmnt;
        }

        //recherche d'un element.
        System.out.println("Quel element rechercher?");
        int entierARechercher = input.nextInt();
        int nbreOccurences=0;
        for (int i = 0; i <= taille - 1; i++) {
            if(tableau[i]==entierARechercher){
                nbreOccurences++;
            }
        }
        if(nbreOccurences>0){
            System.out.printf("Le nombre %d existe et est %d fois dans le tableau.\n",
                    entierARechercher,nbreOccurences);
        }
        else{
            System.out.printf("Le nombre %d n'est pas dans le tableau.\n",
                    entierARechercher);
        }


        /*Si nombre existe, le programme lui dira que le nombre existe et le nombre de
        fois qu'ils se retrouve dans le tableau
        Sinon le programme lui dira que le nombre recherché n'existe pas dans le tableau*/


    }
}
