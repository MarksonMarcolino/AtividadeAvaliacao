package br.com.satc;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * 12) Escreva um algoritmo que leia o número de identificação, as 3 notas
 * obtidas por um aluno nas 3 verificações e a média dos exercícios que fazem
 * parte da avaliação, e calcule a média de aproveitamento, usando a fórmula: MA
 * := (nota1 + nota 2 * 2 + nota 3 * 3 + ME)/7 A atribuição dos conceitos
 * obedece a tabela abaixo. O algoritmo deve escrever o número do aluno, suas
 * notas, a média dos exercícios, a média de aproveitamento, o conceito
 * correspondente e a mensagem 'Aprovado' se o conceito for A, B ou C, e
 * 'Reprovado' se o conceito for D ou E. Média de aproveitamento Conceito >= 90
 * A >= 75 e < 90 B
 * >= 60 e < 75 C
 * >= 40 e < 60 D < 40 E
*
 */
public class Atividade2 {

    public static void main(String[] args) {
        NumberFormat format = new DecimalFormat("0.00");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual seu numero de identificação: ");
        int ni = entrada.nextInt();
        System.out.println("Qual a primeira nota: ");
        int primnota = entrada.nextInt();
        System.out.println("Qual a segunda nota: ");
        int segnota = entrada.nextInt();
        System.out.println("Qual a terceira nota: ");
        int tercnota = entrada.nextInt();
        System.out.println("Qual a média dos exercícios: ");
        int ME = entrada.nextInt();
        System.out.println("Qual o conceito: ");
        String conceito = entrada.next();
        int MA;
        MA = (primnota + segnota) * 2 + (tercnota * 3 + ME) / 7;
        if (MA >= 90) {
            System.out.println("Aprovado!");
        } else {
            if ((MA < 90) && (MA <= 75)) {

                System.out.println("Aprovado!");
            } else {
                if ((MA < 75) && (MA >= 60)) {
                    System.out.println("Aprovado!");
                } else {
                    if ((MA < 60) && (MA >= 40)) {
                        System.out.println("Reprovado!!");
                    } else {
                        if ((MA < 40)) {
                            System.out.println("Reprovado!!");
                        }
                    }

                }
            }

        }

    }

}
