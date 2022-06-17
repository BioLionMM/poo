package tpPOOJava.tp8a9;

public class Maintp8 {

    static int[] positionTableau(String[] tableauDeplacement){
        int hauteur=0;
        int largeur=0;
        String direction;
        for(int i=0;i< tableauDeplacement.length;i++){
            direction=tableauDeplacement[i].toLowerCase();
            switch(direction){
                case "haut":
                    hauteur--;
                    break;
                case "bas":
                    hauteur++;
                    break;
                case "gauche":
                    largeur--;
                    break;
                case "droite":
                    largeur++;
                    break;
            }
        }
        int[] positionFin={hauteur,largeur};
        return(positionFin);
    }

    public static void main(String[] args) {
        /*On vous donne comme argument un tableau contenant des chaînes de directions (haut, bas, gauche, droite).
        Imaginez une personne debout sur une grille au point 0, 0.
        Pour chaque direction dans le tableau de chaînes, déplacez votre personne dans cette direction sur la grille.
        Retournez le point final X,Y où se trouve la personne sous la forme d'un tableau de deux entiers.*/
        String[] tabDeplacements={"haut", "haut", "bas", "gauche", "gauche", "droite", "haut"};
        int[] tabResultat=positionTableau(tabDeplacements);

        System.out.println("["+tabResultat[0]+","+tabResultat[1]+"]");
    }
}
