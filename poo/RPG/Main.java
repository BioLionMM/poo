package poo.RPG;

public class Main {
    public static void main(String[] args) {
        Guerrier chris=new Guerrier("Christian",400,"M16 A4");
        Guerrier mansour=new Guerrier("Mansour",900,"Lance-pierre");

        Voleur jean=new Voleur("Jean",1000,"Mains");

        Magicien nouha=new Magicien("Nouha",100,"baguette mystique");

        Sorcier morgane=new Sorcier("Morgane",200,"baguette morganienne","baton " +
                "morganien");

        chris.rencontrer();
        mansour.rencontrer();
        jean.rencontrer();
        nouha.rencontrer();
        morgane.rencontrer();
//
//        System.out.println(chris);
//        System.out.println(mansour);
//        System.out.println(jean);
//        System.out.println(nouha);
//        System.out.println(morgane);


    }
}
