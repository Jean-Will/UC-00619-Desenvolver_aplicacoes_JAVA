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
public class Ex008 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double raparigas;
        double rapazes;
        double calc;
        double converter;
        double convRaparigas;
        double convRapazes;
        double provaReal;
        
        System.out.print("Insira o numero de Raparigas:(F) ");
        raparigas = sc.nextDouble();
        
        System.out.print("Insira o numero de Rapazes:(M) ");
        rapazes = sc.nextDouble();
        
        //calc = raparigas + rapazes /2;
        calc = raparigas + rapazes;
        //converter = calc * 100;
        convRaparigas = (raparigas * 100)/calc;
        convRapazes = (rapazes * 100)/calc;
        
        provaReal = convRaparigas + convRapazes;
        
        System.out.printf("A porcentagem de raparigas e: %.2f%% \nE de rapazes e: %.2f%% \nTotal: %.2f%% \n", convRaparigas, convRapazes , provaReal);
        
        sc.close();
    }
}
