/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FichaN3;
import java.util.Scanner;
/**
 *  Número dentro do intervalo
    Cria um programa que leia um número inteiro e
*   continue a pedir enquanto o número não 
    estiver entre 1 e 100.
 * 
 * @author jeanw
 */
public class Exe006 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.print("Insira um numero: ");
        num = sc.nextInt();
        while(num >0 && num <100){
        System.out.print(" ## ");
        }
        
    }
    
}
