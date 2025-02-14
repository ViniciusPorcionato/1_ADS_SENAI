package com.mycompany.exerciciosaula1tb;

import java.util.Scanner;

/**
 *
 * @author Vinicius Porcionato
 */
public class ExerciciosAula1Parte2TB {

    public static void main(String[] args) {

//        2. Usando os códigos de formatação, faça um algoritmo para imprimir seu nome, sua idade e o seu peso. 
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        

        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();
        System.out.println("Digite sua idade:");
        int idade = sc1.nextInt();
        System.out.println("Digite seu peso:");
        float peso = sc.nextFloat();
        
        System.out.printf("Nome: %s | Idade: %d | Peso: %.2f", nome, idade, peso);

    }
}
