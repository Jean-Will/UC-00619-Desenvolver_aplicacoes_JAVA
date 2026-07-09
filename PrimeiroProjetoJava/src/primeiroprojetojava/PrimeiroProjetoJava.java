/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


package primeiroprojetojava;

import java.util.Scanner;


/**
 *
 * @author jeanw
 */
public class PrimeiroProjetoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        // SAIDAS 
        
       /**
        System.out.print("Ola Mundo!");
        System.out.println("Ola Mundo!");
        
        int x  = 18;
        
        String y = "18";
        
        double z = 18.5555;
        
        String nome = "Pedro";
        char a = 'O';
        int idade = 20;
        
        System.out.println("O Antonio tem " + x + " anos");
        
        System.out.printf("Antonio tem %d anos ", x );
        
        System.out.println("Usando string "+ y + " anos ");
        System.out.printf("Usando string %s ", y) ;
        
        System.out.printf("\nUsando as casas decimais %.2f %n",z );
        
        System.out.printf("\n%c %s tem %d anos. %n", a , nome , idade);
        
        */
        
        // ENTRADAS
        Scanner sc = new Scanner(System.in);
        
        int x;
        int y;
        int soma;
        String nome;
        
        
        
        System.out.print("Introduza o seu nome: ");
        nome = sc.nextLine();
        
        
        System.out.print("Introduza um valor: ");
        x = sc.nextInt();
        
        System.out.print("Introduza um valor: ");
        y = sc.nextInt();
      
        soma = x+y;
        System.out.print("O teu nome e: " + nome + " e tens " + x + " Valores \n");
        
        System.out.printf("A soma e : %d \n",soma);
        
        sc.nextLine(); // LIMPAR BUFFER
        sc.close();   // 
        
        
    }
    
}
