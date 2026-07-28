/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FichaN3;
import java.util.Scanner;
/**
 *. Divisões sucessivas
    Cria um programa que leia um número inteiro e
* o divida por 2 repetidamente até que o 
    resultado seja menor que 1, usando um while.
 * 
 * 
 * @author jeanw
 */
public class Exe010 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        float resto;
        
        System.out.print("Insira um numero: \n");
        num = sc.nextInt();
        
        while(num /2 >1){
            
            num = num %2;
            System.out.printf("o numero %d foi /2 \n", num);
        }
        
    }
    
}
