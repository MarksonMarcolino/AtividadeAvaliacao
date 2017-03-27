
package br.com.satc;

import java.util.Scanner;


public class Exercicio1 {

   
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite o preço do produto da etiqueta :");
        float preco = entrada.nextFloat();
        System.out.println("Escolha a forma de pagamento: "
                + "1 À vista em dinheiro ou cheque, recebe 10% de desconto\n" +
                  "2 À vista no cartão de crédito, recebe 15% de desconto\n" +
                  "3 Em duas vezes, preço normal de etiqueta sem juros\n" +
                  "4 Em quatro vezes, preço normal de etiqueta mais juros de 10%");
        int escolha= entrada.nextInt();
         if (escolha==1){
            float pagamento= (float) (preco*0.9);
            System.out.println("O Valor total a pagar é de: "+pagamento+".");
             }else{
             if (escolha==2){
            float pagamento= (float) (preco*0.85);
            System.out.println("O Valor total a pagar é de: "+pagamento+".");
            }else{
             if (escolha==3){
                 System.out.println("O Valor total a pagar é de: "+preco+".");    
             }else{
             if (escolha==4){
            float pagamento= (float) (preco*1.10);
            System.out.println("O Valor total a pagar é de: "+pagamento+".");
            }     
        }
                
             
    }   
             
}
    }
    
}



