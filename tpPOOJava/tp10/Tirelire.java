package tpPOOJava.tp10;

public class Tirelire {
    double montant;

    public Tirelire(double montant) {
        this.montant = montant;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }


    public void afficher()
    {
        /*Vous êtes sans le sou,si la tirelire ne contient pas d’argent
        Vous avez : <montant> € dans votre tirelire.*/
        if(this.getMontant()==0)
        {
            System.out.println("Vous êtes sans le sou.");
        }
        else{
            System.out.printf("Vous avez %.2f dans votre tirelire.\n",this.getMontant());
        }

    }

    public void secouer()
    {
        if(this.getMontant()>0){
            System.out.println("Bling bling");
        }
    }

    public void remplir(double quantite){
        if(quantite>0){
            this.setMontant(this.getMontant()+quantite);
        }
    }

    public void vider(){ this.setMontant(0);}

    public void puiser(double quantite)
    {
        this.setMontant(this.getMontant()-quantite);
    }

    public void calculerSolde(double montantADepenser){
        if(montantADepenser>=0){
            double solde=this.getMontant()-montantADepenser;
            if(solde>=0){
                System.out.println("Vous etes assez riche pour ca! Il vous restera "+solde);
            }
            else{
                System.out.println("On se calme, pas assez d'argent pour ca.");
            }

        }else{
            System.out.println("Vous n'avez rien depense. Economisez bien.");
        }
    }
}
