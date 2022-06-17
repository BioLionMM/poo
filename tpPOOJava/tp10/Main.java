package tpPOOJava.tp10;

public class Main {
    public static void main(String[] args) {
        Tirelire maTirelire=new Tirelire(1000);
        maTirelire.afficher();
        maTirelire.puiser(500);
        maTirelire.secouer();
        maTirelire.calculerSolde(500);
        maTirelire.puiser(500);
        maTirelire.secouer();
        maTirelire.remplir(5);
        maTirelire.afficher();
    }
}
