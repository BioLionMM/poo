
import java.util.Scanner;

class e18 {
    public static void main(String[] args) {

/*TP 18.
        Ecrire un programme Java demande à l'utilisateur de saisir un text et qui ensuit,
        renseigne si celui est un palindrome(mot qui se lit de la même dans les 2 sens).

        Ex :

        Entrez un text : non

        Résultat : non est un palindrome


        Entrez un text : oui

        Résultat : oui n'est pas un palindrome

        C'est quoi un palindrome?: https://www.larousse.fr/dictionnaires/francais/palindrome/57418*/

        Scanner input=new Scanner(System.in);

        System.out.println("Entrez un mot:");
        String mot=input.nextLine();
        String motInverse="";
        int longueur=mot.length();

        for(int i=0;i<mot.length();i++){
            motInverse=motInverse+mot.charAt(i);
        }
        if(mot.equals(motInverse)){
            System.out.println(mot+" est un palindrome");
        }
        else{
            System.out.println(mot+" n'est pas un palindrome.");
        }
    }
}
