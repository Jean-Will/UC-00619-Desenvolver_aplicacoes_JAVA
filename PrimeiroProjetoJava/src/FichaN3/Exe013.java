/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FichaN3;
import java.util.Scanner;
/**
 *. Número válido
    Cria um programa que peça um número ao 
*   utilizador e repita enquanto o número for 
    menor que 1 ou maior que 10.
 * 
 * 
 * @author jeanw
 */
public class Exe013 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        
        System.out.print("Insira um numero: \n");
        num = sc.nextInt();
        
        while(num < 1 || num > 10){
            System.out.print("Insira um numero: \n");
            num = sc.nextInt();
            
        }
        
        
        
        
    }
    
}
