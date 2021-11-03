/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_01_check_a_die;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int die;
        do {
            System.out.println("Please give in the value of the die");
            die = sc.nextInt();
            if (die < 1 || die > 6){
                System.out.println("The value of the die is bad (1 to 6).");
                
            }
        
        } while (die < 1 || die > 6);
    }
}
