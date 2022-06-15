import java.util.Arrays;
import java.util.Scanner;

public class pointeursTableaux {
    public static void main(String[] args) {
        int b;
        //        System.out.println(b);

        //Tableau d'entiers(int/byte/short) Java initialise toutes les cellules par 0
        //Tableau de floats/double Java initialise toutes les cellules par 0.0
        //Tableau de booleans Java initialise toutes les cellules par false
        //Tableau de String Java initialise toutes les cellules par null(un objet qui
        // ne pointe vers rien)

        int[] a=new int[5];
        System.out.print("Affichage de l'adress stockée dans a : ");
        System.out.print(a);

        System.out.println();
        System.out.println("Affichage du tableau :"+ Arrays.toString(a));

        int[] nombres=new int[3];
        nombres[0]=12;
        nombres[1]=15;
        nombres[2]=20;
        System.out.println("Affichage tableau nombre1 :"+ Arrays.toString(nombres));

        int[] nombres2=nombres;
        nombres2[0]=33;

        System.out.println("Affichage tableau nombre1 après création de nombre 2 :"+ Arrays.toString(nombres));

        if(nombres==nombres2){
            System.out.println("Les 2 tableau pointent vers un même tableau");
        }

        int[] nombres3=new int[3];
        nombres3[0]=33;
        nombres3[1]=15;
        nombres3[2]=20;

        System.out.println("Affichage nombre 3 : "+Arrays.toString(nombres3));

        if(nombres==nombres3){
            System.out.println("nombre et nombre3 pointent vers le même tableau");
        }else{
            System.out.println("nombre et nombre3 ne pointent pas vers le même tableau");
        }


        //specifiques aux string
        Scanner input=new Scanner(System.in);
        String nom="Jordan";
        String nom2="Jordan";
        if(nom==nom2){
            System.out.println("nom pointe vers le même string que nom2");
        }else{
            System.out.println("nom ne pointe pas vers le même string que nom2");
        }

        System.out.println();
        System.out.print("Entrez un nom : ");
        String nom3=input.nextLine();
//        Ce test va être évalué à false
//        Parce que les strings fournis à partie du clavier ne sont pas stockés dans le
//        pool des littéraux
        System.out.println("Test avant  d'ajouter nom3 dans le pool des " +
                "littéraux\n============================");
        if(nom==nom3){
            System.out.println("nom pointe vers le même string que nom3");
        }else{
            System.out.println("nom ne pointe pas vers le même string que nom3");
        }
        System.out.println("Tester les valeurs stockées par 2 strings");

//        Test des valeurs de 2 strings
        if(nom.equals(nom3)){
            System.out.println("nom contient le même string que nom3");
        }else{
            System.out.println("nom ne contient pas le même string que nom3");
        }

        System.out.println();
        System.out.println("Test après avoir ajouté nom3 dans le pool des " +
                "littéraux\n=============================");
        nom3=nom3.intern();
        if(nom==nom3){
            System.out.println("nom pointe vers le même string que nom3");
        }else{
            System.out.println("nom ne pointe pas vers le même string que nom3");
        }



        //manipulation de chaines de caracteres
        nom="Maeva";

//        variable.charAt() : Retourne le caractère à la position passé en argument
        System.out.println(nom.charAt(2));//Access à un caractère du tableau

//        Parcourir un string caractère par caractère
        System.out.println("Itération sut les charactères\n====================");
        for(int i=0;i<nom.length();i++){
            System.out.println(nom.charAt(i));
        }

//        variable.indexOf() : Retourne la première occurence de l'index du caractère
//        passé en argument
        System.out.println(nom.indexOf('a'));

//        Remplacement des caractères
        nom2="abracadabra";
        System.out.println(nom2.replace('a','*'));

//        Extraire une sous-chaine :  Christian Lisangola
        String chaine="Christian Lisangola";
        String chaine2=chaine.substring(2,9);//[2,9[
        System.out.println(chaine2);
    }
}