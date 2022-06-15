import java.util.Scanner;
public class ex5 {
    //calcule l'annee de naissance en fonction de l'age.

    public static void main(String[] args) {
        //Scanner saisieUtilisateur = new Scanner(System.in);
        //System.out.println("Veuillez saisir votre age :");
        //int age= saisieUtilisateur.nextInt();

        byte age=35;
        int anneeNaissance=0;
        anneeNaissance = 2022 - age;
        System.out.println("Votre annee de naissance est : " + anneeNaissance);
    }

}
