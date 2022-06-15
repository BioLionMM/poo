import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        //si on veut une entree utilisateur
        //Scanner saisieUtilisateur = new Scanner(System.in);
        //System.out.println("Veuillez saisir votre age :");
        //int age= saisieUtilisateur.nextInt();

        int age = 10;
        //Obtenir l’age tapé par l’utilisateur.
        if (age < 7) {
            System.out.println("invalide");
        } else if (age < 10) {
            System.out.println("poussin");
        } else if (age < 12) {
            System.out.println("pupille");
        } else if (age < 14) {
            System.out.println("benjamin");
        } else if (age < 16) {
            System.out.println("minime");
        } else if (age < 18) {
            System.out.println("cadet");
        }
    }

}
