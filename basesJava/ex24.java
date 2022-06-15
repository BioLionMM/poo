package basesJava;

import java.util.regex.*;

public class ex24 {

    static boolean isPrefix(String a,String b){
        //if(b.matches("^"+a)) {
        if(a.substring(0,b.length()).equals(b)){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        /*TP 24.
        Ecrire une méthode Java qui prend en paramètre 2 string et qui ensuite retourne un booléen(true/false) selon que le 2ème string est le préfixe du premier ou pas.

                Ex :

        isPrefix("banner", "bang")
                > false

        isPrefix("hugging", "hug")
                > true*/
        boolean test1=isPrefix("banner","bang");
        boolean test2=isPrefix("hugging","hug");

        System.out.printf("Test 1 est %b et test 2 est %b\n",test1,test2);
    }
}
