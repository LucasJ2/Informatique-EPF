/*
 * TP 3
 * TDC1 Jallot
 * Octobre 2020
 */
package superpuissance4_jallot;

import java.util.Scanner;

/**
 *
 * @author ljallot
 */
public class SuperPuissance4_JALLOT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int valeur;
    int rep;
    Scanner sc;
    sc=new Scanner (System.in);
    Partie unepartie=new Partie();
    Grille unegrille= new Grille();
    Cellule uneCellule=new Cellule();

    unepartie.attribuerCouleursAuxJoueurs();
    unepartie.initialiserPartie();
    
    do { // on fait une boucle infinie tant que la condition while en bas est vrai
            valeur = menu1(); // on récupere un choix retourné par la méthode menu()
            switch (valeur) {
                case 1: {
                int e;
                joueur1=ListeJoueurs[e];
                joueurcourant=joueur1;
            }
                    break;
                case 2:{                         
                int e;
                int f;
                ListeJoueurs[e+f].affecterCouleur();
                    break;
            }
            }
        }
        while(valeur!=2);
    do { // on fait une boucle infinie tant que la condition while en bas est vrai
            rep = menu2(); // on récupere un choix retourné par la méthode menu()
            switch (rep) {
                case 1:{
                    uneCellule.ajouterJetonDansColonne(Jeton jetonColonne, int j);
                    System.out.println(grille);
                    break;
                }
                case 2:{
                    unegrille.recupererJeton(int i, int k);
                    System.out.println(grille);
                    break;
                }
                case 3: {
                    Joueur.utiliserDesintegrateur();
                    System.out.println(grille);
                    break;
                }
            }
        }
        while(rep!=3);
    }
   public static int menu1() {
   int valeur;
   Scanner sc;
   sc = new Scanner(System.in);
        System.out.println("A qui le tour ?");
        System.out.println("1 : joueur rouge");
        System.out.println("2 : joueur jaune");
        valeur=sc.nextInt();
    return valeur;
   }
         public static int menu2() {
        /*
        Cette méthode permet d'afficher le menu
        On choisit une valeur au clavier, elle est renvoyée 
        */
        //choix d'une opération
        Scanner sc;
        int rep;
        sc=new Scanner (System.in);
        System.out.println("Saisissez l'action que vous souhaitez effectuer:");
        System.out.println("1 : Placer un jeton");
        System.out.println("2 : Recupérer un jeton");
        System.out.println("3 : Desintégrer un jeton");
        rep = sc.nextInt();
        return rep; // on renvoie la réponse à la méthode appelante
   
}
}
