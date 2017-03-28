
package br.com.satc;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author ana cleuzia
 */
public class AtivdadeAvaliação {

     /**
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
       
        
        Scanner ent = new Scanner(System.in);
        NumberFormat e = new DecimalFormat("0.0");
        
        System.out.println("Imforme o seu codigo de Aluno : ");
        int codigo = ent.nextInt();
        
        System.out.println("Imforme a sua 1ª nota: ");
        float nota1 = ent.nextFloat();
        
        System.out.println("Imforme a sua 2ª nota: ");
        float nota2 = ent.nextFloat();
        
        System.out.println("Imforme a sua ª nota: ");
        float nota3 = ent.nextFloat();
        
        System.out.println("Imforme a sua nota da media de exercicios: ");
        float me = ent.nextFloat();
        
        System.out.println("A sua Primeira nota é :"+nota1);
         System.out.println("A sua Segunda nota é :"+nota2);
          System.out.println("A sua Terceira nota é :"+nota3);
           System.out.println("A sua Media de Exercicios  é :"+me);
            
        float ma;
        
        ma = (nota1 + nota2 * 2 + nota3 * 3 + me)/7;
        System.out.println("A sua Media de Aproveitamento é :"+e.format(ma));
        
        if(ma >= 90 ){
            System.out.println("Você teve um **A**\n parabens voce foi APROVADO(A) ");
        }else if(ma >= 75 &&  ma < 90 ){
         System.out.println("Você teve um **B**\n parabens voce foi APROVADO(A) ");  
        }else if (ma >= 60 && ma < 75 ){
           System.out.println("Você teve um **C**\n parabens voce foi APROVADO(A) "); 
        }else if (ma >= 40 && ma < 60 ){
           System.out.println("Você teve um **D**\n Infelizmente voce foi REPROVADO(A)\nMas não se entristeça tente denovo na fase Seguinte... "); 
        }else if (ma < 40  ){
           System.out.println("Você teve um **E**\n Infelizmente voce foi REPROVADO(A)\nMas não se entristeça tente denovo na fase Seguinte... "); 
        }
        
    }
    
}
