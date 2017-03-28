
package br.com.satc;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Exercicio12{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float nidentificacao, nota1, nota2, nota3, ME, MA;
        System.out.println("Qual é o seu numero de identificação?");
        nidentificacao = entrada.nextFloat();
        System.out.println("Qual é a sua primeira nota? (De 0 a 100)");
        nota1 = entrada.nextFloat();
        System.out.println("Qual é a sua segunda nota? (De 0 a 100)");
        nota2 = entrada.nextFloat();
        System.out.println("Qual é a sua terceira nota? (De 0 a 100)");
        nota3 = entrada.nextFloat();
        System.out.println("Qual é a média dos exercícios? (De 0 a 100)");
        ME = entrada.nextFloat();
        
        MA = (((nota1+nota2)*2+(nota3*3)+ME)/7);
        
        if (MA<40){
            System.out.println("Sua média é E!");}
        else
            if ((MA>=40) && (MA<60)){
                System.out.println("Sua média é D!");}
        else
                if ((MA>=60) && (MA<75)){
                    System.out.println("Sua média é C!");}
        else
                    if ((MA>=75) && (MA<90)){
                        System.out.println("Sua média é B!");}
        else
                        if (MA>=90){
                            System.out.println("Sua média é A!!!");}
    }
}
                    
                        
                
        
        
        
               
        
    

