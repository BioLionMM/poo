package tpPOOJava.tp8a9;

public class Maintp9 {

    static boolean deuxCaracteresSeSuivent(String mot){
        char currentChar=mot.charAt(0);
        for(int i=1;i<mot.length();i++){
            if(mot.charAt(i)==currentChar){
                return true;
            }
            else{
                currentChar=mot.charAt(i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        /*Recherche de caractères identiques dans une rangée
        On vous donne une chaîne de caractères d'un seul mot comme argument.
        Vous retournerez true si elle contient deux caractères identiques dans une rangée,
        c’est-à-dire qui se suivent, sinon elle retournera false.
        */

        String motExemple="chat";
        String motExemple2="chat!!";
        if(deuxCaracteresSeSuivent(motExemple)){
            System.out.println("Vrai pour "+motExemple);
        }else{
                System.out.println("Faux pour "+motExemple);
        }
        if(deuxCaracteresSeSuivent(motExemple2)){
            System.out.println("Vrai pour "+motExemple2);
        }else{
            System.out.println("Faux pour "+motExemple2);
        }


    }
}
