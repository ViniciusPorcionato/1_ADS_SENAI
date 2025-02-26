package com.mycompany.condicoestb;

import java.util.Scanner;

public class CondicoesTB5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nivelProfessor;
        double horasTrabalhadas, salario;

        System.out.println("Qual o nível do professor?");
        nivelProfessor = sc.nextInt();

        System.out.println("Informe a quantidade de hora/aula trabalhada");
        horasTrabalhadas = sc.nextDouble();

        if (nivelProfessor == 1) {
            salario = horasTrabalhadas * 12.0;
            System.out.println("Salário de : R$" + salario);

        } else if (nivelProfessor == 2) {
            salario = horasTrabalhadas * 17.0;
            System.out.println("Salário de : R$" + salario);

        } else if (nivelProfessor == 3) {
            salario = horasTrabalhadas * 25.0;
            System.out.println("Salário de : R$" + salario);

        } else {
            System.out.println("Nível não identificado");
        }
    }
}   
