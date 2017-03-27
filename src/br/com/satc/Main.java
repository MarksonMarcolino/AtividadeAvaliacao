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
    /*
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
        // TODO code application logic here
        Scanner entrada= new Scanner(System.in);
        System.out.println("Qual a primeira nota? ");
         float nota= entrada.nextFloat();
         System.out.println("Qual a segunda nota? ");
          float nota2= entrada.nextFloat();
           System.out.println("Qual a terceira nota? ");
           float nota3= entrada.nextFloat();
            System.out.println("Qual a média dos exercicios? ");
            float exe=entrada.nextFloat();
           float MA=((nota+nota2)*2+(nota3*3+exe)/7); 
           if (MA<40) {
               System.out.println("Sua média é E");
           }else if (MA<60) {
               System.out.println("Sua média é D");
           } else if (MA<75) {
               System.out.println("Sua média é C");
           } else if (MA<90) {
               System.out.println("Sua média é B");              
           } else if (MA>=90) {
               System.out.println("Sua média é A");
           }
                  
                        
            }
    }
    

