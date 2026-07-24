/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FichaN2;
import java.util.Scanner;

/**
 *  Saldo bancário
    Cria um programa que leia o saldo de uma conta e mostre:
    "Saldo positivo" se o saldo for maior ou igual a 0 
    "Saldo negativo" caso contrário

 * 
 * @author jeanw
 */
public class Exe008 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char conta1;
        char conta2;
        conta1 = 'A';
        conta2 = 'B';
        
        final double SALDOA = 1200; // tudo maisculo e ja pode inicializar
        final double SALDOB = -10;
        
        int senhaA;
        int senhaB;
        senhaA = 1;
        senhaB = 2;
        
        int opcao;
        char conta;
        int senha;
        
        System.out.print("Ver saldo opcao (1): \n");
        opcao = sc.nextInt();
        
        if (opcao == 1) {
            System.out.print("Insira sua conta ( A ou B): \n");
            
            conta = sc.next().charAt(0);
            
            if (conta == conta1 || conta == conta2) {
                System.out.print("Insira sua senha: \n");
                senha = sc.nextInt();
                
                if (senha == senhaA) {
                    System.out.print(SALDOA);
                    System.out.print("\n");
                }
                else if (senha == senhaB){
                    System.out.print(SALDOB);
                    System.out.print("\n");
                }
                else{
                    System.out.print("Acesso Negado \n");
                }
            }else{
                System.out.print("Conta Invalida \n");
            }
   
        }else{
            System.out.print("Opcao invalida. \n");
        }
        
        
    }
 
  }
