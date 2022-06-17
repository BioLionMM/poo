package tpPOOJava.tp11;

public class Main {
    public static void main(String[] args) {
        /*La bibliotheque municipale est ouverte !
        Nouvel exemplaire -> Les Miserables, Victor Hugo, en francais
        Nouvel exemplaire -> Les Miserables, Victor Hugo, en francais
        Nouvel exemplaire -> L’Homme qui rit, Victor Hugo, en francais
        Nouvel exemplaire -> Le Comte de Monte-Cristo, Alexandre Dumas, en francais
        Nouvel exemplaire -> Le Comte de Monte-Cristo, Alexandre Dumas, en francais
        Nouvel exemplaire -> Le Comte de Monte-Cristo, Alexandre Dumas, en francais
        Nouvel exemplaire -> Zazie dans le metro, Raymond Queneau, en francais
        Nouvel exemplaire -> The count of Monte-Cristo, Alexandre Dumas, en anglais
        */
        Bibliotheque bibliotheque=new Bibliotheque("municipale");
        Auteur auteurA=new Auteur("Victor Hugo",true);
        Auteur auteurB=new Auteur("Alexandre Dumas",true);
        Auteur auteurC=new Auteur("Raumond Queneau",false);
        Oeuvre oeuvreA=new Oeuvre("Les Miserables",auteurA,"francais");
        Oeuvre oeuvreB=new Oeuvre("L'homme qui rit",auteurA,"francais");
        Oeuvre oeuvreC=new Oeuvre("Le comte de Monte-Cristo",auteurB,"francais");
        Oeuvre oeuvreD=new Oeuvre("Zazie dans le metro",auteurC,"francais");
        Oeuvre oeuvreE=new Oeuvre("Le comte de Monte-Cristo",auteurB,"anglais");


        bibliotheque.stocker(oeuvreA,2);
        bibliotheque.stocker(oeuvreB,1);
        bibliotheque.stocker(oeuvreC,3);
        bibliotheque.stocker(oeuvreD,1);
        bibliotheque.stocker(oeuvreE,1);

        bibliotheque.listerExemplaires();
        bibliotheque.listerExemplaires("anglais");
        bibliotheque.afficherAuteur(true);

    }


}
