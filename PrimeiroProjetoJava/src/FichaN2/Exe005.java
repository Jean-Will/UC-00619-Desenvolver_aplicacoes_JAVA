/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FichaN2;
import java.util.Scanner;
/**
 * 
 * Múltiplo de 5
    Cria um programa que leia um número inteiro 
*   e mostre "Múltiplo de 5" se o número for 
    divisível por 5.
    * 
 * @author jeanw
 */
public class Exe005 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        
        System.out.print("Insira um  numero: ");
        num = sc.nextInt();
        
        if (num %5 == 0 ) {
            System.out.printf("O Numero: %d e multiplo de 5 \n", num);
        }else{
            System.out.printf("O Numero nao e multiplo de 5 \n", num);
        }
        
    }
    
}
