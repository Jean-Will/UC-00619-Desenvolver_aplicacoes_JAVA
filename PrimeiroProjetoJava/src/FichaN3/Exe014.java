/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FichaN3;
import java.util.Scanner;
/**
 * Soma de números
    Cria um programa que peça números ao utilizador 
*   e vá somando, parando apenas 
    quando o utilizador introduzir o número 0.

 * 
 * 
 * @author jeanw
 */
public class Exe014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int soma;
        
        System.out.print("Insira um numero: \n");
        num = sc.nextInt();
        soma = 0;
        
        while(num !=0){
            soma = soma + num;
            System.out.print("Insira um numero: \n");
            num = sc.nextInt();
        }
        System.out.printf("A Soma dos numeros e: %d \n", soma);
        
        
        
        
        
    }
    
}
