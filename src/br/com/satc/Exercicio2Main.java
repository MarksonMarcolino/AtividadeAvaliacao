/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc;

import java.util.Scanner;

/**
 *
 * @author Vinimilanez
 */
public class Exercicio2Main {

    /**
     * @param args the command line arguments
     */
    /*12) Escreva um algoritmo que leia o número de
     * identificação, as 3 notas obtidas por um aluno nas 3 verificações e a
     * média dos exercícios que fazem parte da avaliação, e calcule a média de
     * aproveitamento, usando a fórmula: MA := (nota1 + nota 2 * 2 + nota 3 * 3
     * + ME)/7 A atribuição dos conceitos obedece a tabela abaixo. O algoritmo
     * deve escrever o número do aluno, suas notas, a média dos exercícios, a
     * média de aproveitamento, o conceito correspondente e a mensagem
     * 'Aprovado' se o conceito for A, B ou C, e 'Reprovado' se o conceito for D
     * ou E. Média de aproveitamento Conceito 
     * >= 90 A 
     * >= 75 e < 90 B
     * >= 60 e < 75 C
     * >= 40 e < 60 D < 40 E
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float id, nota1, nota2, nota3, media, me;
        System.out.println("Qula ID do aluno.");
        id = entrada.nextFloat();
        System.out.println("Qual a 1ª nota.");
        nota1 = entrada.nextFloat();
        System.out.println("Qual a 2º nota");
        nota2 = entrada.nextFloat();
        System.out.println("Qual a 3º nota");
        nota3 = entrada.nextFloat();
        me = 0;
        media = (nota1 + nota2 * 2 + nota3 * 3 + me);

        if (media >= 90) {
            System.out.println("ID" + id + ".\n"
                    + " Aprovado com media 'A'. :))");
        } else if (media >= 75 && media < 90) {
            System.out.println("Aluno " + id + ". \n"
                    + "Aprovado com media 'B'. :) ");
        } else if (media >= 60 && media < 75) {
            System.out.println("Aluno" + id + ".\n"
                    + "Aprovado com media 'C'. :/ ");
        } else if (media >= 40 && media < 60) {
            System.out.println("Aluno" + id + ".\n"
                    + " Reprovado com media 'D'. :( ");
        } else if (media < 40) {
            System.out.println("Aluno"+id+". Reprovado com media 'D'. :(( ");
        }
    }
}


