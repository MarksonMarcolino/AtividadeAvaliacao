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
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o valor a ser pago pelo prduto? ");
        float val = input.nextFloat();
        System.out.println("Qual a forma de pagamento?"
                + "(D) Dinheiro "
                + "(Q) Cheque"
                + "(C) Cartão");
        char decisao = input.next().charAt(0);

        if ((decisao == 'D') || (decisao == 'Q')) {
            float calc;
            float calc2;
            calc = (float) (val * 0.1);
            calc2 = (val - calc);
            System.out.println("Você receberá um desconto de 10% e pagará " + calc2);

        } else if (decisao == 'C') {
            System.out.println("Você vai pagar á vista ou á prazo? "
                    + "(V) Á vista"
                    + "(P) Á prazo");
            char decisao2 = input.next().charAt(0);

            if (decisao2 == 'V') {

                float calc;
                float calc2;
                calc = (float) (val * 0.15);
                calc2 = (val - calc);
                System.out.println("Você receberá um desconto de 15% e pagará " + calc2);
                
            } if (decisao2 == 'P');
            System.out.println("Em quantas vezes você vai parcelar? ");
            int parc = input.nextInt();
            
            if (parc=='2'){
                System.out.println("Você pagará o valor da etiqueta, ou seja, "+val);
            }
                
            
           
            
        }

    }
}
