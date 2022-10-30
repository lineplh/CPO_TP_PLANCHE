/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_planche;

/**
 *
 * @author Line
 */
public class TP2_manip_PLANCHE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Tartiflette assiette  =  new Tartiflette(500);
        Tartiflette assiette2 = null;
    Tartiflette assiette3 =  assiette2 ;
    
        System.out.println("nb de calories assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories assiette 3 : " + assiette3.nbCalories);
        
        System.out.println(assiette3) ;
        System.out.println(assiette2) ;
        
        assiette2.nbCalories = 200 ;
        
        System.out.println("nb de calories assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories assiette 3 : " + assiette3.nbCalories);
        assiette3.nbCalories = 100;
        
        System.out.println("nb de calories assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories assiette 3 : " + assiette3.nbCalories);
        
        System.out.println("on échange la ref assiette1 et assiette2:");
        Tartiflette t=new Tartiflette(0);
        t=assiette2;
        assiette2= assiette1;
        assiette1= t;
        
        System.out.println("nb de calories assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories assiette 1 : " + assiette1.nbCalories);
        
        /*/ assiette1=Moussaka666
new Tartiflette(1)
       /*/ Elles sont toutes les deux fausses  car les deux types objets n'ont aucun rapport /*/
       
       
       
       
       Moussaka[] tab= new Moussaka[10];
       b<Moussaka> moussakas = new b();
       for(int i=0; i<10; i++)   {
            tab[i]=new Moussaka(i*100);
            moussakas.add( new Moussaka (i*100))    
    }        
        moussakas.add( new Moussaka(11*100))
        
        System.out.println(Arrays.tostring(tab));
            moussakas.clear();
        System.out.println.(moussakas);
        
        
        
        
        
        
                
        }
