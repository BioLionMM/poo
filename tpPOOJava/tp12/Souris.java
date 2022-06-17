package tpPOOJava.tp12;

public class Souris {
    int poids;
    String couleur;
    int age;
    int esperanceDeVie;
    boolean clonee;

    public Souris(int poids, String couleur, int age, int esperanceDeVie, boolean clonee) {
        this.poids = poids;
        this.couleur = couleur;
        this.age = age;
        this.esperanceDeVie = esperanceDeVie;
        this.clonee = clonee;
        System.out.println("Une nouvelle souris! ");
    }

    Souris(Souris sourisB){
        System.out.println("Clonage d'une souris!");
        this.couleur=sourisB.couleur;
        this.poids=sourisB.poids;
        this.age=0;
        this.esperanceDeVie=sourisB.esperanceDeVie;
        this.clonee=true;
    }

    public int getPoids() {
        return poids;
    }

    public String getCouleur() {
        return couleur;
    }

    public int getAge() {
        return age;
    }

    public int getEsperanceDeVie() {
        return esperanceDeVie;
    }

    public boolean isClonee() {
        return clonee;
    }


    @Override
    public String toString() {
        String etatClonage=this.isClonee() ? ", clonee, " : "";
        return (String.format("Une souris %s%sde %d mois et pesant %d grammes.",couleur,etatClonage,age,poids));
    }


    public void vieillir(int nbreMois){
        this.age=this.age+nbreMois;
        if((this.clonee)&&(age>this.esperanceDeVie/2)){
            this.couleur="verte";
        }
    }

    public void evolue(){
        this.age=this.esperanceDeVie;
    }
}
