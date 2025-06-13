package com.mycompany.testeprova;

import java.util.Scanner;

public class TesteProva3 {

//Fase 1 – OBI2025
//
//Lina está aprendendo multiplicação e resolveu criar uma máquina que aplica uma regra diferente para multiplicar dois números. 
// A máquina recebe dois inteiros positivos A e B, e calcula o resultado conforme as seguintes regras:
//
//Se A e B são ambos pares, o resultado é A × B.
//
//Se A e B são ambos ímpares, o resultado é A + B.
//
//Caso contrário (um é par e o outro é ímpar), o resultado é o valor absoluto da diferença entre A e B, ou seja: |A − B|.
//
//Ajude Lina a implementar essa máquina escrevendo um programa que leia os dois valores e imprima o resultado correto.
//
//📥 Entrada
//A entrada consiste de duas linhas, cada uma contendo um número inteiro:
//
//A primeira linha contém o número A.
//
//A segunda linha contém o número B.
//
//📤 Saída
//Seu programa deve imprimir um único número inteiro: o resultado da operação definida pela máquina.
//
//📌 Restrições
//1 ≤ A ≤ 100
//
//1 ≤ B ≤ 100
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int resultado;

        if (a >= 1 && a <= 100 && a % 2 == 0 && b >= 1 && b <= 100 && b % 2 == 0) {
            resultado = a * b;
            System.out.println(resultado);
        } else if (a >= 1 && a <= 100 && a % 2 == 1 && b >= 1 && b <= 100 && b % 2 == 1) {
            resultado = a + b;
            System.out.println(resultado);
        } else {
            resultado = a - b;
            System.out.println(resultado);
        }
    }

}
