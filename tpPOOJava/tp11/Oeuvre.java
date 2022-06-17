package tpPOOJava.tp11;

public class Oeuvre {
    String titre;
    final Auteur auteur;
    String langue;

    public Oeuvre(String titre, Auteur auteur, String langue) {
        this.titre = titre;
        this.auteur = auteur;
        this.langue = langue;
    }

    public Oeuvre(String titre, Auteur auteur) {
        this.titre = titre;
        this.auteur = auteur;
        this.langue = "français";
    }

    public String getTitre() {
        return titre;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public String getLangue() {
        return langue;
    }

    public void afficher(){
        System.out.printf("%s, %s, en %s\n",this.titre,this.auteur.getNom(),this.langue);
    }

    public boolean estPareilQue(Oeuvre oeuvreB,String langue)
    {
        if((oeuvreB.getAuteur().estPareilQue(this.auteur))&&(oeuvreB.getTitre()==this.titre)){
            if(langue.equals("")){
                return true;
            }
            else{
                if(oeuvreB.getLangue()!=this.langue){
                    return false;
                }
                else{
                    return true;
                }
            }
        }
        else{
            return false;
        }
    }
}
