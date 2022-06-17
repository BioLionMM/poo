package tpPOOJava.echauffements;

import java.util.ArrayList;
import java.util.Scanner;

//
public class Maintp1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Renseignez un tableau:");
        int newInput=input.nextInt();
        ArrayList<Integer> tableau=new ArrayList<Integer>();
        //renvoie min, max et leur position.
        while(newInput!=-99){
            tableau.add(newInput);
            newInput=input.nextInt();
        }

        int min=99;
        int minPos=0;
        int max=-99;
        int maxPos=0;
        int currentNumber;

        for(int i=0;i<tableau.size();i++){
            currentNumber=tableau.get(i);
            if(currentNumber<min){
                min=currentNumber;
                minPos=i;
            }
            if(currentNumber>max){
                max=currentNumber;
                maxPos=i;
            }
        }

        System.out.printf("Tableau: [");

        System.out.printf("%d,",tableau.get(1));
        if(1==minPos){
            System.out.printf("(PP)");
        }
        else if(1==maxPos){
            System.out.printf("(PG)");
        }

        for(int i=1;i<tableau.size();i++){
            System.out.printf(",%d",tableau.get(i));
            if(i==minPos){
                System.out.printf("(PP)");
            }
            else if(i==maxPos){
                System.out.printf("(PG)");
            }
        }
        System.out.println("]");
    }
}
