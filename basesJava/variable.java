public class variable {
    //raccourci main
    public static void main(String[] args) {
        int longueur=50;
        int largeur=25;
        int surface=longueur*largeur;
        //raccourci sout
        System.out.println(surface);
        int perimetre=2*(longueur+largeur);
        System.out.println(perimetre);

        //nbre a virgules:
        //float ou double en fonction de la precision voulue.
        float nombre1=150.5f;

        float distanceParcourue=15.6f;


        String prenom="horace";
        char caractere='a';

        byte age=25;
        if(age>17){
            System.out.println("vous etes majeur.");
        }
        else{
            System.out.println("vous etes mineur.");
        }



    }
}
