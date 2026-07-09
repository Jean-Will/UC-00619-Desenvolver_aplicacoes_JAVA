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
public class Ex001 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int qtdCafe ;
        final double precoCafe ;
        precoCafe =  0.85;
        double calc;
        
        System.out.print("Insira a quantidade de cafe: ");
        qtdCafe = sc.nextInt();
        
        calc = qtdCafe * precoCafe;
        
        System.out.printf("Bebeu %d cafes e vais precisar pagar %.2f €" ,qtdCafe, calc);
        
        
        
        
        
    }
}
