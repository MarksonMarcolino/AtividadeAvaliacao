/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Maurício
 */
public class Main_1 {

    /**
     11) Elabore um algoritmo que calcule o que deve ser pago por um produto, considerando o preço
normal de etiqueta e a escolha da condição de pagamento. Utilize os códigos da tabela a seguir
para ler qual a condição de pagamento escolhida e efetuar o cálculo adequado.
Código Condição de pagamento
1 À vista em dinheiro ou cheque, recebe 10% de desconto
2 À vista no cartão de crédito, recebe 15% de desconto
3 Em duas vezes, preço normal de etiqueta sem juros
4 Em três vezes, preço normal de etiqueta mais juros de 10%

     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.print("Preço da etiqueta: ");
        float p1 = entrada.nextFloat();
        System.out.println(("Condições de pagamento \n")+ ("1 - À vista em dinheiro ou cheque, recebe 10% de desconto; \n") +
("2 - À vista no cartão de crédito, recebe 15% de desconto; \n") +
("3 - Em duas vezes, preço normal de etiqueta sem juros; \n") +
("4 - Em três vezes, preço normal de etiqueta mais juros de 10%; \n")) ;
        System.out.print("Condição escolhida: ");
        int cond = entrada.nextInt();
        DecimalFormat df = new DecimalFormat("R$ 0.00");
        switch (cond) {
            case 1:{
                System.out.println("Valor a pagar:"+df.format(p1*0.9));
        }       break;
            case 2:{
                System.out.println("Valor a pagar:"+df.format(p1*0.85));
        }       break;
            case 3:{
                System.out.println("Valor a pagar:"+df.format(p1));
        }       break;
            case 4:{
                System.out.println("Valor a pagar:"+df.format(p1*1.30));
        }       break;
            default:{
                System.out.println("Condição inexistente.");
                break;
        }
    }
    }
    
}
