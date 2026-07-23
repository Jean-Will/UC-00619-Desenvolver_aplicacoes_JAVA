/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Condicionais;
import java.util.Scanner;
/**
 *
 * @author jeanw
 */
public class Votacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int idade;
        
        System.out.print("Qual a sua idade?: ");
        idade = sc.nextInt();
        
        if (idade >16) {
            System.out.printf("podes voltar %d \n", idade);
        }
        
    }
}
