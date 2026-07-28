/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FichaN3;
import java.util.Scanner;
/**
 *
 *  Senha correta
    Cria um programa que peça ao utilizador 
*   uma senha e repita o pedido até que a senha 
    esteja correta (por exemplo: 1234).

 * 
 * @author jeanw
 */
public class Exe012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha;
        int defSenha;
        
        System.out.print("Defina sua senha: \n");
        defSenha = sc.nextInt();
        
        System.out.print("Insira sua senha: \n");
        senha = sc.nextInt();
        while(defSenha != senha){
            System.out.print("Insira sua senha: \n");
            senha = sc.nextInt();
        }
        System.out.print("Acesso liberado\n");
        
        
        
        
        
    }
    
}
