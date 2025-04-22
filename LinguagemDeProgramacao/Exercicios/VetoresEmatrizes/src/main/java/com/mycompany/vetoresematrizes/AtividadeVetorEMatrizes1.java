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
public class AtividadeVetorEMatrizes1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria objeto Scanner para ler entrada do usuário
        
        // Declara arrays para armazenar 30 nomes e 30 notas
        String[] nomes = new String[30]; // Array para os nomes dos alunos
        double[] notas = new double[30]; // Array para as notas dos alunos
        double somaNotas = 0; // Variável para acumular a soma das notas
        double media; // Variável para armazenar a média da turma
        
        // Loop para ler os 30 nomes e notas
        for (int i = 0; i < 30; i++) { // Loop que itera 30 vezes
            System.out.printf("Digite o nome do aluno %d: ", i + 1); // Solicita o nome do aluno
            nomes[i] = scanner.nextLine(); // Lê o nome e armazena no array nomes
            
            System.out.printf("Digite a nota do aluno %d: ", i + 1); // Solicita a nota do aluno
            notas[i] = scanner.nextDouble(); // Lê a nota e armazena no array notas
            somaNotas += notas[i]; // Adiciona a nota à soma total
            scanner.nextLine(); // Consome a quebra de linha pendente para evitar erros na próxima leitura
        }
        
        // Calcula a média da turma
        media = somaNotas / 30; // Divide a soma das notas por 30 para obter a média
        
        // Exibe a média da turma
        System.out.printf("\nMédia da turma: %.2f\n", media); // Imprime a média com 2 casas decimais
        
        // Exibe os alunos com nota igual ou acima da média
        System.out.println("\nAlunos com nota igual ou acima da média:");
        for (int i = 0; i < 30; i++) { // Loop para verificar cada aluno
            if (notas[i] >= media) { // Verifica se a nota do aluno é maior ou igual à média
                System.out.printf("Nome: %s, Nota: %.2f\n", nomes[i], notas[i]); // Imprime nome e nota do aluno
            }
        }
    }
}
