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
public class Ex007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final double iva;
        double preco;
        double precoComIva;
        double calcIva;
        
        System.out.print("Insira a taxa de IVA: ");
        iva = sc.nextDouble();
        
        System.out.print("Insira o preco do produto: ");
        preco = sc.nextDouble();
        
        calcIva = (preco * iva)/100 ; 
        precoComIva = preco + calcIva;
        
        System.out.printf("Esse e o valor do produto com IVA: %.2f \n",precoComIva);
        
        
        
        
    }
}
