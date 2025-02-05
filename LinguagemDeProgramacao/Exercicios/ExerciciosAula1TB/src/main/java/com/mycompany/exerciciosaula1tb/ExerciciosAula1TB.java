package com.mycompany.exerciciosaula1tb;

import java.util.Scanner;

/**
 *
 * @author Vinicius Porcionato
 */
public class ExerciciosAula1TB {

    public static void main(String[] args) {
//        1. Faça um algoritmo para imprimir em cada linha: o seu nome completo, o seu RA e o seu curso
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();
        
        System.out.println("Digite seu sobrenome:");
        String sobrenome = sc.nextLine();
        
        System.out.println("Digite seu RA:");
        int ra = sc.nextInt();
        sc.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()
        
        System.out.println("Digite seu curso:");
        String curso = sc.nextLine();
        
        System.out.println("Nome Completo: " + nome + " " + sobrenome );
        System.out.println("RA: " + ra);
        System.out.println("Curso: " + curso );
        
        sc.close(); //Fechar o scanner
                
    }
}
