/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vetoresematrizes;

import java.util.Scanner;

/**
 *
 * @author Vinicius Porcionato
 */
public class AtividadeVetorEMatrizes3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria objeto Scanner para ler entrada do usuário
        
        // Declara dois vetores de 15 posições
        int[] vetor1 = new int[15]; // Primeiro vetor
        int[] vetor2 = new int[15]; // Segundo vetor
        
        // Lê os elementos do primeiro vetor
        System.out.println("Digite os 15 elementos do primeiro vetor:"); // Exibe mensagem para o primeiro vetor
        for (int i = 0; i < 15; i++) { // Loop para percorrer as 15 posições
            System.out.printf("Elemento %d: ", i + 1); // Solicita o elemento na posição i
            vetor1[i] = scanner.nextInt(); // Lê o valor e armazena no vetor1
        }
        
        // Lê os elementos do segundo vetor
        System.out.println("\nDigite os 15 elementos do segundo vetor:"); // Exibe mensagem para o segundo vetor
        for (int i = 0; i < 15; i++) { // Loop para percorrer as 15 posições
            System.out.printf("Elemento %d: ", i + 1); // Solicita o elemento na posição i
            vetor2[i] = scanner.nextInt(); // Lê o valor e armazena no vetor2
        }
        
        // Compara os vetores e exibe as posições com valores iguais
        System.out.println("\nPosições onde os vetores têm valores iguais:"); // Exibe cabeçalho
        boolean encontrouIgual = false; // Variável para verificar se há posições iguais
        for (int i = 0; i < 15; i++) { // Loop para comparar os vetores
            if (vetor1[i] == vetor2[i]) { // Verifica se os elementos na posição i são iguais
                System.out.printf("Posição %d: valor %d\n", i, vetor1[i]); // Exibe a posição e o valor
                encontrouIgual = true; // Marca que encontrou pelo menos uma igualdade
            }
        }
        
        // Verifica se não houve posições com valores iguais
        if (!encontrouIgual) { // Se não encontrou nenhuma igualdade
            System.out.println("Nenhuma posição contém valores iguais."); // Exibe mensagem
        }
    }
}
