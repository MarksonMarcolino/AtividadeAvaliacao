/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc;

import java.util.Scanner;

/**
     11) Elabore um algoritmo que calcule o que deve ser pago por um produto, considerando o preço
normal de etiqueta e a escolha da condição de pagamento. Utilize os códigos da tabela a seguir
para ler qual acondição de pagamento escolhida e efetuar o cálculo adequado.
Código Condição de pagamento
1 À vista em dinheiro ou cheque, recebe 10% de desconto
2 À vista no cartão de crédito, recebe 15% de desconto
3 Em duas vezes, preço normal de etiqueta sem juros
4 Em duas vezes, preço normal de etiqueta mais juros de 10%
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner(System.in);
         System.out.println("Qual o valor da peça? ");
          float valor1= entrada.nextFloat();
           System.out.println("Qual a condição de pagamento? ");
           char op = entrada.next().charAt(0);
             switch (op)
             {
                 case '1':
                     System.out.println("O valor da compra é de: "+ valor1*0.90 );
                     break;
                 case '2':
                     System.out.println("O valor da compra é de:"+ valor1*0.85 );
                     break;
                 case '3':
                     System.out.println("O valor da compra fica duas vezes de:"+ valor1/2  );
                     break;
                   
                 default:
                     System.out.println("Voce nao digitou o código correto.");
             }
             if (op=='4'){
                 System.out.println("O valor da compra fica duas vezes de:"+ (valor1*1.10)/2 );
             }
             
        
    }
    
}
