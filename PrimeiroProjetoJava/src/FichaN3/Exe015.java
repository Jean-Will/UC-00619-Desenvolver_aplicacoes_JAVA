/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FichaN3;
import java.util.Scanner;
/**
 *  Adivinhar o número
    Cria um programa onde o utilizador tem de 
*   adivinhar um número (por exemplo, 7), 
    repetindo as tentativas até acertar.
 *
 * @author jeanw
 */
public class Exe015 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int secret;
        int num;
        int contaErro;
        
        System.out.print("Inisira um numero: \n");
        num = sc.nextInt();
        
        secret = 77;
        contaErro = 0;
        
        while(num != secret){
            System.out.print("Inisira um numero: \n");
            num = sc.nextInt();
            contaErro = contaErro +1;
            System.out.print("Ja tentou " + "" +contaErro + "vezes \n");
        }
        
        
    }
    
}
