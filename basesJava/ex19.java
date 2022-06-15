
import java.util.Scanner;

class e19
{
    public static void main(String[] args) {

        /*TP 19.
        Ecrire un programme java qui demande à l'utilisateur
        de remplir une matrice carré 4 x 4 et qui ensuite va calculer la somme des elements de la diagonale*/


        Scanner input=new Scanner(System.in);

        System.out.print("Nombre de lignes : ");
        int taille=input.nextInt();

        //int[][] matrice=new int[taille][taille];

        int[][] matrice=new int[4][4];
        int sommeDiagonale=0;
        int somme=0;

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.printf("matrice[%d][%d] : ",i,j);
                matrice[i][j]=input.nextInt();
                if(i==j){
                    somme=somme+matrice[i][j];
                }
            }
        }
        System.out.println("Somme de la diagonale="+somme);

    }
}
