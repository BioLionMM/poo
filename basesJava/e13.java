import java.util.Scanner;

public class e13 {
    public static void main(String[] args) {
       /* Le nombre de fois que l'utilisateur peut saisir des mauvais identifiants est limité à 5, ensuite le programme va s'arrêter avec un message disant.

        "Vous avez saisi des mauvais identifiants x fois, votre compte est bloqué".
    */
        Scanner input = new Scanner(System.in);

        System.out.println("Choisissez une adresse mail:");
        String email = input.nextLine();
        System.out.println("Choisissez un mot de passe:");
        String motdepasse = input.nextLine();

        String emailE;
        String motdepasseE;
        int nbEssai=0;

        do{
            System.out.println("Ecrivez votre adresse mail:");
            emailE = input.nextLine();
            System.out.println("Ecrivez votre mot de passe:");
            motdepasseE = input.nextLine();
            if((!emailE.equals(email)) || (!motdepasseE.equals(motdepasse))){
                System.out.println("Identifiants incorrects. Veuillez recommencer.");
                nbEssai++;
            }
            else{
                System.out.println("Identifiants corrects!");
                break;
            }
        }while(nbEssai<5);

        if(nbEssai>=5){
            System.out.println("5 essais incorrects, votre compte est bloque.");
        }
    }
}
