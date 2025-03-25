/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.beecrowdtb3;

/**
 *
 * @author Vinicius Porcionato
 */
public class SequenciaIJ {
    public static void main(String[] args) {
        // Inicializa I e o valor inicial de J
        int I = 1;
        int J = 7;
        
        // Loop externo para I até 9
        while (I <= 9) {
            // Loop interno para imprimir 3 valores de J
            int contador = 0;
            int J_atual = J;
            while (contador < 3) {
                System.out.println("I=" + I + " J=" + J_atual);
                J_atual--; // Diminui J
                contador++;
            }
            // Atualiza I e J para a próxima sequência
            I += 2;  // I aumenta de 2 em 2
            J += 2;  // O próximo J inicial aumenta de 2 em 2
        }
    }
}
