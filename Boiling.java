/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boiling;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Boiling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Give in the temperature:");
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        int temp = sc.nextInt();
        
        if (temp >= 100){
            System.out.println("The water is BOILING!");            
        } else {
            System.out.println("The water is NOT boiling!");
        }
        
    }
    
}
