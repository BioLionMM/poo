import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        //Ecrire un programme qui permet à l'utilisateur
        // de saisir un entier entre 1 et 12 et qui affiche le nom du mois correspondant.
        Scanner input = new Scanner(System.in);
        System.out.println("Entrez un nombre entier entre 1 et 12 pour obtenir le mois correspondant: ");

        int nombre=input.nextInt();

        switch (nombre) {
            case 1:
                System.out.println("janvier");
                break;
            case 2:
                System.out.println("fevrier");
                break;
            case 3:
                System.out.println("mars");
                break;
            case 4:
                System.out.println("avril");
                break;
            case 5:
                System.out.println("mai");
                break;
            case 6:
                System.out.println("juin");
                break;
            case 7:
                System.out.println("juillet");
                break;
            case 8:
                System.out.println("aout");
                break;
            case 9:
                System.out.println("septembre");
                break;
            case 10:
                System.out.println("octobre");
                break;
            case 11:
                System.out.println("novembre");
                break;
            case 12:
                System.out.println("decembre");
                break;
            default:
                System.out.println("invalide, recommencez.");
        }
    }

}
