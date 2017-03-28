package br.com.satc;

import java.util.Scanner;

public class Main {

    /**
     * 11) Elabore um algoritmo que calcule o que deve ser pago por um produto,
     * considerando o preço normal deetiqueta e a escolha da condição de
     * pagamento. Utilize os códigos da tabela a seguir para ler qual acondição
     * de pagamento escolhida e efetuar o cálculo adequado. Código Condição de
     * pagamento 1 À vista em dinheiro ou cheque, recebe 10% de desconto 2 À
     * vista no cartão de crédito, recebe 15% de desconto 3 Em duas vezes, preço
     * normal de etiqueta sem juros 4 Em três vezes, preço normal de etiqueta
     * mais juros de 10% 12) Escreva um algoritmo que leia o número de
     * identificação, as 3 notas obtidas por um aluno nas 3 verificações e a
     * média dos exercícios que fazem parte da avaliação, e calcule a média de
     * aproveitamento, usando a fórmula: MA := (nota1 + nota 2 * 2 + nota 3 * 3
     * + ME)/7 A atribuição dos conceitos obedece a tabela abaixo. O algoritmo
     * deve escrever o número do aluno, suas notas, a média dos exercícios, a
     * média de aproveitamento, o conceito correspondente e a mensagem
     * 'Aprovado' se o conceito for A, B ou C, e 'Reprovado' se o conceito for D
     * ou E. Média de aproveitamento Conceito >= 90 A >= 75 e < 90 B
     * >= 60 e < 75 C
     * >= 40 e < 60 D < 40 E
     *
     * @param args
     */
    public static void main(String[] args) {
   Scanner entrada = new Scanner(System.in);
         System.out.println("Qual o valor do produto que está na etiqueta: ");
         float valor = entrada.nextFloat();
         System.out.println("Qual a forma de pagamento desejada:  \n"
                 + "A vista em dinheiro ou em cheque (1);\n"
                 + "A vista no cartão de crédito (2);\n"
                 + "Em duas vezes (3); \n"
                 + "Em três vezes (4). ");
         double vt;
         double desconto;
         char pagamento = entrada.next().charAt(0);
         switch (pagamento) {
             case '1':
                 desconto = valor * 0.1;
                 vt = valor - desconto;
                 System.out.println("O valor total é " + vt + ".");
                 break;
             case '2':
                 desconto = valor * 0.15;
                 vt = valor - desconto;
                 System.out.println("O valor total é " + vt + ".");
                 break;
             case '3':
                 vt = valor;
                 System.out.println("O valor total é " + vt + ".");
                 break;
             case '4':
                 vt = valor * 1.1;
                System.out.println("O valor total é " + vt + ".");
                break;
 
         }
 
      }
     
 
  }