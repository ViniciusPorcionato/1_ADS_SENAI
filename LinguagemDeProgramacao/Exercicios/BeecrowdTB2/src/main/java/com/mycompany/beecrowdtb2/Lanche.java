/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.beecrowdtb2;

import java.util.Scanner;

/**
 *
 * @author 25170641
 */
public class Lanche {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        double total = 0.0;

        if (codigo == 1) {
            total = 4.00 * quantidade;
        } else if (codigo == 2) {
            total = 4.50 * quantidade;
        } else if (codigo == 3) {
            total = 5.00 * quantidade;
        } else if (codigo == 4) {
            total = 2.00 * quantidade;
        } else if (codigo == 5) {
            total = 1.50 * quantidade;
        }else{
            System.out.println("Código inválido");
        }
        
        System.out.printf("Total: R$ %.2f%n", total);

    }
}
