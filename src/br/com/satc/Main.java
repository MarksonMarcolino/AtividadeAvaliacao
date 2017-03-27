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
     * + ME)/7 'APROVADO' ABC, e 'Reprovado' se o conceito for D ou E. Média de
     * aproveitamento Conceito >= 90 A >= 75 e < 90 B
     * >= 60 e < 75 C
     * >= 40 e < 60 D < 40 E
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Qual o valor a ser pago? ");
        Double valor = input.nextDouble();
        System.out.println("Qual a forma  de pagamento?(1 para: À vista em dinheiro ou cheque, recebe 10% de desconto "
                + "(2 para: À vista no cartão de crédito, recebe 15% de desconto "
                + "(3 para: Em duas vezes, preço normal de etiqueta sem juros "
                + "(4 para: Em três vezes, preço normal de etiqueta mais juros de 10% ");
        int forma = input.nextInt();
        Double total;
        switch (forma) {
            case '1':
                total = valor-(valor * 0.10);
                System.out.println("O valor a ser pago é de: " + total + ".");
            case '2':
                total = valor-(valor * 0.15);
                System.out.println("O valor a ser pago é de: " + total + ".");
            case '3':
                total = (valor/2);
                System.out.println("O valor a ser pago é de: " + total + ".");
            case '4':
                total = (valor * 1.10)/3;
                System.out.println("O valor a ser pago é de: " + total + ".");
        }

        System.out.println("Digite a sua primeira nota: ");
        float nota1 = input.nextFloat();
        System.out.println("Digite a sua seguda nota: ");
        float nota2 = input.nextFloat();
        System.out.println("Digite a terceira nota: ");
        float nota3 = input.nextFloat();
        float media;
        media = (nota1 + nota2 + nota3) / 3;
        float mediatotal;
        mediatotal = ((nota1 + nota2) * 2) + (nota3 * 3) + media;;
        if (mediatotal >= 90) {
            System.out.println("Sua média é nota A"
                    + "Você foi aprovado");
        }
        if (mediatotal >= 75 && mediatotal < 90) {
            System.out.println("Sua média é nota B"
                    + "Você foi provado");
        }
        if (mediatotal >= 60 && mediatotal < 75) {
            System.out.println("Sua média é nota C"
                    + "Você foi aprovado");
        }
        if (mediatotal >= 40 && mediatotal < 60) {
            System.out.println("Sua média é nota D"
                    + "VocÊ foi reprovado");
        }
        if (mediatotal < 40) {
            System.out.println("Sua média é nota E"
                    + "VocÊ foi reprovado");
        }
    }

}
