/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_planche;

import java.lang.constant.ConstantDesc;
import static java.lang.constant.ConstantDescs.NULL;

/**
 *
 * @author Line
 */
public class Voiture {
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne Proprietaire ;
    
    
    public Voiture (String Modele2, String Marque2, int PuissanceCV2){
    Modele=Modele2;
    Marque=Marque2;
    PuissanceCV=PuissanceCV2;
    Proprietaire = null;
    
            
                    
    }
    
public  String toString(String PuissanceCv)  {
return"\n modele: "+Modele+"\nmarque:" + "\npuissance:"+ PuissanceCv +"CV"+"\n";

}
    
    
}
