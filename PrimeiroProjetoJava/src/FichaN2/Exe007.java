/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FichaN2;
import java.util.Scanner;
/**
 *. Senha
    Cria um programa que Leia uma senha (número inteiro) e mostre: 
    "Acesso permitido" se a senha for igual a 1234 
    "Acesso negado" caso contrário
 * 
 * @author jeanw
 */
public class Exe007 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int senha;
        final int senhaValida;
        senhaValida = 1234;
        
        System.out.printf("Insira sua Senha: ");
        senha = sc.nextInt();
        
        
        if (senha != senhaValida) {
            System.out.print("Acesso Negado \n");
        }else{
            System.out.print("Acesso Permitido \n");
        }
        
    }
    
}
