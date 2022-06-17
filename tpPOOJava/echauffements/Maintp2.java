package tpPOOJava.echauffements;

import java.util.Scanner;

public class Maintp2 {
    public static void main(String[] args) {
        //.reverse et .parseInt()
        Scanner input=new Scanner(System.in);
        System.out.println("Ecrivez un nombre: ");
        String nombre=input.nextLine();
        String nombreInverse="";
        int nombreInverseInt;
        char currentChar;

        for(int i=0;i<nombre.length();i++){
            currentChar=nombre.charAt(i);
            nombreInverse=nombreInverse+nombre.charAt(nombre.length()-i-1);
        }

        nombreInverseInt=Integer.parseInt(nombreInverse);
        System.out.println("Votre nombre: "+nombre);
        System.out.println("Resultat: "+nombreInverseInt);

    }
}
