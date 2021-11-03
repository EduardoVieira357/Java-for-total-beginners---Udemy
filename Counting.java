/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counting;

import java.util.Random;

/**
 *
 * @author User
 */
public class Counting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random generator = new Random();
        //int dice = generator.nextInt(6)+1; //0-5... com +1 fica 1-6
        int count = 0;
        int dice;
        
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("============================================");
        
        
        //while (dice != 6) {
        do {
            count++;
            dice = generator.nextInt(6)+1; //0-5... com +1 fica 1-6
            System.out.println(dice+" is rolled and is the "+count+"º.");
            //dice = generator.nextInt(6)+1; //0-5... com +1 fica 1-6
            //count++;
        } while (dice != 6); 
        
        System.out.println("============================================");
        System.out.println(" ");
        System.out.println("Ultimo dado: "+dice);
        System.out.println("Total de vezes: "+count);
        System.out.println(" ");
    }
    
}
