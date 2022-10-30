/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_planche;

/**
 *
 * @author Line
 */
public class TP2_BIERES_PLANCHE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 
    7.0 ,"Dubuisson") ;

        uneBiere.Nom = "Cuvée des trolls";
        uneBiere.degreAlcool = 7.0 ;
        String brasserie= "Dubuisson" ;
        boolean ouverte= false ;
        uneBiere.lireEtiquette();
        System.out.println(uneBiere) ;

    }

}
