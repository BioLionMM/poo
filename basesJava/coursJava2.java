import java.util.Scanner;
public class coursJava2 {
    public static void main(String[] args) {
        byte age = 12;
        boolean estMajeur = age >= 18;

        if (estMajeur) {
            System.out.println("Vous etes majeur");
        } else {
            System.out.println("Vous n'etes pas majeur");
        }
        String nom = "Lisangola";
        String prenom = "Christian";
        char genre = 'M';
        age = 12;
        float poids = 25.5F;
        boolean estMarie = true;

        System.out.println("Vous vous appelez " + nom + ", vous avez " + age + " ans.Poid : " + poids + "Kg");
        System.out.printf("Vous vous appelez %s %s,vous avez %d ans.Poids : %.2f\n", nom, prenom, age, poids);
        System.out.printf("Nom : %s\nPrenom : %s\nAge : %d\n\n", nom, prenom, age);

        //Avec operateur ternaire
        System.out.printf("Vous vous appelez %s %s,vous avez %d ans et vous  %s\n", nom, prenom, age, estMarie ? "etes marie" : "n'etes pas marie");

        //Sans operateur ternaire
        String etatMaritalAAfficher = estMarie ? "etes marie" : "n'etes pas marie";
        System.out.printf("Vous vous appelez %s %s,vous avez %d ans et vous  %s\n", nom, prenom, age, etatMaritalAAfficher);


        Scanner input = new Scanner(System.in);
        System.out.print("Votre nom : ");
        nom = input.nextLine();

        System.out.print("Votre prenom : ");
        prenom = input.next();


        System.out.print("Votre genre : ");
        genre = input.next().charAt(0);
        System.out.println(genre);
        //        byte age=12;
        //        float poids=25.5F;
        //        System.out.println("Bonjour");
        System.out.print("Votre nom : ");
        nom = input.nextLine();

        System.out.print("Votre prenom : ");
        prenom = input.next();

        System.out.print("Votre genre : ");
        genre = input.next().charAt(0);

        System.out.print("Votre age : ");
        age = input.nextByte();

        System.out.print("Votre poids : ");
        poids = input.nextFloat();

        System.out.printf("Nom : %s\nPrenom : %s\nGenre : %c\nAge : %d\nPoids : %.2f\n", prenom, nom, genre, age, poids);
    //maths
        double nombre=81;
        double nombre2=25;

        //Calculer la racinne carre de 81
        System.out.println(Math.sqrt(nombre));
        //Elever 25 a la puissance 3
        System.out.println(Math.pow(nombre2,3));
        System.out.println(Math.min(3,7));
        System.out.println(Math.PI);

        //declaration par inference
        //java va deduire le type de la variable
        //et prendre le plus gros stockage
        var pays="France";

        // constante : Une fois declaree la valeur ne peut plus changer
        final double g=9.8;

    }
}
