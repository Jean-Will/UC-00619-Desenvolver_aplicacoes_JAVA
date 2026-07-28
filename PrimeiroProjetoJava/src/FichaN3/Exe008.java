/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FichaN3;

import java.util.Scanner;

/**
 * 
 *  Contar números
    Cria um programa que leia números inteiros
* e conte quantos foram introduzidos até o 
    utilizador inserir o número 0.
 *
 * @author jeanw
 */
public class Exe008 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);
        
        int numInt;
        int contador;
        
        System.out.print("Insira um numero: ");
        numInt = sc.nextInt();  
        contador = 0;
        
        while(numInt != 0){
            if (numInt <0) {
                System.out.print(numInt);
                System.out.print("\nInsira um numero: ");
                numInt = sc.nextInt();  
            }else if(numInt >0){
                contador = contador +1;
                System.out.print("Esta e a conta dos numeros positivos !!" + " " +  contador);
                System.out.print("\nInsira um numero: ");
                numInt = sc.nextInt();  
                
            }else if (numInt == 0) {
                System.out.print("Sistema encerrado pelo User");
                System.out.print(contador);
            }
            else{
                System.out.print("Caracter invalido");
            }
            
        }
    }
    
}
