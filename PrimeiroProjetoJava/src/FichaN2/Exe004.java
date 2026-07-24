/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FichaN2;
import java.util.Scanner;
/**
 *. Nota positiva
    Cria um programa que leia uma nota (0 a 20) 
*   e mostre "Aprovado" se a nota for maior ou 
    igual a 10.
 * 
 * 
 * @author jeanw
 */
public class Exe004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;
        
        System.out.print("Insira Sua nota: ");
        nota = sc.nextDouble();
        
        if (nota > 10) {
            System.out.printf("Aprovado nota: %.1f\n", nota);
        } else{
            System.out.printf("Reprovado nota: %.1f\n", nota);
        }
        
    }
    
}
