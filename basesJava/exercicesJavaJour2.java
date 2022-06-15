import java.util.Scanner;
public class exercicesJavaJour2 {
    //Exercice 7
    //Ecrivez un programme Java qui lit un nombre et
    // indique s'il est positif, négatif ou s'il vaut zéro et s'il est pair ou impair.
    //Exemple d'exécution:
    //Entrez un nombre entier: 5
    //Le nombre est positif et impair
    //Entrez un nombre entier: -4
    //Le nombre est négatif et pair
    //Entrez un nombre entier: 0
    //Le nombre est zéro (et il est pair)
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Entrez un nombre:");

        int nombre=input.nextInt();
        boolean pairBool=false;
        boolean positifBool=false;

        if(nombre==0){
            pairBool=true;
            System.out.println("Le nombre est zero et est pair.");
        }
        else if(nombre>0){
            positifBool=true;
            if(nombre%2==0){
                pairBool=true;
                //System.out.println("Le nombre est positif et pair.");
            }
            else{
                pairBool=false;
                //System.out.println("Le nombre est positif et impair.");
            }
        }
        else{
            //negatif
            positifBool=false;
            if(nombre%2==0){
                //System.out.println("Le nombre est negatif et pair.");
                pairBool=true;
            }
            else{
                //System.out.println("Le nombre est negatif et impair.");
                pairBool=false;
            }
        }
        System.out.printf("Le nombre est %s et %s.",
                positifBool ? "positif" : "negatif",
                pairBool ? "pair" : "impair.");
    }



}
