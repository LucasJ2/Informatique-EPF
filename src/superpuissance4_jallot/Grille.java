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
public class Grille {
 Cellule [][] Cellules= new Cellule [6][7]; 
 boolean trouNoir;
 boolean desintegrateur;
 String couleur;
public Grille (){
  for (int i=0;i<6;i++){
      for (int j=0;j<7;j++){
         Cellules[i][j]=null;
      }
  }
}
public boolean ajouterJetonDansColonne(Jeton jetonColonne, int j){
  if (Cellules[0][j]==null){
    Cellules[0][j].jetonCourant=jetonColonne;
    return true;
   }
    else {
    return false;
    }
    
}
public boolean etreRemplie(){
    boolean r;
    r=true;
    for (int i=0;i<6;i++){
       for (int j=0;j<7;j++){
           if (Cellules[i][j]==null){
            r=false;
           }
       }
    }
    return r;
}
public void viderGrille(){
     for (int i=0;i<6;i++){
       for (int j=0;j<7;j++){
           Cellules[i][j]=null;
       }
     }
}
public void afficherGrilleSurConsole(){
     for (int i=0;i<6;i++){
       System.out.println(" ");
       for (int j=0;j<7;j++){
           System.out.print(Cellules[i][j]);
       }
}
}

public boolean celluleOcuppee(int i, int j){
 if (Cellules[i][j]==null){
     return false;
 }
 else{
     return true;
 } 
}
public String lireCouleurDuJeton(int i,int j){
if (Cellules[i][j].couleur=="rouge"){
    return ("rouge");
}
else{
    return("jaune");
}
}
public boolean etreGagnantePourJoueur(){
   int n;
   n=0;
    for (int i=0;i<6;i++){
       for (int j=0;j<7;j++){
           if (Cellules[i][j].couleur=="rouge"){
               n=n+1;
           }
           else{
               n=0;
           }
           if (n==4){
               return true;
           }
       }
   }
    n=0;
   for (int j=0;j<7;j++){
       for (int i=0;i<6;i++){
           if (Cellules[i][j].couleur=="rouge"){
               n=n+1;
           }
           else{
               n=0;
           }
           if (n==4){
               return true;
           }
       }
   }
   n=0;
   int i=2;
   int a=0;
 for (int k=0;k<3;k++){   
   for (int j=0;j<2+a;j++){
      if (Cellules[i][j].couleur=="rouge"){
          n=n+1;
          i=i+1;
      }
      else{
          n=0;
          i=i+1;
      }
      if(n==4){
          return true;
      }
   }
   a=a+1;
   i=2-a;
 }
 a=0;
 n=0;
 for(int k=0;k<4;k++){
     i=1;
     for(int j=1;j<5-a;j++){
         if (Cellules[i][j].couleur=="rouge"){
             n=n+1;
             i=i+1;
         }
         else{
             n=0;
             i=i+1;
         }
         if(n==4){
             return true;
         }
     }
 }
 a=0;
 n=0;
 for(int k=0;k<3;k++){
     i=5;
     for (int j=3-a;j<6;j++){
         if (Cellules[i][j].couleur=="rouge"){
             n=n+1;
             i=i-1;
         }
         else{
             n=0;
             i=i-1;
         }
     if(n==4){
         return true;
     }
     }
     a=a+1;
 }
 a=0;
 n=0;
 for (int k=0;k<4;k++){
     i=5-a;
     for(int j=1;j<5-a;j++){
         if (Cellules[i][j].couleur=="rouge"){
          n=n+1;
          i=i-1;
         }
         else{
             n=0;
             i=i-1;
         }
         if(n==4){
             return true;
         }
     }
     a=a+1;
 }
    for (i=0;i<6;i++){
       for (int j=0;j<7;j++){
           if (Cellules[i][j].couleur=="jaune"){
               n=n+1;
           }
           else{
               n=0;
           }
           if (n==4){
               return true;
           }
       }
   }
    n=0;
   for (int j=0;j<7;j++){
       for (i=0;i<6;i++){
           if (Cellules[i][j].couleur=="jaune"){
               n=n+1;
           }
           else{
               n=0;
           }
           if (n==4){
               return true;
           }
       }
   }
   n=0;
   i=2;
   a=0;
 for (int k=0;k<3;k++){   
   for (int j=0;j<2+a;j++){
      if (Cellules[i][j].couleur=="jaune"){
          n=n+1;
          i=i+1;
      }
      else{
          n=0;
          i=i+1;
      }
      if(n==4){
          return true;
      }
   }
   a=a+1;
   i=2-a;
 }
 a=0;
 n=0;
 for(int k=0;k<4;k++){
     i=1;
     for(int j=1;j<5-a;j++){
         if (Cellules[i][j].couleur=="jaune"){
             n=n+1;
             i=i+1;
         }
         else{
             n=0;
             i=i+1;
         }
         if(n==4){
             return true;
         }
     }
 }
 a=0;
 n=0;
 for(int k=0;k<3;k++){
     i=5;
     for (int j=3-a;j<6;j++){
         if (Cellules[i][j].couleur=="jaune"){
             n=n+1;
             i=i-1;
         }
         else{
             n=0;
             i=i-1;
         }
     if(n==4){
         return true;
     }
     }
     a=a+1;
 }
 a=0;
 n=0;
 for (int k=0;k<4;k++){
     i=5-a;
     for(int j=1;j<5-a;j++){
         if (Cellules[i][j].couleur=="jaune"){
          n=n+1;
          i=i-1;
         }
         else{
             n=0;
             i=i-1;
         }
         if(n==4){
             return true;
         }
     }
     a=a+1;
 }
 return false;
}

public void tasserGrille(int i, int j){        
Cellules[i][j]=null;
for (int k=i;k>0;k--){
    Cellules[k][j]=Cellules[k-1][j];
}
}
public boolean colonneRemplie(int j){
    for (int i=0;i<6;i++){
        if (Cellules[i][j]!=null){
            return false;
        }
    }
    return true;
}
public boolean placerDesintegrateur(int i ,int j){
    Cellules[i][j]=Cellules(desintegrateur);
    return true;
}
public boolean placerTrouNoir(int i ,int j){
    if (Cellules[i][j]!=Cellules(trouNoir)){
      Cellules[i][j]=Cellules(trouNoir); 
      return true;
    }
    else{
        return false;
    }
   
}
public boolean supprimerJeton(int i ,int j){
    if (Cellules[i][j]!=null){
        Cellules[i][j]=null;
        return true;
    }
    else{
        return false;
    }
}
public Cellule recupererJeton(int i, int j){
    Cellule JetonRecupere;
    JetonRecupere=Cellules[i][j];
    Cellules[i][j]=null;
    for (int k=j;k>0;k++){
        Cellules[i][k]=Cellules[i][k-1];
    }
    return JetonRecupere;
}
@Override
public String toString() {
    String grille;
    for (int i=0;i<6;i++){
          System.out.println(" ");
        for(int j=0;j<7;j++){
            System.out.print(Cellules[i][j]+" ");
        }
    }
   return (" ");
}

    private Cellule Cellules(boolean trouNoir) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}