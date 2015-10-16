/**
 * Created by Jijou on 16/10/2015.
 */
import java.util.Scanner;

public class Main {


        public static void main(String[] args) {
            Scanner clavier = new Scanner(System.in);
//Création d'un compte:
            System.out.println("Donner le nom");
            String nomCompte = clavier.next();
            System.out.println("Donner le Solde");
            double soldeCompte = clavier.nextDouble();
            Compte compte = new Compte(nomCompte,soldeCompte);

            int choix =0;
            while (choix != 3){

                System.out.println("1- est le choix pour ajouter un montant");
                System.out.println("2- est le choix pour ajouter un retret");
                System.out.println("3- Afficher");
                System.out.println("votre choix ???");
                choix = clavier.nextInt();
                switch(choix){
                    case 1:
                        System.out.println("le montant que vous vouler ajouter est");
                        double montant = clavier.nextDouble();
                        System.out.println("Ajout de "+montant);
                        compte.Modifier(montant);

                        break;
                    case 2:
                        System.out.println("le montant que vous vouler retirer");
                        double montant1 = clavier.nextDouble();
                        System.out.println("Retret de "+montant1);
                        compte.retret(montant1);


                        break;
                    case 3: System.out.println(compte);break;

                }
            }


        }


}
