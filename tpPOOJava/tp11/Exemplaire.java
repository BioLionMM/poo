package tpPOOJava.tp11;

public class Exemplaire {
    Oeuvre referenceOeuvre;

    public Exemplaire(Oeuvre referenceAInitialiser) {
        this.referenceOeuvre = referenceAInitialiser;
        System.out.printf("Nouvel exemplaire: ");
        this.referenceOeuvre.afficher();
    }

    public Oeuvre getOeuvre() {
        return referenceOeuvre;
    }

    public void afficher(){
        System.out.println("Un exemplaire de ");
        this.referenceOeuvre.afficher();
    }
}
