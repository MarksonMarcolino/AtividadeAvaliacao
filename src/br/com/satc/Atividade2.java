
package br.com.satc;

import java.util.Scanner;


public class Atividade2 {
     /*12) Escreva um algoritmo que leia o número de identificação, as 3 notas obtidas por um aluno nas
 3 verificações e a média dos exercícios que fazem parte da avaliação, e calcule a média de
 aproveitamento, usando a fórmula:
 +MA := (nota1 + nota 2 * 2 + nota 3 * 3 + ME)/7
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
      int ma,nota1, nota2,nota3,me,id;
      System.out.println("Qual o seu numero de indentificação?");
      id=entrada.nextInt();
      System.out.println("Qual a sua primeira nota?");
      nota1=entrada.nextInt();
      System.out.println("Qual a sua segunda nota?");
      nota2=entrada.nextInt();
      System.out.println("Qual a sua terceira nota?");
      nota3=entrada.nextInt();
      System.out.println("E qual a média dos exercícios?");
      me=entrada.nextInt();
      ma=((nota1+nota2*2+nota3*3+me)/7);
      if (ma>=90){
          System.out.println(id+" voce foi aprovado, e sua nota foi de A e com média de aprovação de "+ma);
      }else if (ma>=75){
          System.out.println(id+" voce foi aprovado, e sua nota foi de B e com média de aprovação de "+ma);
     }else if (ma>=60){
         System.out.println(id+" voce foi aprovado, e sua nota foi de C e com média de aprovação de "+ma);
    }else if (ma>=40){
          System.out.println(id+" voce foi reprovado, e sua nota foi de D e com média de "+ma);
     }else if (ma<40){
          System.out.println(id+", voce foi reprovado,e sua nota foi de E com média de: "+ma);
     }
     
 }
 } 
   
   

