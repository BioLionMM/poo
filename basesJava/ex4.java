import java.util.Scanner;
public class ex4 {
    //effectue une permutation de trois variables:
    //a devient c, b devient a, et c devient b.
    // pour eviter de perdre la valeur de b quand b prend la valeur de a,
    // on la stocke dans intermediaire.
    // donc quand c devient b, on lui met l'ancienne valeur de b,
    // donc intermediaire.

    public static void main(String[] args) {
        int a=51;
        int b=876;
        int c=235;
        int intermediaire = b;
        b = a;
        a = c;
        c = intermediaire;

        System.out.println("Les valeurs permutées sont : a=" + a + ",b=" + b + " et c=" + c);
    }
}
