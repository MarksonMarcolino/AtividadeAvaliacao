/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc;

import java.util.Scanner;

/**
 *
 * @author Eraldo
 */
public class Atividadeprova12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o seu número de identificação : ");
        int cod = entrada.nextInt();
        System.out.println("Digite a sua primeira nota : ");
        double n1 = entrada.nextDouble();
        System.out.println("Digite a sua segunda nota : ");
        double n2 = entrada.nextDouble();
        System.out.println("Digite o ua terceira nota : ");
        double n3 = entrada.nextDouble();
        System.out.println("Digite a quantidade de exercicios que fazem"
                + "parte de avaliação");
        double ME = entrada.nextDouble();
        double MA = (n1 + n2 * 2 + n3 *3 + ME)/7;
        if (MA >= 90){
            System.out.println("Nota A,Aprovado");
        
        }else{
            if ((MA>=75)&&(MA<90)){
                System.out.println("Nota B,Aprovado");
            }else{
               if ((MA>=60)&&(MA>75)){
                   System.out.println("Nota C,Aprovado");              
               
               }else{
                   if((MA>=40)&&(MA<60)){
                      System.out.println("Nota D,Reprovado");
                   }else{
                      if(MA<40){
                          System.out.println("Nota E,Reprovado");
                      
                      }  
                   
                   }
                   
                   
               }  
            
            }
                    
                    
              }
            
        
        }
        
    }
    
    

