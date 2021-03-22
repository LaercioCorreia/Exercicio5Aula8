/*
2. Faça um programa onde o usuário digita vários números e, quando digitar 0, 
o programa pára e soma os valores digitados
 */
package Exercicio1;

import java.util.Scanner;

public class Exer2 {

 public static void main(String[] args) {
       
    Scanner ler = new Scanner(System.in);
    
    double numero, soma = 0;
    int cont = 0;
    
    
    do {
        System.out.println("Digite um número: ");
        numero = ler.nextDouble();
        
        if(numero > 0 ){
            soma += numero;
            cont++;
            
        }
    }while (numero > 0 );
        
        System.out.println ("Soma dos valores: " + soma);
        System.out.println("A quantidade de números digitados foi: " + cont);
       
        
       
        }
            
   }

    
    

