/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inputjoption;

import javax.swing.JOptionPane;

/**
 *
 * @author 25170641
 */
public class InputJOption {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Qual seu nome?",
                "Digite aqui");
        JOptionPane.showMessageDialog(null, "seu nome é " + nome);
        String outroNome = JOptionPane.showInputDialog(null, "Qual o outro nome?",
                "Entrada de dados", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, outroNome, "outro nome é ", JOptionPane.ERROR_MESSAGE);
    }
}
