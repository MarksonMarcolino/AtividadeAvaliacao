/*12) Escreva um algoritmo que leia o número de identificação, as 3 notas obtidas por um aluno nas
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
package br.com.satc;

import java.util.Scanner;

/**
 *
 * @author Maurício
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.print("Número de identificação do aluno: ");
        int numero= entrada.nextInt();
        System.out.print("Nota 1: ");
        int nota1=entrada.nextInt();
        System.out.print("Nota 2: ");
        int nota2=entrada.nextInt();
        System.out.print("Nota 3: ");
        int nota3=entrada.nextInt();
        System.out.print("Média dos exercícios da avaliação: ");
        int me = entrada.nextInt();
        int ma = ((nota1+nota2*2) + (nota3*3) + me)/7;
        
        System.out.println("Número do aluno: "+numero);
        System.out.println("Nota 1: "+nota1);
        System.out.println("Nota 2: "+nota2);
        System.out.println("Nota 3: "+nota3);
        System.out.println("Média dos exercícios da avaliação: "+me);
        System.out.println("Média do aproveitamento: "+ma);

    if (ma>=90) {
        System.out.println("Conceito A - Aprovado");
    } else if((ma<90)&&(ma>=75)){
        System.out.println("Conceito B - Aprovado");
    } else if((ma<75)&&(ma>=60)){
        System.out.println("Conceito C - Aprovado");
    } else if((ma<60)&&(ma>=40)){
        System.out.println("Conceito D - Reprovado");
    } else if(ma<40){
        System.out.println("Conceito E - Reprovado");
        
    }
    }
    
}
