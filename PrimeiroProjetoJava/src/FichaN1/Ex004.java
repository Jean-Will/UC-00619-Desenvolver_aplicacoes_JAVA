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
public class Ex004 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double baseMaior;
        double baseMenor;
        double altura;
        double calculo;
        double area;
          
        System.out.print("Insira a Base Maior: ");
        baseMaior = sc.nextDouble();
        
        System.out.print("Insira a Base Menor: ");
        baseMenor = sc.nextDouble();
        
        System.out.print("Insira a Altura: ");
        altura = sc.nextDouble();
        
        calculo = (baseMaior + baseMenor)* altura;
        area = calculo / 2;
        
        System.out.printf("A area do trapezio e: %.1f \n",area);
        
        sc.close();
        
    }
}
