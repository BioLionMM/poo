import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        /*Ecrire un programme Java qui permet à l'utilisateur de déclarer 3 array d'entiers.

        Ces tableaux ne doivent pas forcément avoir la même taille

        Le programme doit ensuite fournir afficher les 3 tableaux
        en format [element1, element2,...,elementN]
        et la somme de tous les éléments multiples 3 dans les 3 tableaux.

                Ex :

        T1 : [ 2, 6, 8, 15,39,11 ]
        T2 : [ 21, 33, 12, 19,0 ]
        T3 : [ 17, 18, 46 ]

        S = 6+15+39+21+33+12+18 = 144*/
        var input = new Scanner(System.in);

        System.out.println("Combien d'elements dans T1?");
        int tailleT1=input.nextInt();
        System.out.println("Combien d'elements dans T2?");
        int tailleT2=input.nextInt();
        System.out.println("Combien d'elements dans T3?");
        int tailleT3=input.nextInt();

        int[] tableauT1=new int[tailleT1];
        int[] tableauT2=new int[tailleT2];
        int[] tableauT3=new int[tailleT3];

        int[] tableauFinal=new int[tailleT1+tailleT2+tailleT3];

        int nouvelElmnt=0;
        int sommeMult3=0;

        System.out.printf("\nT1 : ");
        for(int i=0;i<=tailleT1-1;i++){
            while (true){
                System.out.printf("%d ",i);
                nouvelElmnt=input.nextInt();
                //[0,20]
                if(nouvelElmnt>=0 && nouvelElmnt<=20){
                    tableauT1[i]=nouvelElmnt;
                    tableauFinal[i]=nouvelElmnt;
                    if(nouvelElmnt%3==0){
                        sommeMult3=sommeMult3+nouvelElmnt;
                    }
                    break;
                }
                System.out.println("Erreur:Veuillez saisir une valeur entre 0 et 20");
            }
        }

        System.out.printf("\nT2 : ");
        for(int i=0;i<=tailleT2-1;i++){
            while (true){
                System.out.printf("%d ",i);
                nouvelElmnt=input.nextInt();
                //[0,20]
                if(nouvelElmnt>=0 && nouvelElmnt<=20){
                    tableauT2[i]=nouvelElmnt;
                    tableauFinal[i+tailleT1-1]=nouvelElmnt;
                    if(nouvelElmnt%3==0){
                        sommeMult3=sommeMult3+nouvelElmnt;
                    }
                    break;
                }
                System.out.println("Erreur:Veuillez saisir une valeur entre 0 et 20");
            }
        }

        System.out.printf("\nT3 : ");
        for(int i=0;i<=tailleT3-1;i++){
            while (true){
                System.out.printf("%d ",i);
                nouvelElmnt=input.nextInt();
                //[0,20]
                if(nouvelElmnt>=0 && nouvelElmnt<=20){
                    tableauT3[i]=nouvelElmnt;
                    tableauFinal[i+tailleT1+tailleT2-2]=nouvelElmnt;
                    if(nouvelElmnt%3==0){
                        sommeMult3=sommeMult3+nouvelElmnt;
                    }
                    break;
                }
                System.out.println("Erreur:Veuillez saisir une valeur entre 0 et 20");
            }
        }
        System.out.printf("S=",sommeMult3);
        for(int i=0;i<=tableauFinal.length-1;i++) {
            if(tableauFinal[i]%3==0){
                System.out.printf("+%d",tableauFinal[i]);
            }
        }
        System.out.printf("=%d",sommeMult3);
    }
}
