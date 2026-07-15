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
public class Ex003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double n1 ;
        double n2;
        double n3;
        double soma;
        double media;
        
        
        System.out.print("Insira as notas de matematica: ");
        n1 = sc.nextDouble();
        
        System.out.print("Insira as notas de matematica: ");
        n2 = sc.nextDouble();
        
        System.out.print("Insira as notas de matematica: ");
        n3 = sc.nextDouble();
        
        soma = n1 + n2 + n3;
        media = soma / 3;
        
        System.out.printf("essa e a sua media em Matematica: %.2f \n",media);
        
        sc.close();
    }
}
