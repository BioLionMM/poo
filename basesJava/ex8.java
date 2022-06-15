import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        //Ecrivez un programme Java qui permet de résoudre
        // une équation du 2nd degré de la forme ax2+bx+c = 0.
        //L'utilisateur devra fournir a,b,c à partir du clavier,
        // ensuite le programme lui donnera la solution
        //Principe du fonctionnement d'une équation du 2nd degré:
        Scanner input = new Scanner(System.in);

        System.out.println("Entrez a:");
        float a= input.nextFloat();
        System.out.println("Entrez b:");
        float b= input.nextFloat();
        System.out.println("Entrez c:");
        float c= input.nextFloat();
        System.out.printf("Resolution de %.2f x^2 + %.2f x + %.2f = 0\n",a,b,c);

        double discriminant=b*b-4*a*c;
        System.out.println("Le discriminant est egal a : "+discriminant);

        if(discriminant>=0){
            float x1=(float)(-b-Math.sqrt(discriminant))/(2*a);
            float x2=(float)(-b+Math.sqrt(discriminant))/(2*a);

            System.out.printf("Solutions:\nx1=%.2f et x2=%.2f %s\n",x1,x2, discriminant==0?"une seule racine":"deux racines");
            //System.out.printf("Il y a deux solutions: %.2f et %.2f \n",
            //        (-b-Math.sqrt(discriminant))/(2*a),(-b+Math.sqrt(discriminant))/(2*a));
        }
        else{
            System.out.println("Pas de solution reelle.");
        }
//        else{
//            System.out.printf("La solution est unique et est: %.2f\n",-b/(2*a));
//        }
    }


}
