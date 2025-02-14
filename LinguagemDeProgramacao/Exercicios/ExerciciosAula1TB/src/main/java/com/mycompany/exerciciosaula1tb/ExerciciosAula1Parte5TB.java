package com.mycompany.exerciciosaula1tb;

import java.util.Scanner;

/**
 *
 * @author Vinicius Porcionato
 */
public class ExerciciosAula1Parte5TB {

    public static void main(String[] args) {
//        6. Construir um algoritmo para imprimir o cálculo da circunferência de um círculo com raio de 5 cm (π = 3,14159), dado que: p∘ = 2πr
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o raio da circunferência:");
        float raio = sc.nextFloat();
        
        final double pi = 3.14159;
        
        double areaCircunferencia = 2 * pi * raio;
        
        System.out.println("Area da circunferência é igual há: " + areaCircunferencia);
        
    }
}
