
package br.com.satc;

import java.util.Scanner;


public class exercicio2 {

   
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Digite o número de identificação: ");
        float ident=entrada.nextFloat();
        System.out.println("Informe a primeira nota: ");
        float nota1=entrada.nextFloat();
        System.out.println("Informe a segunda nota:  ");
        float nota2=entrada.nextFloat();
        System.out.println("Informe a terceira nota");
        float nota3=entrada.nextFloat();
        System.out.println("Digite a média das avaliações ");
        float media=entrada.nextFloat();
        float ma = (nota1 + (nota2 * 2) + (nota3 * 3) + media)/7;
        if (ma>=90){
            System.out.println("o Aluno"+ident+"foi APROVADO pelo conceito A."
                    + "Notas:"+nota1+","+nota2+","+nota3+"."
                    + "media:"+media+"."
                    + "Média de aproveitamento:"+ma+".");
           }else{
            if ((ma>=75)&&(ma<90)){
            System.out.println("o Aluno"+ident+"foi APROVADO pelo conceito B."
                    + "Notas:"+nota1+","+nota2+","+nota3+"."
                    + "media:"+media+"."
                    + "Média de aproveitamento:"+ma+".");
          }else{
            if ((ma>=60)&&(ma<75)){
            System.out.println("o Aluno"+ident+"foi APROVADO pelo conceito C."
                    + "Notas:"+nota1+","+nota2+","+nota3+"."
                    + "media:"+media+"."
                    + "Média de aproveitamento:"+ma+".");    
            }else{
                if ((ma>=40)&&(ma<60)){
            System.out.println("o Aluno"+ident+"foi REPROVADO pelo conceito D."
                    + "Notas:"+nota1+","+nota2+","+nota3+"."
                    + "media:"+media+"."
                    + "Média de aproveitamento:"+ma+".");
            }else{
                    if (ma<40){
            System.out.println("o Aluno"+ident+"foi REPROVADO pelo conceito E."
                    + "Notas:"+nota1+","+nota2+","+nota3+"."
                    + "media:"+media+"."
                    + "Média de aproveitamento:"+ma+".");
                }
        
        
        
        
    }
        }
    }
        }  
    }
}