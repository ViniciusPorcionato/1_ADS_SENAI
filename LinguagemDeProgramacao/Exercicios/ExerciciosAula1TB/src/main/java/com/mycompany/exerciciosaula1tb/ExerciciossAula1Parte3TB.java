package com.mycompany.exerciciosaula1tb;

import java.util.Scanner;

/**
 *
 * @author Vinicius Porcionato
 */
public class ExerciciossAula1Parte3TB {

    public static void main(String[] args) {
//        4. Faça um algoritmo para apresentar o cálculo da média aritmética das seguintes notas: 
//	     8.0, 7.5, 4.5 e 9.

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a nota 1:");
        float nota1 = sc.nextFloat();
        System.out.println("Digite a nota 2:");
        float nota2 = sc.nextFloat();
        System.out.println("Digite a nota 3:");
        float nota3 = sc.nextFloat();
        System.out.println("Digite a nota 4:");
        float nota4 = sc.nextFloat();
        
        float media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        System.out.printf("Média do aluno é: %.2f", media);

    }
}
