/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula1.beecrowdtb;

import java.util.Scanner;

public class Media2 {
//    Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5.     Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
//
//    Entrada
//    O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).
//
//    Saída
//    Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 1 dígito após o ponto decimal e com um espaço em branco antes e depois da igualdade. Assim como todos os problemas, n    ão esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A, B, C;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        double media = (A * 2 + B*3 + C*5) / 10;
        System.out.printf("MEDIA = %.1f\n" , media);
    }
}
