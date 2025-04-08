/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.beecrowdtb2;

import java.util.Scanner;

/**
 *
 * @author Vinicius Porcionato
 */
public class EncaixaOuNao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura do número de casos de teste
        int N = sc.nextInt();

        // Processa cada caso de teste
        for (int i = 0; i < N; i++) {
            // Leitura dos valores A e B
            long A = sc.nextLong();
            long B = sc.nextLong();

            // Converte A e B para strings
            String strA = String.valueOf(A);
            String strB = String.valueOf(B);

            // Verifica se B encaixa nos últimos dígitos de A
            if (strA.endsWith(strB)) {
                System.out.println("encaixa");
            } else {
                System.out.println("nao encaixa");
            }
        }
    }
}
