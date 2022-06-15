import java.util.Scanner;

class e17 {
    public static void main(String[] args) {
        /*TP 17.
        Ecrire un programme Java demande à l'utilisateur de
        saisir un text et qui ensuit, retourne la chaine inverse.

        Ex:

        Votre chaine : mamy

        Résultat : ymam*/
        Scanner input=new Scanner(System.in);
        System.out.println("Entrez un mot:");
        String mot=input.nextLine();

        for(int i=0;i<mot.length();i++){
            System.out.printf("%c",mot.charAt(mot.length()-i-1));
        }
    }
}