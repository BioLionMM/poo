package procedurale;

class ProgrammationProcedurale2Refactor {
    static int sommeElementTableau(int[] tableau){
        int somme=0;
        for(int i=0;i<tableau.length;i++){
            somme =somme+tableau[i];
        }
        return somme;
    }

    public static void main(String[] args) {
        int[] tableau1={1,2,3,4,5,6,7,8,9};
        int sommeTableau1=sommeElementTableau(tableau1);

        int[] tableau2={4,5,6,7};
        int sommeTableau2=sommeElementTableau(tableau2);

        int[] tableau3={7,1,12,17};
        int sommeTableau3=sommeElementTableau(tableau3);

        int sommeTableaux=sommeTableau1+sommeTableau2+sommeTableau3;
        System.out.println(sommeTableaux);

    }
}