/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FichaN3;
import java.util.Scanner;
/**
 * 
 * . Maior número
    Cria um programa que leia vários números inteiros 
* e determine o maior valor 
    introduzido, terminando quando o utilizador inserir 0.
 *
 * @author jeanw
 */
public class Exe009 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int maior;
        int menor;
        
        System.out.print("Insira um numero: ");
        num = sc.nextInt();
        maior = 0;
        while(num != 0){
            maior = num;
            System.out.print("Insira um numero: ");
            num = sc.nextInt();
            if (num > maior) {
                maior = num;
            }
            
        }
        System.out.printf("O maior numeor inserido foi o %d\n", maior);
        
        
        
    }
    
}
