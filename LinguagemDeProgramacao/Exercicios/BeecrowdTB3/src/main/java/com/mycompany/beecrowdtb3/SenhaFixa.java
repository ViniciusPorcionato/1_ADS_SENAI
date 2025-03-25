/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.beecrowdtb3;

import java.util.Scanner;

/**
 *
 * @author Vinicius Porcionato
 */
public class SenhaFixa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Lê a primeira tentativa de senha
        int senha = sc.nextInt();
        
        // Loop enquanto a senha não for correta
        while (senha != 2002) {
            System.out.println("Senha Invalida"); // Mensagem para senha incorreta
            senha = sc.nextInt();                // Lê a próxima tentativa
        }
        
        // Quando a senha for correta (2002), sai do loop
        System.out.println("Acesso Permitido");
        
        sc.close();
    }
}
