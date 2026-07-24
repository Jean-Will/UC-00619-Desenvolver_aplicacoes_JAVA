/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FichaN2;
import java.util.Scanner;
/**
 * 0. Classificação de idade
    Cria um programa que leia a idade de uma pessoa e mostre: 
    "Criança" se idade < 13 
    "Adolescente" se idade entre 13 e 17 
    "Adulto" se idade ≥ 18
    
 * @author jeanw
 */
public class Exe010 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        
        System.out.print("Insira sua idade: ");
        idade = sc.nextInt();
        if (idade < 13) {
            System.out.printf("Crianca, idade: %d \n", idade);
        }else if(idade < 17){
            System.out.printf("Adolescente, idade: %d \n", idade);
        }else{
            System.out.printf("Adulto, idade: %d \n", idade);
        }
        
    }
    
}
