package poo;

public class Rectangle3 {
    private double longueur;
    private double largeur;



    public Rectangle3(double longueur,double largeur){
        this.longueur=longueur;
        this.largeur=largeur;
    }

    public double getLongueur(){
        return longueur;
    }

    public double getLargeur(){
        return largeur;
    }

    public void setLongueur(double longueur){
        this.longueur=longueur;
    }

    public void setLargeur(double largeur){
        this.largeur=largeur;
    }


    double calculDeLaSurface(){
        return longueur*largeur;
    }

    double calculDuPerimetre(){
        return 2*(longueur+largeur);
    }
}