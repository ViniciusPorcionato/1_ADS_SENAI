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
public class GuardaCosteira {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // O método hasNext() retorna true se houver mais dados na entrada
        // No beecrowd, isso significa que o loop continua até encontrar o EOF (fim de arquivo)
        // É a forma padrão de ler múltiplos casos de teste até acabar a entrada
        while (sc.hasNext()) {
            int D = sc.nextInt();  // Distância inicial entre os barcos
            int VF = sc.nextInt(); // Velocidade do fugitivo
            int VG = sc.nextInt(); // Velocidade da guarda costeira
            
            // Calcula a distância que a guarda precisa percorrer (hipotenusa do triângulo)
            // Usa teorema de Pitágoras: √(D² + 12²)
            double distanciaGuarda = Math.sqrt(D * D + 12 * 12);
            
            // Tempo do fugitivo = distância fixa de 12 milhas ÷ velocidade dele
            // Usamos 12.0 para forçar divisão em double e evitar truncamento
            double tempoFugitivo = 12.0 / VF;
            
            // Tempo da guarda = distância que ela percorre ÷ velocidade dela
            double tempoGuarda = distanciaGuarda / VG;
            
            // Se o tempo da guarda for menor ou igual ao do fugitivo,
            // significa que ela chega antes ou exatamente quando o fugitivo alcança 12 milhas
            if (tempoGuarda <= tempoFugitivo) {
                System.out.println("S"); // Sim, a guarda alcança
            } else {
                System.out.println("N"); // Não, o fugitivo escapa
            }
        }
    }
}
