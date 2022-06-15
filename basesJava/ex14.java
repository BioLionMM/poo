import java.util.Scanner;
import java.util.regex.*;

public class ex14 {
    public static void main(String[] args) {
        //Ajouter une validation de type de donnees
        // pour que le code PIN saisi ne soit compose que des chiffres
        Scanner input = new Scanner(System.in);

        System.out.println("Choisissez une adresse mail:");
        String email = input.nextLine();

        String motdepasse;
        boolean checkNumeric=false;

        while(true){
            System.out.println("Le mot de passe doit etre numerique.");
            System.out.println("Choisissez un mot de passe de type numerique:");
            motdepasse = input.nextLine();
            if(motdepasse.length()!=4){
                System.out.println("Le mot de passe doit avoir 4 caractères.");
                continue;
            }
            checkNumeric=motdepasse.matches("[+-]?\\d*(\\.\\d+)?");
            if(checkNumeric){
                System.out.println("Le mot de passe est valide.\nMaintenant, connectez vous.");
                break;
            };
        }

        String emailE;
        String motdepasseE;
        int nbEssai=0;

        do{
            System.out.println("Ecrivez votre adresse mail:");
            emailE = input.nextLine();
            System.out.println("Ecrivez votre mot de passe:");
            motdepasseE = input.nextLine();
            if((emailE.equals(email)) && (motdepasseE.equals(motdepasse))){
                System.out.println("Identifiants corrects! Vous etes connecte.");
                break;
            }
            System.out.printf("Identifiants incorrects. Veuillez recommencer. Nb d'essais restant: %d\n",5-nbEssai);
            nbEssai++;
        }while(nbEssai<5);

        if(nbEssai>=5){
            System.out.println("5 essais incorrects, votre compte est bloque.");
        }
    }
}
