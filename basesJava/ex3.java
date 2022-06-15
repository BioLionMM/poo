import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        //recupere nom, prenom et age et les affiche
        Scanner saisieUtilisateur = new Scanner(System.in);
        System.out.println("Veuillez saisir votre age :");
        int age= saisieUtilisateur.nextInt();
        System.out.println("Veuillez saisir votre prenom:");
        String prenom= saisieUtilisateur.next();//next prend ce qu'y a avant l'espace
        System.out.println("Veuillez saisir votre nom:");
        String nom = saisieUtilisateur.next();

        //String nom = "Babar";
        //String prenom = "Barbapapa";
        //byte age=15;
        System.out.println("Vous vous appelez " + prenom + " " + nom + " et vous avez " + age + " ans.");
    }
}
