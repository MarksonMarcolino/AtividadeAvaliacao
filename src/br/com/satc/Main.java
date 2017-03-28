
package br.com.satc;

import java.util.Scanner;


public class Main {

    /**
     11) Elabore um algoritmo que calcule o que deve ser pago por um produto, considerando o preço
normal deetiqueta e a escolha da condição de pagamento. Utilize os códigos da tabela a seguir
para ler qual acondição de pagamento escolhida e efetuar o cálculo adequado.
Código Condição de pagamento
1 À vista em dinheiro ou cheque, recebe 10% de desconto
2 À vista no cartão de crédito, recebe 15% de desconto
3 Em duas vezes, preço normal de etiqueta sem juros
4 Em duas vezes, preço normal de etiqueta mais juros de 10%
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
        
        System.out.println("Qual é  valor  do pagamento do Produto : ");
        double pagamento = ent.nextDouble();
        
        System.out.println("Qual é a forma de pagamento?\n 1-cheque ,2- dinheiro , 3-cartão de credito , 4- duas vezes , 5- três vezes");
        int f = ent.nextInt();
        
        double desconto = 0;
        double parcelas = 0;
        
        switch(f){
            
            case 1:{  
               desconto = pagamento * 0.10; 
                System.out.println("Conforme a sua forma de pagamento no Cheque...\n O valor do seu desconto é : "+ desconto);
                break;
            }case 2:{
              desconto = pagamento - ( pagamento * 0.10); 
                System.out.println("Conforme a sua forma de pagamento em Dinheiro...\n O valor do seu desconto é : "+ desconto); 
                break;
            }case 3 :{
                desconto =pagamento - ( pagamento * 0.15); 
                System.out.println("Conforme a sua forma de pagamento no Cartão de Credito...\n O valor do seu desconto é : "+ desconto);
                break;
            }case 4 :{
                parcelas = pagamento / 2;
                System.out.println("Conforme a sua forma de pagamento no Cheque...\n O valor do seu desconto é : "+ parcelas); 
                break;
            }case 5 :{
                parcelas =(pagamento * 1.10)/3;
                System.out.println("Conforme a sua forma de pagamento no Cheque...\n O valor do seu desconto é : "+ parcelas); 
                break;
            }
            
        }
        
        
        
    }
    
}
