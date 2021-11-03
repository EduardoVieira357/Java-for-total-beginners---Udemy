/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperature;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Temperature {
    private static Object keyboard;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Give in the Celsius Value: ");
        Scanner sc= new Scanner(System.in);
        
        sc.useLocale(Locale.US); // para aceitar o . ao inves da ,
        
        double celsius = sc.nextDouble();
        double fahrenheit = ((9.0 / 5.0) * celsius) + 32.0 ; // divisão por inteiro dá diferente!
        System.out.println(celsius+" Celsius is: "+fahrenheit+" Fahrenheit!");
        
        System.out.println("---------------------");
        
        System.out.println("Veja como usando numeros inteiros o resultado é diferente:");
        System.out.println("9/5 seria resultado 1 e o resto desprezado...");
        double fahrenheit2 = ((9 / 5) * celsius) + 32.0 ; // divisão por inteiro dá diferente!
        System.out.println(celsius+" Celsius is: "+fahrenheit2+" Fahrenheit!");
        


    }
    
}
