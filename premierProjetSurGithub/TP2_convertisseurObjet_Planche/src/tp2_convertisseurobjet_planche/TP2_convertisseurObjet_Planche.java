/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_planche;

import java.util.Scanner;

/**
 *
 * @author Line
 */
public class TP2_convertisseurObjet_Planche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Convertisseur Conv_informatique = new Convertisseur();
        
        
        Scanner sc = new Scanner(System.in);
        
        int arret = 1 ;
        Conv_informatique.Convertisseur();
        while(arret !=2)
            
            
        System.out.println("Bienvenue dans le Convertisseur de température :");
        System.out.println("Quelle converssion voulez-vous faire? :\n";
                +"1. Celcius Vers Kelvin\n" + "2. Kelvin Vers Celcius\n"+ "3. Farenheit Vers Celcius\n"+ 
                "4. Celcius Vers Farenheit\n"+ "5. Farenheit Vers Kelvin\n"+ "6. Kelvin Vers ferenheit\n"+ 
                "7. Donner les nb de conversions\n"+ "8. Stop\n";
                
        int nombre = 18;
        while(nombre>8   ||   nombre<0){
           System.out.println("Entrez un nombre entre 1 et 8");
           nombre=sc.nextInt();
           
           }
        
        switch(nombre)   {
            case 1:
                System.out.println("Entrez la température en celcius:");
                double tC=sc.nextDouble();
                double tK=Conv_informatique.CelciusVersKelvin(tC);
                System.out.println("La température est" +tK);
                break;
                
            case 2:
                System.out.println("Entrez la température en Kelvin:");
                double tK2=sc.nextDouble();
                double tC2=Conv_informatique.KelvinVersCelcius(tK2);
                System.out.println("La température est" +tC2);
                break;
                
            case 3:
                System.out.println("Entrez la température en Farenheit:");
                double tF3=sc.nextDouble();
                double tC3=Conv_informatique.FarenheitVersCelcius(tF3);
                System.out.println("La température est" +tC3);
                break;
                
            case 4:
                System.out.println("Entrez la température en Celcius:");
                double tC4=sc.nextDouble();
                double tF4=Conv_informatique.CelciusVersFarenheit(tC4);
                System.out.println("La température est" +tF4);
                break;
                
                
            case 5:
                System.out.println("Entrez la température en Kelvin:");
                double tK5=sc.nextDouble();
                double tF5=Conv_informatique.KelvinVersFarenheit(tK5);
                System.out.println("La température est" +tF5);
                break;
                
                
            case 6:
                System.out.println("Entrez la température en Farenheit:");
                double tF6=sc.nextDouble();
                double tK6=Conv_informatique.FarenheitVersKelvin(tF6);
                System.out.println("La température est" +tK6);
                break;
                
                
            
        }
        
    }
    
}
