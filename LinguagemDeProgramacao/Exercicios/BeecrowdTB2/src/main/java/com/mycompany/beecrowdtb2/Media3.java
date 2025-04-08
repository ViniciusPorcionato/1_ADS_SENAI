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
public class Media3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Leitura das quatro notas separadas por espaços
        double N1 = sc.nextDouble();
        double N2 = sc.nextDouble();
        double N3 = sc.nextDouble();
        double N4 = sc.nextDouble();
        
        // Cálculo da média ponderada (pesos 2, 3, 4, 1)
        double media = (N1 * 2 + N2 * 3 + N3 * 4 + N4 * 1) / (2 + 3 + 4 + 1);
        
        // Imprime a média inicial
        System.out.printf("Media: %.1f%n", media);
        
        // Verifica a situação do aluno
        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            
            // Lê a nota do exame
            double notaExame = sc.nextDouble();
            System.out.printf("Nota do exame: %.1f%n", notaExame);
            
            // Calcula a média final
            double mediaFinal = (media + notaExame) / 2;
            
            // Verifica o resultado após exame
            if (mediaFinal >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f%n", mediaFinal);
        }
    }
}
