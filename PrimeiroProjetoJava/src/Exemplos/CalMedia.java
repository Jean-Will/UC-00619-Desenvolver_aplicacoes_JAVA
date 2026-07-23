/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exemplos;
import java.util.Scanner;
/**
 *
 * @author jeanw
 */
public class CalMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float media;
        float nota;
        float soma;
        soma = 0;
        
        
        
        for (int i = 0+1; i < 10; i++) {
            System.out.print("Insita um valor: ");
            nota = sc.nextFloat();
            soma = soma + nota;
            
            
        }
        media = soma /10;
        System.out.print(media);
       
        
        
    }
}
