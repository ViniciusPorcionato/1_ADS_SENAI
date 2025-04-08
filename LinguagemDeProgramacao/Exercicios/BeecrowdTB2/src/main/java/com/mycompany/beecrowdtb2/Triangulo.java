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
public class Triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Leitura dos três valores reais
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        
        // Verifica se forma um triângulo (condição de existência)
        if (A + B > C && B + C > A && A + C > B) {
            // Calcula o perímetro
            double perimetro = A + B + C;
            System.out.printf("Perimetro = %.1f%n", perimetro);
        } else {
            // Calcula a área do trapézio ((base1 + base2) * altura) / 2
            double area = ((A + B) * C) / 2;
            System.out.printf("Area = %.1f%n", area);
        }
    }
}
