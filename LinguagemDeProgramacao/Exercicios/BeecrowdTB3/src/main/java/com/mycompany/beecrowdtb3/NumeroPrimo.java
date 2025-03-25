package com.mycompany.beecrowdtb3;

import java.util.Scanner;

public class NumeroPrimo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Lê o número de casos de teste
        int N = sc.nextInt();
        
        // Loop para processar cada caso de teste
        while (N > 0) {
            int X = sc.nextInt(); // Lê o número a ser testado
            int divisor = 2;      // Começa testando divisores a partir de 2
            boolean ehPrimo = true; // Assume inicialmente que é primo
            
            // Enquanto divisor for menor que X e ainda não encontramos um divisor
            while (divisor < X) {
                if (X % divisor == 0) { // Se X for divisível por divisor
                    ehPrimo = false;    // Não é primo
                    break;              // Sai do loop, não precisa testar mais
                }
                divisor++; // Testa o próximo divisor
            }
            
            // Casos especiais: se X for 1, não é primo
            if (X == 1) {
                ehPrimo = false;
            }
            
            // Imprime o resultado
            if (ehPrimo) {
                System.out.println(X + " eh primo");
            } else {
                System.out.println(X + " nao eh primo");
            }
            
            N--; // Decrementa o número de casos restantes
        }
        
        sc.close();
    }
}
