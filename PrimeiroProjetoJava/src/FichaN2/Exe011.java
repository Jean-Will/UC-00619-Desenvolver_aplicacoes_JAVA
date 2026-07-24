/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FichaN2;
import java.util.Scanner;
/**
 * Dia da semana
    Cria um programa que leia um número de 1 a 7 e mostre o dia da semana 
    correspondente: 1 – Segunda, 2 – Terça, … 7 – Domingo.
    Se o número for inválido, mostrar "Número inválido" 
 * 
 * @author jeanw
 */
public class Exe011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int diaSemana;
        
        System.out.print("Insira um numero:(1 a 7 ) \n");
        diaSemana = sc.nextInt();
        
        switch(diaSemana){
            case 1:
                System.out.print("Segunda-Feira\n");
                break;
            case 2:
                System.out.print("Terca-Feira\n");
                break;
            case 3:
                System.out.print("Quarta-Feira\n");
                break;
            case 4:
                System.out.print("Quinta-Feira\n");
                break;
            case 5:
                System.out.print("Sexta-Feira\n");
                break;
            case 6:
                System.out.print("Sabado\n");
                break;
            case 7:
                System.out.print("Domingo\n");
                break;
            default:
                System.out.print("Opcao invalida!! \n");
        }
            
        
    }
    
}
