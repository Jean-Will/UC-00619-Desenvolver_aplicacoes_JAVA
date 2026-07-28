/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FichaN3;
import java.util.Scanner;
/**
 *. Menu de opções
    Cria um programa que mostre um menu com opções
* (1- Somar, 2- Subtrair, 0- Sair) e 
    continue a aparecer até o utilizador escolher a opção 0.
 * 
 * 
 * @author jeanw
 */
public class Exe011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int opcao;
        int operacao;
        
        System.out.print("(1- Somar, 2- Subtrair, 0- Sair)");
        
        System.out.print("Insira a opcao de escolha: ");
        opcao = sc.nextInt();    
        
        switch(opcao ){
            case 1:
                System.out.print("Somar\n");
                System.out.print("Insira um numero para somar: + 5 \n");
                num = sc.nextInt();
                operacao = num + 5 ;
                System.out.printf("A soma e : %d", operacao);
                break;
            case 2:
                System.out.print("Subtrair\n");
                System.out.print("Insira um numero para subtrair: - 5 \n");
                num = sc.nextInt();
                operacao = num - 5 ;
                System.out.printf("A Subtracao e : %d \n", operacao);
            case 0:
                System.out.print("Saindo ... \n");
                
        }
        
    }
    
}
