package tpPOOJava.echauffements;

public class Maintp7 {

    static char[] tableauCaracteresAlterneMajMin(char[] tableauInitial){
        char[] tableauAlterne=new char[tableauInitial.length];
        for(int i = 0;i<tableauInitial.length;i++){
            if(i%2==0){
                tableauAlterne[i]=tableauInitial[i];
            }
            else{
                tableauAlterne[i]=Character.toUpperCase(tableauInitial[i]);
            }
        }
        return tableauAlterne;
    }

    public static void main(String[] args) {
        /*Écrire une méthode Java qui prend en paramètre un tableau de caractères.

         Et qui va ensuite retourner un nouveau tableau avec une alternance entre les lettres en Maj et Min.
        */
        char[] tableauExemple={'u','n','l','a','p','i','n'};
        char[] tableauExempleRes=tableauCaracteresAlterneMajMin(tableauExemple);

        System.out.println(tableauExempleRes);
    }
}
