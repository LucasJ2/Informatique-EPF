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
public class Cellule {
    Jeton jetonCourant;
    boolean trouNoir;
    boolean desintegrateur;
    String couleur;
    
    public Cellule(){
       trouNoir=false;
       desintegrateur=false;
       jetonCourant=null;
    } 
    public boolean affecterJeton(Jeton JetonAjout){
      if (jetonCourant==null){
          jetonCourant=JetonAjout;
          return(true);
      } 
      else{
          return false;
      }
    }
    public Jeton recupererJeton(){
        Jeton jetonretour=jetonCourant;
        jetonCourant=null;
        return jetonretour;
        
    }
    public boolean supprimerJeton(){
        if (jetonCourant!=null){
          jetonCourant=null;
          return(true);
    }
        else{
            return false;
        }
    }
    public boolean placerTrouNoir(){
        if (trouNoir==true){
            return false;
        }
        else{
            return true;
        }
    }
    
    public boolean placerDesintegrateur(){
     if (desintegrateur==true){
         return false;
     }
     else{
         return true;
    }   
    }
    public boolean presenceTrouNoir(){
        if(trouNoir==true){
            return(true);
        } 
        else{
            return false;
        }
    }
    public boolean presenceDesintegrateur(){
        if (desintegrateur==true){
         return true;   
        }
        else{
            return false;
        }
    }
    public String lireCouleurDuJeton(){
        return(jetonCourant.Couleur);
    }
    public boolean recupererDesintegrateur(){
        if (desintegrateur==true){
            return false;
        }
        else{
            return true;
        }
        
    }
    public boolean activerTrouNoir(){
        if (trouNoir==true){
            jetonCourant=null;
            return true;
        }
        else{
            return false;
        }
        
    }
}
