/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package replace;

/**
 *
 * @author User
 */
public class Replace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int first = 7;
        int second = 14;
        System.out.println(first+ " x 2 = "+second);
        String esp = " ";
        String operacao = "vezes dois";
        String igual = "é igual a";
        System.out.println(first+esp+operacao+esp+igual+esp+second);
        operacao = "dividido por dois";
        int third;
        third = second;
        second = first;
        first = third;
        System.out.println(first+esp+operacao+esp+igual+esp+second);
        
        
        
    }
    
}
