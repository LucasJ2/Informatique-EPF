/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superpuissance4_jallot;

import java.util.Random;

/**
 *
 * @author ljallot
 */
public class Partie {
Joueur []ListeJoueurs=new Joueur [2];
Grille GrilleJeu;
Joueur joueurCourant;
public void attribuerCouleursAuxJoueurs(){
   Random generateurAleat=new Random();
    int e = generateurAleat.nextInt(1);
    ListeJoueurs[e].Couleur="rouge";
    int f=(int) Math.pow(-1, e);
    ListeJoueurs[e+f].Couleur="jaune";
}
public void initialiserPartie(){
  for (int i=0;i<6;i++){
      for (int j=0;j<7;j++){
    if (GrilleJeu.Cellules[i][j].jetonCourant!=null){
    GrilleJeu.Cellules[i][j].jetonCourant=null;
  }
  }
  }
}
public void debuterPartie(Boolean desintegrateurs){
 for (int i=0;i<6;i++){
     System.out.println(" ");
     for (int j=0;j<7;j++){
         System.out.print(GrilleJeu.Cellules[i][j]);
     } 
 }
 Random generateurAleat=new Random();
 for (int k=0;k<5;k++){
    int s = generateurAleat.nextInt(6);
    int q = generateurAleat.nextInt(7);
     Boolean trouNoir;
     trouNoir=true;
    GrilleJeu.Cellules[s][q]=Cellules(trouNoir);
 }
 for (int l=0;l<5;l++){
    int s = generateurAleat.nextInt(6);
    int q = generateurAleat.nextInt(7);
    GrilleJeu.Cellules[s][q]=Cellules(desintegrateurs);
 }
}

    private Cellule Cellules(Boolean trouNoir) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}