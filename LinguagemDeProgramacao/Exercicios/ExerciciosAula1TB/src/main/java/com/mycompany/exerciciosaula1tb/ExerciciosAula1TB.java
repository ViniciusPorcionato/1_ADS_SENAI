package com.mycompany.exerciciosaula1tb;

import java.util.Scanner;

/**
 *
 * @author Vinicius Porcionato
 */
public class ExerciciosAula1TB {

    public static void main(String[] args) {
//        1. Faça um algoritmo para imprimir em cada linha: o seu nome completo, o seu RA e o seu curso
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        
        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.nextLine();
        
        System.out.println("Digite seu RA:");
        int ra = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()
        
        System.out.println("Digite seu curso:");
        String curso = scanner.nextLine();
        
        System.out.println("Nome Completo: " + nome + " " + sobrenome );
        System.out.println("RA: " + ra);
        System.out.println("Curso: " + curso );
        
        scanner.close(); //Fechar o scanner
                
    }
}
