package aula1.beecrowdtb;

import java.util.Scanner;

public class ProdutoSimples {

//    Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua esta operação à variável PROD. A seguir mostre a variável PROD com mensagem correspondente.   
//
//    Entrada
//    O arquivo de entrada contém 2 valores inteiros.
//
//    Saída
//    Imprima a mensagem "PROD" e a variável PROD conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade. Não esqueça de imprimir o fim de linha após o produto, caso contrário     seu programa apresentará a mensagem: “Presentation Error”.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        int PROD = num1 * num2;
        System.out.println("PROD = "+PROD);
        
    }
}
