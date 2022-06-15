/*
public class matrice {
    public static void main(String[] args) {
        //        int[] a={1,2,3,4,5};
        //        int[] a2=new int[5];

        int[][] nombres = {
                {1, 2, 6, 5},
                {2, 4, 9},
                {7, 3}
        };


//        Affichage sans boucle
        System.out.println("Affichage sans boucle\n========================");
//        Première ligne(1er tableau)
        System.out.println("1er tableau\n==========");
        System.out.println(nombres[0][0]);
        System.out.println(nombres[0][1]);
        System.out.println(nombres[0][2]);
        System.out.println(nombres[0][3]);

//        Deuxième ligne(2ème tableau)
        System.out.println("\n2ème tableau\n==========");
        System.out.println(nombres[1][0]);
        System.out.println(nombres[1][1]);
        System.out.println(nombres[1][2]);


//        Troisième ligne(3ème tableau)
        System.out.println("\n3ème tableau\n==========");
        System.out.println(nombres[2][0]);
        System.out.println(nombres[2][1]);


        System.out.println("Affichage avec la boucle " +
                "for\n==============================");

        for (int i = 0; i < nombres.length; i++) {
//            System.out.println(Arrays.toString(nombres[i]));
            for (int j = 0; j < nombres[i].length; j++) {
                System.out.println(nombres[i][j]);
            }
        }


        Scanner input=new Scanner(System.in);

        System.out.print("Nombre de lignes : ");
        int taille=input.nextInt();

        int[][] matrice=new int[taille][];
        for(int i=0;i<matrice.length;i++){
            System.out.printf("Donnez le nombre de colonne pour la ligne[%d]: ",i);
            int nombreDeColonne=input.nextInt();
            matrice[i]=new int[nombreDeColonne];
            for(int j=0;j<matrice[i].length;j++){
                System.out.printf("matrice[%d][%d] : ",i,j);
                matrice[i][j]=input.nextInt();
            }
        }


        System.out.println("Affichage de tout le tableau");
        for(int i=0;i< matrice.length;i++){
            for(int j=0;j<matrice[i].length;j++){
                System.out.print(matrice[i][j] +" ");
            }
            System.out.println();
        }

    }
}*/
