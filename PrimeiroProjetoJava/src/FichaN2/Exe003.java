/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FichaN2;
import java.util.Scanner;
/**
 *
 * . Número par
    Cria um programa que Leia um número inteiro
*   e Mostre "Número par" se o número for 
    divisível por 2
 * 
 * @author jeanw
 */
public class Exe003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        System.out.print("Insira um numero: ");
        num = sc.nextInt();
        
        if (num %2 == 0) {
            System.out.printf("O Numero %d e Par \n", num);
        }else{
            System.out.printf("O numero %d e Impar \n", num);
        }
        
        
    }
    
}
