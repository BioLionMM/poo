import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        /*Écrivez un programme Tables.java affichant les tables de multiplication de 2 à 10.
    Votre programme devra produire la sortie suivante à l'écran :

    Tables de multiplication

    Table de 2 :
            1 * 2 = 2
            ...
            10 * 2 = 20
            ...
    Table de 5 :
            1 * 5 = 5

     */
        Scanner input = new Scanner(System.in);
        System.out.println("Entrez la premiere table:");
        int startNb=input.nextInt();
        System.out.println("Entrez la deuxieme table:");
        int endNb=input.nextInt();
        System.out.println("Entrez a:");
        int a=input.nextInt();
        System.out.println("Entrez b:");
        int b=input.nextInt();

        for(int i=startNb; i<=endNb; i+=1){
            System.out.printf("\nTable de %d:\n",i);
            for(int j=a; j<=b;j+=1){
                System.out.printf("%d x %d =%d\n",i,j,i*j);
            }
        }
    }
}
