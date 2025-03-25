
package com.mycompany.beecrowdtb3;

import java.util.Scanner;

/**
 *
 * @author Vinicius Porcionato
 */
public class MaiorEPosicao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Variáveis para armazenar o maior valor e sua posição
        int maior = Integer.MIN_VALUE; // Inicializa com o menor valor possível
        int posicao = 0;               // Posição do maior valor
        int contador = 1;              // Contador para controlar as 100 leituras
        
        // Lê 100 valores usando while
        while (contador <= 100) {
            int valor = sc.nextInt();  // Lê o valor atual
            if (valor > maior) {       // Se o valor for maior que o atual maior
                maior = valor;         // Atualiza o maior valor
                posicao = contador;    // Atualiza a posição
            }
            contador++;                // Incrementa o contador
        }
        
        // Imprime o maior valor e sua posição
        System.out.println(maior);
        System.out.println(posicao);
        
        sc.close();
    }
}
