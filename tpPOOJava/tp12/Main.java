package tpPOOJava.tp12;

public class Main {
    public static void main(String[] args) {
        /*Une nouvelle souris !
            Une nouvelle souris !
            Clonage d’une souris !
            Une souris blanche de 2 mois et pesant 50 grammes
            Une souris grise de 0 mois et pesant 45 grammes
            Une souris grise, clonée, de 0 mois et pesant 45 grammes
            Une souris blanche de 36 mois et pesant 50 grammes
            Une souris grise de 36 mois et pesant 45 grammes
            Une souris verte, clonée, de 28 mois et pesant 45 grammes
            */
        Souris sourisA=new Souris(50,"blanche",2,35,false);
        Souris sourisB=new Souris(45,"grise",0,36,false);
        Souris sourisC=new Souris(sourisB);

        System.out.println(sourisA);
        System.out.println(sourisB);
        System.out.println(sourisC);

        sourisA.vieillir(1);
        sourisB.vieillir(36);
        sourisC.vieillir(28);

        System.out.println(sourisA);
        System.out.println(sourisB);
        System.out.println(sourisC);

    }
}
