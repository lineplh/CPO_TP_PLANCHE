/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_planche;

/**
 *
 * @author Line
 */
public class Convertisseur {
    int nbConversions ; 
    
    public Convertisseur () {
 nbConversions = 0 ;
}
   
@Override
public String toString () {
 return "nb de conversions"+ nbConversions;
 
}
    public double CelciusVersKelvin(double tCelcius) {
        double a = (tCelcius + 273));
        nbConversions+=1;
        return(a);
    }

    public double KelvinVersCelcius(double tKelvin){
        double a = (tKelvin + 273));
        nbConversions+=1;
        return(a);
}
    
    public double FarenheitVersCelcuis(double tFarenheit){
        double a = (tFarenheit - 32)/ 1.8;
        nbConversions+=1;
        return(a);
    }
public double CelciusVersFarenheit(double tCelcius){
        double a = (tCelcius * 1.8)+32;
        nbConversions+=1;
        return(a);
    }   
    
    public double KelvinVersFarenheit(double tKelvin){
        double a = KelvinVersCelcius(tKelvin) ;
        a=CelciusVersFarenheit(a) ;
        nbConversions-=1;
        return(a);
    }
    
    public double FarenheitVersKelvin(double tFarenheit){
        double a = FarenheitVersCelcius (tFarenheit);
        a=CelciusVersKelvin(a);
        nbConversions-=1;
        return(a);
    }

    Convertisseur() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Convertisseur() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Convertisseur() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

