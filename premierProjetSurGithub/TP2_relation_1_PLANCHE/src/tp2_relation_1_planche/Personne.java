/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_planche;

/**
 *
 * @author Line
 */
public class Personne {
    String nom;
    String prenom ;
    int nbVoiture ;
    Voiture [] liste_voitures ;
    
    
    public Personne(String nom1, String prenom1)  {
        nom=nom1;
        prenom=prenom1;
        
        liste_voitures=new Voiture [3] ;
        
        nbVoiture = 0;
        
        
    public boolean ajouter_voiture( Voiture voiture_a_ajouter) {
        if ( voiture_a_ajouter.P0roprietaire==null) {
            System.out.println("la voiture a deja un propriétaire, voiture volée");
            return false;
        }
            
            
        else if (nbVoiture==3)  {
            System.out.println("déjà 3 voitures");
            return false;
        }
        liste_voitures[nbVoiture]= voiture_a_ajouter ;
        nbVoiture+=1  ;
        
        voiture_a_ajouter.Proprietaire= this  ;
        System.out.println("LA voiture est " +voiture_a_ajouter);
        return true;
    }
    

    public String toString() {
return"prenom :" + prenom +" nom :" + nom;
}
    
