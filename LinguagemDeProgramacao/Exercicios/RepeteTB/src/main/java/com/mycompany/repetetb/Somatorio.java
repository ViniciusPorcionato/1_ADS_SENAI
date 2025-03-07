package com.mycompany.repetetb;

import java.util.Scanner;

public class Somatorio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double nota, soma = 0;
        
        System.out.println("entre com valor para a primeira nota: ");
        nota = sc.nextDouble();
        soma = soma + nota;
        
        System.out.println("Entre com um valor para a segunda nota: ");
        nota = sc.nextDouble();
        soma = soma + nota;
        
        System.out.println("A soma das notas é = " + soma);
    }
}
