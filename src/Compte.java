public class Compte {
    private static int numeroCompte=0;
    private String nom;
    private double solde;
    private double taux;
    private double montant;

    public Compte(String nom,double solde){
        this.nom=nom;
        this.numeroCompte++;
        this.solde=solde;
        this.taux= (double)15/100;
    }


    /*public void interet(){
           double interet;

           interet = solde * taux;
           System.out.println("le taux d'interet est de :"+ interet);
       }*/
    public double calculSolde(){
        return solde-(solde*this.taux);
    }

    public void Modifier(double motant){
        solde= montant + solde;
    }
    public void retret(double montant){
        if (solde>= montant)
            solde= montant - solde ;
    }
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return ("le Compte n: " + numeroCompte +"De Mr/Mme "+this.nom+ " et son solde est!!! " +this.calculSolde());
    }

}
