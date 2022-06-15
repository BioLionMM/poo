import java.util.Scanner;

public class e12bis {
    public static void main(String[] args) {
        /*
        Ecrire un programme Javascript qui permet à l'utilisateur de définir une adresse email et un mot de passe.

        Ensuite dans un second temps, il sera demandé à l'utilisateur de fournir l'email et le mot de passe:

        Si l'email et le mot de passe ne correspondent pas aux valeurs définies,
        le message "Identifiants incorrect devra s'afficher", et l'utilisateur devra recommencer la saisie des valeurs.

        Sinon, le message "Bienvenue dans votre espace client" devra s'afficher.*/
        Scanner input = new Scanner(System.in);

        System.out.println("Choisissez une adresse mail:");
        String email = input.nextLine();
        System.out.println("Choisissez un mot de passe:");
        String motdepasse = input.nextLine();

        String emailE;
        String motdepasseE;

        do{
            System.out.println("Ecrivez votre adresse mail:");
            emailE = input.nextLine();
            System.out.println("Ecrivez votre mot de passe:");
            motdepasseE = input.nextLine();
            if((!emailE.equals(email)) || (!motdepasseE.equals(motdepasse))){
                System.out.println("Identifiants incorrects. Veuillez recommencer.");
            }
            else{
                System.out.println("Identifiants corrects!");
                break;
            }
        }while(true);

    }
}
