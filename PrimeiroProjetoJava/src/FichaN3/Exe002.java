/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FichaN3;
import java.util.Scanner;
/**
 * Soma de números
    Cria um programa que leia um número inteiro N
*   e calcule a soma de todos os números 
    de 1 até N usando um for.
 * 
 * @author jeanw
 */
public class Exe002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int soma;
        soma = 0;
        
        System.out.print("Insira um Numero: ");
        n = sc.nextByte();
        
        for (int i = 1; i <= n; i++) {
            
            System.out.print(i+"\n");
            soma = soma + n;
            //System.out.printf("%d + %d = %d \n ",  i, i, soma );
            
        }
        System.out.printf("A soma dos numeros ate %d e = %d \n ", n, soma);
         
    }
    
}
