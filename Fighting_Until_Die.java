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
public class Fighting_Until_Die {

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
        
        System.out.println("Your Life Points:");
        int yourLife = sc.nextInt();
        
        sc.nextLine(); // para limpar o buffer
        
        int contador = 0;
        int contadorYour = 0;
        int contadorMonster = 0;
        String frase;
        String command;       
        

        Random generator = new Random();
        
        do {
            boolean attacker = generator.nextBoolean();
            if (attacker) {
                contador++;
                contadorYour++;
                System.out.println(" ");
                System.out.println(contador+"º ATTACK ============== ");
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
                contador++;
                contadorMonster++;
                System.out.println(" ");
                System.out.println(contador+"º ATTACK ========================== ");
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
            System.out.println(" ");
            System.out.println("----------------------------------------------------");
            System.out.println("Press ENTER for continue. Or type 'run' do run away)");
            System.out.println("----------------------------------------------------");
            System.out.println(" ");
            
            command = sc.nextLine();
            
            switch (command) {
                case "run":
                    
                    yourLife-=4;
                    break;
                default:
                    
            }
            
        } while (yourLife > 0 && monsterLife > 0 && !"run".equals(command));
        
        if ("run".equals(command)) {
            frase = "You run away. YOU COWARD! -4 Life points!";
        } else {
        
            if (monsterLife > 0){
                frase = "Infelizmente o MONSTRO ganhou a luta e você morreu!";
            } else {
                frase = "Parabéns!!! Você conseguiu matar o monstro!";
            }
            
        }

        
        
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("====================================================");
        System.out.println("*** "+frase+" ***");
        System.out.println(" ");
        System.out.println("Total de ataques: "+contador);
        System.out.println("Sua vida: "+yourLife+"   Seus ataques: "+contadorYour);
        System.out.println("Vida do monstro: "+monsterLife+"   Ataques do monstro: "+contadorMonster);
        System.out.println("====================================================");
        System.out.println(" ");
        System.out.println(" ");
    }
    
}
