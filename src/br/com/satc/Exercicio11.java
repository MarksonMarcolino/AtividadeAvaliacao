
package br.com.satc;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Exercicio11 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float valorp, formapag;
        System.out.println("Qual é o valor do produto?");
        valorp = entrada.nextFloat();
        System.out.println("Qual será a forma de pagamento?"
                + " "
                + "1- À vista em dinheiro ou cheque, recebe 10% de desconto\n" +
"2- À vista no cartão de crédito, recebe 15% de desconto\n" +
"3- Em duas vezes, preço normal de etiqueta sem juros\n" +
"4- Em duas vezes, preço normal de etiqueta mais juros de 10%");
        formapag = entrada.nextFloat();
        
        if (formapag==1)
            System.out.println("O valor do produto será: " +valorp*0.9);
        else 
            if (formapag==2)
                System.out.println("O valor do produto será: " +valorp*0.85);
        else
                if (formapag==3)
                    System.out.println("O valor do produto será duas vezes de: " +valorp/2);
        else 
                    if (formapag==4)
                        System.out.println("O valor do produto será duas vezes de: " +(valorp*1.1)/2);
        
        
                
        
               
                    
                    
        
        
        
        
                
        
        
    }
    
}
