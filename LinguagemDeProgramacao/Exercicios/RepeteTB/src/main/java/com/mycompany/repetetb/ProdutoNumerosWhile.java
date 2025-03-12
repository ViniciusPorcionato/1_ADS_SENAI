package com.mycompany.repetetb;

import java.util.Scanner;

public class ProdutoNumerosWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int produto = 1;
        boolean continuar = true;
        
        while (continuar) {
            System.out.print("Digite um número (digite 0 para parar): ");
            int numero = sc.nextInt();
            
            if (numero == 0) {
                continuar = false; 
            } else {
                produto *= numero;
            }
        }
        
        System.out.println("O produto dos números é: " + produto);
    }
}
