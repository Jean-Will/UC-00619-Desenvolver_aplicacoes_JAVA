/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FichaN1;
import java.util.Scanner;
/**
 *
 * @author jeanw
 */
public class Ex002 {
    public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in);
        String nome;
        String apelido;
        String boasVindas;
        
        
        System.out.print("Insira seu Nome: ");
        nome = sc.nextLine();
        
        System.out.print("Insira seu Apelido: ");
        apelido = sc.nextLine();
        
        boasVindas = "Seja Bem vindo ";
        
        System.out.printf("%s %s %s \n" ,boasVindas,nome , apelido);
        
        sc.close();
        
    }
}
