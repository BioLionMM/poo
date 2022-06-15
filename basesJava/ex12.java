import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        /*Exo 12.

        Ecrire un algorithme qui demande un nombre de départ, et qui ensuite affiche les dix nombres suivants.
        Par exemple, si l'utilisateur entre le nombre 17, le programme affichera les nombres de 18 à 27.*/
        Scanner input = new Scanner(System.in);
        System.out.println("Entrez le nombre de depart:");
        int nbDepart=input.nextInt();
        int nbFin=nbDepart+11;
        for(int i=nbDepart+1;i<nbFin;i++){
            System.out.println(i);
        }
    }

}
