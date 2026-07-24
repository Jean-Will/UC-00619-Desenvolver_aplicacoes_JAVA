/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FichaN2;
import java.util.Scanner;
/**
 *. Maior de idade
    Cria um programa que Leia a idade de uma 
*   pessoa e mostre "Maior de idade" se a 
    idade for maior ou igual a 18.
 * 
 * @author jeanw
 */
public class Exe002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int idade;
        
        System.out.print("Insira sua Idade: ");
        idade = sc.nextInt();
        if (idade >= 18) {
            System.out.printf("Maior de idade com %d anos \n", idade);
        }else{
            System.out.printf("Menor de idade com %d anos \n", idade);
        }
        
        
    }
    
}
