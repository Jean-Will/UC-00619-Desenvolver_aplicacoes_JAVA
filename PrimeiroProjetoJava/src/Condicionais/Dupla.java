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
public class Dupla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a;
        int b;
        
        System.out.print("Insira um numero: ");
        a = sc.nextInt();
        
        System.out.print("Insira outro numero: ");
        b = sc.nextInt();
        
        if (a > b) {
            System.out.printf("Primeiro numero %d e maior que o segundo %d \n", a,b);
        }
        else{
            System.out.printf("O segundo numero e maior %d , %d \n", b,a);
        }
        
        
    }
}
