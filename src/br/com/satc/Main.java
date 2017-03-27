/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc;

import java.util.Scanner;

/**
 *
 * @author Markson
 */
public class Main {

    /**
     11) Elabore um algoritmo que calcule o que deve ser pago por um produto, considerando o preço
normal deetiqueta e a escolha da condição de pagamento. Utilize os códigos da tabela a seguir
para ler qual acondição de pagamento escolhida e efetuar o cálculo adequado.
Código Condição de pagamento
1 À vista em dinheiro ou cheque, recebe 10% de desconto
2 À vista no cartão de crédito, recebe 15% de desconto
3 Em duas vezes, preço normal de etiqueta sem juros
4 Em duas vezes, preço normal de etiqueta mais juros de 10%
12) Escreva um algoritmo que leia o número de identificação, as 3 notas obtidas por um aluno nas
3 verificações e a média dos exercícios que fazem parte da avaliação, e calcule a média de
aproveitamento, usando a fórmula:
MA := (nota1 + nota 2 * 2 + nota 3 * 3 + ME)/7
A atribuição dos conceitos obedece a tabela abaixo. O algoritmo deve escrever o número do aluno,
suas notas, a média dos exercícios, a média de aproveitamento, o conceito correspondente e a
mensagem 'Aprovado' se o conceito for A, B ou C, e 'Reprovado' se o conceito for D ou E.
Média de aproveitamento Conceito
>= 90 A
>= 75 e < 90 B
>= 60 e < 75 C
>= 40 e < 60 D
< 40 E
     */
    public static void main(String[] args) {
           
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o preço de etiqueta do produto : ");
        double preco = entrada.nextDouble();
        System.out.println("Escolha a condição de pagamento"+" /n"
                + "1 À vista em dinheiro ou cheque"+" /n"
                + "2 À vista no cartão de crédito"+" /n"
                + "3 Em duas vezes"+" /n"
                + "4 Em três vezes");
        int pagamento = entrada.nextInt();
        
        
        switch (pagamento) {
            case 1: {
                System.out.println("Você recebe 10% de desconto, o preço do "
                        + "produto será de "+(preco-(preco*0.1))+".");
                break;
            }
            case 2: {
                System.out.println("Você recebe 15% de desconto, o preço do "
                        + "produto será de "+(preco-(preco*0.15))+".");
                break;
            }
            case 3: {
                System.out.println("Será cobrado o preço normal de etiqueta "
                        + "do produto "+preco+".");
                break;
            }
            case 4: {
                System.out.println("Você terá que pagar 10% de juros o preço "
                        + "do produto ficará"+(preco+(preco*1.1))+".");
                break;
            }

        
        
    }
    }
    
    }
    
    

