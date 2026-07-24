/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FichaN3;
import java.util.Scanner;
/**
 *. Números pares
    Cria um programa que mostre todos os números
*   pares entre 1 e 20 usando um for.

 * 
 * @author jeanw
 */
public class Exe004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 21; i++) {
            if (i%2==0) {
                System.out.print(i+ "\n");
            }
            
        }
    }
    
}
