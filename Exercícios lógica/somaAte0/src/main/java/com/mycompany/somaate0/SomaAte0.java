/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.somaate0;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
import java.util.Scanner;
public class SomaAte0 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n = -1;
        int soma = 0;
        while (n != 0){
            System.out.println("Digite um numero (0 para sair): ");
            n = leitor.nextInt();
            soma = soma + n;
        }
        System.out.println("A soma dos numeros e: " + soma);
    }
}
