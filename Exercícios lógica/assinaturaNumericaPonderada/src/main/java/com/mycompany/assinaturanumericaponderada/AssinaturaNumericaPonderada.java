/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assinaturanumericaponderada;

/**
 *
 * @author gabri
 */
import java.util.Scanner;
public class AssinaturaNumericaPonderada {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int n;
        System.out.println("Digite um numero inteiro: ");
        n = leitor.nextInt();
        
        if (n<0){
            n = -n;
        }
        while (n>=10){
            int soma = 0;
            int posicao = 1;
            int temp = n;
            
            while (temp>0){
                int digito = temp % 10;
                soma = soma + (digito * posicao);
                temp = temp/10;
                posicao++;
            }
            n = soma;
        }
        System.out.println("Assinatura final: " + n);
    }
}
