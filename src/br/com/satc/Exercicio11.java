
package br.com.satc;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Exercicio11 {

    /**
     11) Elabore um algoritmo que calcule o que deve ser pago por um produto, considerando o preço
normal deetiqueta e a escolha da condição de pagamento. Utilize os códigos da tabela a seguir
para ler qual acondição de pagamento escolhida e efetuar o cálculo adequado.
Código Condição de pagamento
1 À vista em dinheiro ou cheque, recebe 10% de desconto
2 À vista no cartão de crédito, recebe 15% de desconto
3 Em duas vezes, preço normal de etiqueta sem juros
4 Em duas vezes, preço normal de etiqueta mais juros de 10%
     */
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double prod;
        int pag;
        System.out.print("Qual o preço do produto?");
        prod = ler.nextDouble();
        System.out.println("Digite qual a forma de pagamento:(1)1 À vista em dinheiro ou cheque, recebe 10% de desconto\n"+
                "(2) À vista no cartão de crédito, recebe 15% de desconto\n"+
                "(3) Em duas vezes, preço normal de etiqueta sem juros\n"+
                "(4) Em três vezes, preço normal de etiqueta mais juros de 10%");
        pag = ler.nextInt();
        switch(pag){
            case 1: {System.out.println("Voce ira pagar "+(prod*0.9)+".");
            break;}
            case 2: {System.out.println("Voce ira pagar "+(prod*0.85)+".");
            break;}
            case 3: {System.out.println("Voce ira pagar "+prod+".");
            break;}
            case 4: {System.out.println("Voce ira pagar "+(prod*1.3)+".");
            break;}
        }
            
    }
    
}
