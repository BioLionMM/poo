package basesJava;

import java.util.Scanner;

public class tableauxV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Combien de notes voulez-vous inserer?");
        int notesAInserer=input.nextInt();//7

        float[] notesMath=new float[notesAInserer];

        for(int i=0;i<=notesMath.length-1;i++){
            System.out.printf("Notes[%d] : ",i);
            notesMath[i]=input.nextFloat();
        }

        float sommeDesNotes=0;
        for(int i=0;i<=notesMath.length-1;i++){
            sommeDesNotes=sommeDesNotes+notesMath[i];
        }

        float moyenne=sommeDesNotes/notesMath.length;
        System.out.printf("Somme : %f\nMoyenne : %f",sommeDesNotes,moyenne);
    }
}
