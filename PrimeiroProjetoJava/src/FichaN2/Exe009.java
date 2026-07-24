/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FichaN2;

import java.util.Scanner;

/**
 *. Classificação de temperatura
    Cria um programa que leia uma temperatura (em °C) e mostre: 
    "Frio" se for menor que 10 
    "Agradável" se estiver entre 10 e 25 
    "Quente" se for maior que 25 
 * 
 * @author jeanw
 */
public class Exe009 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        
        double temp;
        System.out.print("Insira a Temperatura °C: ");
        temp = sc.nextDouble();
        
        if (temp < 10) {
            System.out.printf("Esta frio com a temperatura de %.1f \n", temp);
        }else if (temp <25){
            System.out.printf("Esta Agradavel com a temperatura de %.1f \n", temp);
        }
        else {
            System.out.printf("Esta Quente com a temperatura %.1f \n" ,temp);
        }
        sc.close();
    }
    
    }
    

