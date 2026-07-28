/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FichaN3;
import java.util.Scanner;
/**
 *. Soma de positivos
    Cria um programa que leia números inteiros e some apenas os positivos, terminando 
    quando for introduzido um número negativo ENCERRAR QUANDO FOR 0.
 * 
 * 
 * @author jeanw
 */
public class Exe007 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numInt;
        int soma;
        
        System.out.print("Insira um numero: ");
        numInt = sc.nextInt();  
        soma = 0;
        
        while(numInt != 0){
            if (numInt <0) {
                System.out.print(numInt);
                System.out.print("\nInsira um numero: ");
                numInt = sc.nextInt();  
            }else if(numInt >0){
                soma = soma + numInt;
                System.out.print("Esta e a soma dos positivos !!" + " " +  soma);
                System.out.print("\nInsira um numero: ");
                numInt = sc.nextInt();  
                
            }else if (numInt == 0) {
                System.out.print("Sistema encerrado pelo User");
                System.out.print(soma);
            }
            else{
                System.out.print("Caracter invalido");
            }
            
        }
        
        
        
        
    }
    
}
