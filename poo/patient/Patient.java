package poo.patient;

public class Patient {
    /*Le but de cet exercice est de créer des « patients » qui ont un poids et une taille,
    et de calculer leur « Indice de Masse Corporelle» (IMC).
    crée un patient,
    affiche les données du patient ainsi que son IMC.
    Avoir la possibilité de connaître la taille du patient, son poids*/
    private String identifiantPatient;
    private float poids;
    private float taille;
    //private double IMC;

    Patient(String idPatient,float newPoids,float newTaille){
        this.identifiantPatient=idPatient;
        this.taille=newTaille;
        this.poids=newPoids;
        //A eviter:
        //this.IMC=this.calculeIMC();
    }

    String getID(){return this.identifiantPatient;}
    float getPoids(){return this.poids;}
    float getTaille(){return this.taille;}
    //double getIMC(){return this.IMC;}

    void setPoids(float newPoids){this.poids=newPoids;}
    void setTaille(float newTaille){this.taille=newTaille;}
    void setId(String newId){this.identifiantPatient=newId;}

    double calculeIMC(){
        double IMC=this.getPoids()/(Math.pow(this.getTaille(),2));
        return IMC;
    }
}
