package br.com.satc;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    /**
     * 11) Elabore um algoritmo que calcule o que deve ser pago por um produto,
     * considerando o preço normal deetiqueta e a escolha da condição de
     * pagamento. Utilize os códigos da tabela a seguir para ler qual acondição
     * de pagamento escolhida e efetuar o cálculo adequado. Código Condição de
     * pagamento 1 À vista em dinheiro ou cheque, recebe 10% de desconto 2 À
     * vista no cartão de crédito, recebe 15% de desconto 3 Em duas vezes, preço
     * normal de etiqueta sem juros 4 Em três vezes, preço normal de etiqueta
     * mais juros de 10%
     *
     */
    public static void main(String[] args) {
        NumberFormat format = new DecimalFormat("0.00");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o valor do produto: ");
        double valor = entrada.nextInt();
        System.out.println("Qual a forma de pagamento:  \n"
                + "A vista em dinheiro ou em cheque (1);\n"
                + "A vista no cartão de crédito (2);\n"
                + "Em duas vezes (3); \n"
                + "Em três vezes (4). ");
        double valortotal;
        double desconto;
        char fpagam = entrada.next().charAt(0);
        switch (fpagam) {
            case '1':

                desconto = valor * 0.1;
                valortotal = valor - desconto;
                System.out.println("O valor total a pagar é " + valortotal + ".");
                break;
            case '2':
                desconto = valor * 0.15;
                valortotal = valor - desconto;
                System.out.println("O valor total a pagar é " + valortotal + ".");
                break;
            case '3':
                valortotal = valor;
                System.out.println("O valor total a pagar é " + valortotal + ".");
                break;
            case '4':
                valortotal = valor * 1.1;
                System.out.println("O valor total a pagar é " + valortotal + ".");
                break;

        }

    }

}
