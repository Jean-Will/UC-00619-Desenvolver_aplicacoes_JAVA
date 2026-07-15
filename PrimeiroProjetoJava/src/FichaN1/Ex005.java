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
public class Ex005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nomeFuncionario;
        
        double numeroHorasTrabalhadas;
        double valorHora;
        double nFilhos;
        
        double calc;
        double calcAcrescimo;
        double salarioBruto;
        double salarioFinal;
        double acrescimo;
        
        
        System.out.print("Insira o nome do Funcionario: ");
        nomeFuncionario = sc.nextLine();
        
        System.out.print("Insira o numero de horas Trabalhadas: ");
        numeroHorasTrabalhadas = sc.nextDouble();
        
        System.out.print("Insira o valor hora: ");
        valorHora = sc.nextDouble();
        
        System.out.print("Insira a Quantidade de Filhos: ");
        nFilhos = sc.nextDouble();
        
        salarioBruto = numeroHorasTrabalhadas * valorHora;
        calcAcrescimo = (salarioBruto * 3)/100 ;
        
        acrescimo = calcAcrescimo * nFilhos; 
        
        salarioFinal = salarioBruto + acrescimo;
        
        System.out.printf("O salario final e: %.2f  \n",salarioFinal,acrescimo );
        
        
        sc.close();
    }
}
