import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        /*Écrivez un programme Java qui demande à l'utilisateur d'entrer un nombre
        et qui ensuite va calculer et afficher la factorielle de ce nombre:
        Ex:
        Nombre : 3
        Factorielle de 3 : 3x2x1 = 6*/

        Scanner input = new Scanner(System.in);
        System.out.println("Entrez le nombre:");
        int nbFact=input.nextInt();
        if(nbFact==0){
            System.out.printf("Factorielle de 0: 1");
        }
        else{
            int nbFinal=1;
            System.out.printf("Factorielle de %d: 1",nbFact);
            for (int i=2; i<=nbFact; i=i+1)
            {
                nbFinal=nbFinal*i;
                System.out.printf("x%d",i);
            }
            System.out.printf("= %d",nbFinal);
        }

    }

}
