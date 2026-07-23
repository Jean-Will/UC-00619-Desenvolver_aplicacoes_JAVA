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
public class Multipla {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int op;
        
        System.out.print("Insira um numero para saber a Lua: ");
        op = sc.nextInt();
        
        switch (op)
        {
            case 1:
                System.out.println("Lua Cheia \n");
                break;
            case 2:
                System.out.println("Quarto Minguante ! \n");
                break;
            case 3:
                System.out.println("Quarto Crescente \n");
                break;
            case 4:
                System.out.println("Lua nova \n");
                break;
            default:
                System.out.println("Valores invalidos! \n");
        }
        
        
    }
}
