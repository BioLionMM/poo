package tpPOOJava.tp11;

import java.util.ArrayList;

public class Bibliotheque {
    String nomBibliotheque;
    ArrayList<Exemplaire> listeExemplaires=new ArrayList<Exemplaire>();

    public Bibliotheque(String nomBibliotheque) {
        this.nomBibliotheque = nomBibliotheque;
        System.out.println("La bibliotheque "+nomBibliotheque+" est ouverte!");
    }

    public String getNomBibliotheque() {
        return nomBibliotheque;
    }

    public int getNbExemplaires(){
        return listeExemplaires.size();
    }

    public void stocker(Oeuvre nouvelleOeuvre,int nbCopies)
    {
        Exemplaire nouvelExemplaire=new Exemplaire(nouvelleOeuvre);
        for(int i=0;i<nbCopies;i++){
            this.listeExemplaires.add(nouvelExemplaire);
        }
    }


    public ArrayList<Exemplaire> listerExemplaires(Oeuvre oeuvreAChercher,String langue)
    {
        Exemplaire exemplaireAChercher=new Exemplaire(oeuvreAChercher);
        ArrayList<Exemplaire> listeRetournee=new ArrayList<Exemplaire>();
        for(Exemplaire exemplaireCourant:this.listeExemplaires){
            if(exemplaireCourant.referenceOeuvre.estPareilQue(oeuvreAChercher,langue)){
                listeRetournee.add(exemplaireCourant);
            }
        }
        return listeRetournee;
    }


    public void listerExemplaires(String langue)
    {
        if(langue==""){
            this.listerExemplaires();
        }
        else{
            System.out.println("Les exemplaires en "+langue+" de la bibliotheque sont: ");
            for(Exemplaire exemplaireCourant:this.listeExemplaires){
                if(exemplaireCourant.referenceOeuvre.getLangue().equals(langue)){
                    exemplaireCourant.afficher();
                }
            }
        }

    }


    public void listerExemplaires()
    {
        System.out.println("La bibliotheque "+this.getNomBibliotheque()+" offre: ");
        for(Exemplaire exemplaireCourant:this.listeExemplaires){
                    exemplaireCourant.afficher();
            }

    }



    public int compterExemplaires(Oeuvre oeuvreAChercher)
    {
        int nbExemplairesOeuvre=0;
        for(Exemplaire exemplaireCourant:this.listeExemplaires){
            if(exemplaireCourant.referenceOeuvre.estPareilQue(oeuvreAChercher,"")){
                nbExemplairesOeuvre++;
            }
        }
        return nbExemplairesOeuvre;
    }


    public void afficherAuteur(boolean ontDesPrix)
    {
        if(ontDesPrix){
            System.out.println("Les auteurs primes sont: ");
        }
        else{
            System.out.println("Les auteurs présents sont: ");
        }
        ArrayList<String> nomAuteursPrimes=new ArrayList<String>();

        for(Exemplaire exemplaireCourant:this.listeExemplaires){
            if((ontDesPrix)&&(exemplaireCourant.referenceOeuvre.auteur.getPrix())){
                nomAuteursPrimes.add(exemplaireCourant.referenceOeuvre.auteur.getNom());
                System.out.println(exemplaireCourant.referenceOeuvre.auteur.getNom());
            }
        }
    }
}
