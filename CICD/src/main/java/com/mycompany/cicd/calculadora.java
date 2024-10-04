package com.mycompany.cicd;

import java.util.Scanner;


public class calculadora {
   
    public double soma(double a, double b) {
        return a + b;
        
       }  
    
    public double subtracao(double a, double b) {
        return a - b;
        
    }
   
    public double multiplicacao(double a, double b) {
        return a * b;
    
      }
    
    public double divisao(double a, double b) {
        return a / b;
    
      }
    
        
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     System.out.println("1- soma " +  "2- subtracao");
     System.out.println("3- multiplicar " +  "4- divisao");
     int num = sc.nextInt();
     
     switch(num){
         case 1:
         
     }
     
    }
}

      