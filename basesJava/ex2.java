import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        //recupere le diametre d'un cercle
        // et calcule le rayon et la surface
        float diametre=10;
        float rayon=5;
        float pi = 3.14f;
        float surface;
        surface = rayon * rayon * pi;
        rayon = diametre / 2;
        System.out.println("La surface est "+surface+" et le rayon est "+rayon);
    }
}
