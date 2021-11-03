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
public class Fighting_Until_Die_Name_Generator_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int contador;
        int contadorYour;
        int contadorMonster;
        String frase;
        String command;
        
        Random generator = new Random();
        
        
        System.out.print("Your attack points:");
        int yourAttack = generator.nextInt(6)+5;
        System.out.println(yourAttack);
        
        System.out.print("Your Defense Points:");
        int yourDefense = generator.nextInt(10)+6;
        System.out.println(yourDefense);
        
        System.out.print("Your Damage:");
        int yourDamage = generator.nextInt(3)+2;
        System.out.println(yourDamage);
        
        System.out.print("Your Life Points:");
        int yourLife = generator.nextInt(20)+25;
        System.out.println(yourLife);
        
        
        for (int i= 0; i<3; i++) {
        
            String monsterName;
            int num = generator.nextInt(5);
            switch(num) {
                case 0: monsterName = "Black Daemon"; break;
                case 1: monsterName = "Anaconda"; break;
                case 2: monsterName = "Silver Dragon"; break;
                case 3: monsterName = "Mountain Troll"; break;
                case 4: monsterName = "Alien"; break;
                default: monsterName = "Cracken"; break;

            }

            Scanner sc = new Scanner(System.in);
            sc.useLocale(Locale.US);

            System.out.print("Attack Points of "+monsterName+":");
            int monsterAttack = generator.nextInt(8)+1;
            System.out.println(monsterAttack);

            System.out.print("Defense Points of "+monsterName+":");
            int monsterDefense = generator.nextInt(15)+3;
            System.out.println(monsterDefense);

            System.out.print("Damage of "+monsterName+":");
            int monsterDamage = generator.nextInt(3)+1;
            System.out.println(monsterDamage);

            System.out.print("Life Points of "+monsterName+":");
            int monsterLife = generator.nextInt(20)+15;
            System.out.println(monsterLife);



            //sc.nextLine(); // para limpar o buffer

            contador = 0;
            contadorYour = 0;
            contadorMonster = 0;
            //frase = " ";
            command = " ";           
            
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("================================================");
            System.out.println("================================================");
            System.out.println("A BATALHA VAI COMEÇAR: VOCÊ X "+monsterName);
            System.out.println("================================================");
            System.out.println("================================================");


            do {
                boolean attacker = generator.nextBoolean();
                if (attacker) {
                    contador++;
                    contadorYour++;
                    System.out.println(" ");
                    System.out.println(contador+"º ATTACK ====================================== ");
                    System.out.println("YOUR ATTACK >>>>>>>>>>>>>>>>> ");
                    int dices = generator.nextInt(6)+1 + generator.nextInt(6)+1; 
                    // dois dados ... 0 até 6 exclusive!!!  netInt(7) seria melhor
                    int attackValue = yourAttack + dices;

                    System.out.println("Rolled values: "+dices);
                    System.out.println("Your attack value: "+attackValue);

                    if (attackValue > monsterDefense) {
                        System.out.println("Your attack was SUCCESSFUL!");

                        monsterLife = monsterLife - yourDamage;
                        System.out.println(monsterName+"´s remaining Life Points is "+monsterLife);
                    } else {
                        System.out.println("Your attack was weak. Sorry!");

                    }

                } else {
                    contador++;
                    contadorMonster++;
                    System.out.println(" ");
                    System.out.println(contador+"º ATTACK ====================================== ");
                    System.out.println(monsterName+" ATTACKS YOU <<<<<<<<<<<<<<< ");
                    // dois dados ... 0 até 6 exclusive!!!  netInt(7) seria melhor
                    int dices = generator.nextInt(6)+1 + generator.nextInt(6)+1;
                    int attackValue = yourAttack + dices;

                    System.out.println("Rolled values: "+dices);
                    System.out.println(monsterName+" attack value: "+attackValue);

                    if (attackValue > yourDefense) {
                        System.out.println(monsterName+" attack was SUCCESSFUL!");

                        yourLife = yourLife - monsterDamage;
                        System.out.println("Your remaining Life Points is "+yourLife);
                    } else {
                        System.out.println("WOW, "+monsterName+" attack was WEAK. God!!!");

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
                frase = "You run away from "+monsterName+". YOU COWARD! -4 Life points!";
            } else {

                if (monsterLife > 0){
                    frase = "Infelizmente o "+monsterName+" ganhou a luta e você morreu!";
                } else {
                    frase = "Parabéns!!! Você conseguiu matar o "+monsterName+"!";
                }

            }



            System.out.println(" ");
            System.out.println(" ");
            System.out.println("====================================================");
            System.out.println("*** "+frase+" ***");
            System.out.println(" ");
            System.out.println("Total de ataques: "+contador);
            System.out.println("Sua vida: "+yourLife+"   Seus ataques: "+contadorYour);
            System.out.println("Vida do "+monsterName+": "+monsterLife+"   Ataques do "+monsterName+": "+contadorMonster);
            System.out.println("====================================================");
            System.out.println(" ");
            System.out.println(" ");
        
        }
    }
    
}
