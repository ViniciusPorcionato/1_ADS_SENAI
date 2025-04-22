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
public class AtividadeVetorEMatrizes2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria objeto Scanner para ler entrada do usuário
        
        // Solicita o tamanho do vetor
        System.out.print("Digite o tamanho do vetor: "); // Exibe mensagem pedindo o tamanho
        int tamanho = scanner.nextInt(); // Lê o tamanho do vetor
        
        // Declara o vetor com o tamanho informado
        int[] vetor = new int[tamanho]; // Cria um vetor de inteiros com o tamanho especificado
        
        // Preenche o vetor com valores fornecidos pelo usuário
        System.out.println("Digite os elementos do vetor:"); // Exibe mensagem para entrada dos elementos
        for (int i = 0; i < tamanho; i++) { // Loop para percorrer cada posição do vetor
            System.out.printf("Elemento %d: ", i + 1); // Solicita o elemento na posição i
            vetor[i] = scanner.nextInt(); // Lê o valor e armazena no vetor
        }
        
        // Solicita o valor a ser procurado
        System.out.print("Digite o valor a ser procurado: "); // Exibe mensagem pedindo o valor
        int valorProcurado = scanner.nextInt(); // Lê o valor a ser buscado
        
        // Procura o valor no vetor
        boolean encontrado = false; // Variável para indicar se o valor foi encontrado
        int posicao = -1; // Variável para armazenar a posição onde o valor foi encontrado (-1 indica não encontrado)
        for (int i = 0; i < tamanho; i++) { // Loop para percorrer o vetor
            if (vetor[i] == valorProcurado) { // Verifica se o elemento na posição i é igual ao valor procurado
                encontrado = true; // Marca que o valor foi encontrado
                posicao = i; // Armazena a posição onde o valor foi encontrado
                break; // Sai do loop após encontrar a primeira ocorrência
            }
        }
        
        // Exibe o resultado da busca
        if (encontrado) { // Verifica se o valor foi encontrado
            System.out.printf("O valor %d foi encontrado na posição %d.\n", valorProcurado, posicao); // Imprime a posição
        } else { // Caso o valor não tenha sido encontrado
            System.out.printf("O valor %d não foi encontrado no vetor.\n", valorProcurado); // Imprime mensagem de não encontrado
        }
    }
}
