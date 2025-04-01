package com.mycompany.vetoresematrizes;

public class Vetor01 {

    public static void main(String[] args) {
        int vetorLost[]={4, 8, 15, 16, 23, 42};
        String nome[] = {"Vinicius","Pedro","Miguel","Vitor"};
        
        for (int i = 0; i < 6; i++) {
            System.out.println("V[" + i + "]=" + vetorLost[i]);
        }
        for (int j = 0; j < 4; j++) {
            System.out.println("V[" + j + "] = " + nome[j]);
        }
    }
}