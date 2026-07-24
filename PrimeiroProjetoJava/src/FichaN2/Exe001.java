/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FichaN2;
import java.util.Scanner;

/**
 *
 * . Número positivo
    Cria um programa que leia um número inteiro e mostre a mensagem "Número positivo" 
    se o número for maior que 0.
 * @author jeanw
 */
public class Exe001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        
        System.out.print("Insira um Numero: ");
        num = sc.nextInt();
        
        if (num > 0) {
            System.out.printf("O numero %d, e numero Positivo \n", num);
        }else{
            System.out.printf("O numero %d e Negativo \n", num);
        }
        
    }
    
}
