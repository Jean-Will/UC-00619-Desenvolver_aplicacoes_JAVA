/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FichaN1;
import java.util.Scanner;
/**
 *
 * @author jeanw
 */
public class Ex006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double distancia;
        double tempo;
        double velocidade;
        double converter;
        double converterTempo;
        
        System.out.print("Insira a Distancia em KM: ");
        distancia = sc.nextDouble();
        
        System.out.print("Insira o tempo em minutos: ");
        tempo = sc.nextDouble();
        
        converter = distancia * 1000;
        converterTempo = tempo * 60;
        
        //velocidade = distancia / tempo;
        velocidade = converter / converterTempo;
        
        System.out.printf("A velocidade media e: %.2f metros por segundo\n",velocidade);
        
    }
}
