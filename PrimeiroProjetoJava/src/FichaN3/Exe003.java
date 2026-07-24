/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FichaN3;
import java.util.Scanner;

/**
 *. Tabuada
    Cria um programa que leia um número inteiro
*   e mostre a tabuada desse número de 1 a 
    10 usando um for.
 * 
 * @author jeanw
 */
public class Exe003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        
        System.out.print("Insira um Numero para saber sua tabuada: \n");
        n = sc.nextByte();
        int mult;
        
        for (int i = 1; i <= 10; i++) {
            mult = i * n;
            System.out.printf("%d * %d = %d \n", n, i, mult );
            
        }
        
        
    }
    
}
