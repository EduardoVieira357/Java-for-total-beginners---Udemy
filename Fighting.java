/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fighting;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Fighting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.println("Attack Points of Monster:");
        int monsterAttack = sc.nextInt();
        
        System.out.println("Defense Points of Monster:");
        int monsterDefense = sc.nextInt();
        
        System.out.println("Damage of Monster:");
        int monsterDamage = sc.nextInt();
        
        System.out.println("Life Points od Monster:");
        int monsterLife = sc.nextInt();
        
        
        System.out.println("Your attack points:");
        int yourAttack = sc.nextInt();
        
        System.out.println("Your Defense Points:");
        int yourDefense = sc.nextInt();
        
        System.out.println("Your Damage:");
        int yourDamage = sc.nextInt();
        
        System.out.println("Your Life Points od Monster:");
        int yourLife = sc.nextInt();
        
        
        Random generator = new Random();
        boolean attacker = generator.nextBoolean();
        if (attacker) {
            System.out.println("Your attack ----------> ");
            int dices = generator.nextInt(6)+1 + generator.nextInt(6)+1; 
            // dois dados ... 0 até 6 exclusive!!!  netInt(7) seria melhor
            int attackValue = yourAttack + dices;
            
            System.out.println("Rolled values: "+dices);
            System.out.println("Your attack value: "+attackValue);
            
            if (attackValue > monsterDefense) {
                System.out.println("Your attack was SUCCESSFUL!");
                
                monsterLife = monsterLife - yourDamage;
                System.out.println("Monster´s remaining Life Points is "+monsterLife);
            } else {
                System.out.println("Your attack was weak. Sorry!");
                
            }
            
        } else {
            System.out.println("MONSTER ATTACKS YOU ----------> ");
            // dois dados ... 0 até 6 exclusive!!!  netInt(7) seria melhor
            int dices = generator.nextInt(6)+1 + generator.nextInt(6)+1;
            int attackValue = yourAttack + dices;
            
            System.out.println("Rolled values: "+dices);
            System.out.println("MONSTER attack value: "+attackValue);
            
            if (attackValue > yourDefense) {
                System.out.println("MONSTER attack was SUCCESSFUL!");
                
                yourLife = yourLife - monsterDamage;
                System.out.println("Your remaining Life Points is "+yourLife);
            } else {
                System.out.println("WOW, Monster attack was WEAK. God!!!");
                
            }
            
            
        }
        
        
        
    }
    
}
