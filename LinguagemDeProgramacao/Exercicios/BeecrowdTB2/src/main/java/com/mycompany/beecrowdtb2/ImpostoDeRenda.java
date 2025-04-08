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
public class ImpostoDeRenda {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura do salário
        double salario = sc.nextDouble();

        // Variável para armazenar o imposto
        double imposto = 0.0;

        // Cálculo do imposto com base nas faixas
        if (salario <= 2000.00) {
            imposto = 0.0;
        } else if (salario <= 3000.00) {
            // 8% sobre o valor que excede 2000.00
            imposto = (salario - 2000.00) * 0.08;
        } else if (salario <= 4500.00) {
            // 8% sobre os primeiros 1000.00 (de 2000.01 até 3000.00)
            // 18% sobre o valor que excede 3000.00
            imposto = (1000.00 * 0.08) + (salario - 3000.00) * 0.18;
        } else {
            // 8% sobre os primeiros 1000.00 (de 2000.01 até 3000.00)
            // 18% sobre os próximos 1500.00 (de 3000.01 até 4500.00)
            // 28% sobre o valor que excede 4500.00
            imposto = (1000.00 * 0.08) + (1500.00 * 0.18) + (salario - 4500.00) * 0.28;
        }

        // Impressão do resultado
        if (imposto == 0.0) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f%n", imposto);
        }
    }
}
