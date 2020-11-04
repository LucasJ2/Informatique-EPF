/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superpuissance4_jallot;

/**
 *
 * @author ljallot
 */
public class Joueur {
    String Nom;
    String Couleur;
    Jeton [] ListeJetons= new Jeton [21];
    int nombreDesintegrateurs;
    int nombreJetonsrestants=21;
   public Joueur(String UnNom,String UneCouleur,int Desintegrateur,int Jetonsrestants){
       Nom=UnNom;
       nombreDesintegrateurs=Desintegrateur;
       nombreJetonsrestants=Jetonsrestants;
   } 
   public void affecterCouleur(String UneCouleur){
       Couleur=UneCouleur;
   }
   public int ajouterJeton(Jeton jetonAjouter, int nombreJetonsRestants){
      ListeJetons[nombreJetonsRestants]=jetonAjouter; 
      nombreJetonsRestants=nombreJetonsRestants-1;
      return(nombreJetonsRestants);
   }
   public void obtenirDesintegrateur(){
       nombreDesintegrateurs=nombreDesintegrateurs+1;
   }
   public boolean utiliserDesintegrateur(){
       if (nombreDesintegrateurs>0){
           nombreDesintegrateurs=nombreDesintegrateurs-1;
           return(true);
       } 
       else {
           return(false);
       }
   }
}
