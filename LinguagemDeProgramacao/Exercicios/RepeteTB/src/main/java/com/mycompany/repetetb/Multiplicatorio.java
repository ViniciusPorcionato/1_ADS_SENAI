package com.mycompany.repetetb;

import java.util.Scanner;

/**
 *
 * @author 25170641
 */
public class Multiplicatorio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        double nota, p =1;
        
        System.out.println("Entre com um valor para nota: ");
        
        nota = sc.nextDouble();
        p = p * nota;
        
        System.out.println("Entre com valor para outra nota: ");
        nota = sc.nextDouble();
        p = p * nota;
        
        System.out.println("A multiplicação das notas é = " + p);
    }
}
