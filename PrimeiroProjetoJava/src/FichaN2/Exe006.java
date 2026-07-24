/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FichaN2;
import java.util.Scanner;
/**
 * Temperatura
    Cria um programa que leia uma temperatura (em °C) e mostre: 
    "Está frio" se for menor que 15 
    "Está quente" caso contrário 
 * 
 * @author jeanw
 */
public class Exe006 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double temp;
        System.out.print("Insira a Temperatura °C: ");
        temp = sc.nextDouble();
        
        if (temp < 15) {
            System.out.printf("Esta frio com a temperatura de %.1f \n", temp);
        }else{
            System.out.printf("Esta quente com a temperatura de %.1f \n", temp);
        }
        sc.close();
    }
    
    
}
