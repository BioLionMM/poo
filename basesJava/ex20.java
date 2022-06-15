
import java.util.Scanner;

class e20 {
    public static void main(String[] args) {
/* TP 19.
        Ecrire un programme java qui demande à l'utilisateur de remplir une matrice carré 4 x 4 et qui ensuite va calculer la somme des elements de la diagonale
        TP 20.
        A partir du TP précédent, ajouter le calcul de la somme de 2 diagonales*/


        Scanner input=new Scanner(System.in);

        System.out.print("Nombre de lignes : ");
        int taille=input.nextInt();

        int[][] matrice=new int[taille][taille];
        int somme=0;
        int somme2=0;



        for(int i=0;i<taille;i++){
            for(int j=0;j<taille;j++){
                System.out.printf("matrice[%d][%d] : ",i,j);
                matrice[i][j]=input.nextInt();
                if(i==j){
                    somme=somme+matrice[i][j];
                }
                if(j==taille-i-1){
                    somme2=somme2+matrice[i][j];
                }
            }
        }
        System.out.println("Somme de la première diagonale="+somme);
        System.out.println("Somme de la deuxieme diagonale="+somme2);

    }
}
