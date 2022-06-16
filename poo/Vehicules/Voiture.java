package poo.Vehicules;

public class Voiture extends Vehicule{
    private int nbrePlaces;
    private boolean course;

    public Voiture(int anneeModele, float prix, int nbrePlaces, boolean course) {
        super(anneeModele, prix);
        this.nbrePlaces = nbrePlaces;
        this.course = course;
    }

    public int getNbrePlaces() {
        return nbrePlaces;
    }

    public void setNbrePlaces(int nbrePlaces) {
        this.nbrePlaces = nbrePlaces;
    }

    public boolean isCourse() {
        return course;
    }

    public void setCourse(boolean course) {
        this.course = course;
    }

    @Override
    public void demarrer() {
        System.out.println("La voiture demarre!");
    }

    @Override
    public void accelerer() {
        System.out.println("La voiture accelere! VROUM!");
    }
}
