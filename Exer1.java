/*
1. Faça um programa que receba somente nºs positivos e exibe e calcule:
o número digitado
a soma dos números digitados
a quantidade de números digitados
a média dos números digitados

*/
package Exercicio1;

import java.util.Scanner;
import java.util.ArrayList;

public class Exer1 {


    public static void main(String[] args) {
       
    Scanner ler = new Scanner(System.in);
   
    int numero = 0, soma = 0;
    int contar = 0;
    
    ArrayList<Integer> lista = new ArrayList<>();
    /*
    ordem que o programa FAÇA o
     - digitar
     - gravar numero
     - adicionar o número
    ENQUANTO o numero for maior igual a ZERO
    */
    
    
    do {
        System.out.println("Digite um número: ");
        numero = ler.nextInt();
        lista.add(numero);
        
        
        if(numero > 0 ){
            soma = numero + soma;
            contar++;
            
        }
    }while (numero > 0 );
    
        int ultimo = lista.size();
        lista.remove(ultimo - 1);
        
        System.out.println("Mostrar a minha lista " + lista);
        System.out.println ("Soma dos valores: " + soma);
        System.out.println("A quantidade de números digitados foi: " + contar);
        System.out.println("A média é " + soma / contar);
        
       
        }
            
   }

    
