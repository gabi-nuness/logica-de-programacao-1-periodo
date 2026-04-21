/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.caixaeletronico;

/**
 *
 * @author gabri
 */
import java.util.Scanner;
public class CaixaEletronico {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int opcao;
        double saldo = 0;
        double valor;
        
        do {
            System.out.println("MENU: ");
            System.out.println("1-Depositar");
            System.out.println("2-Sacar");
            System.out.println("3-Ver Saldo");
            System.out.println("0-Encerrar");
            System.out.println("Digite sua opcao: ");
            opcao = leitor.nextInt();
            
            if (opcao==1){
                System.out.println("Digite o valor para deposito: ");
                valor = leitor.nextDouble();
                saldo = saldo + valor;
                System.out.println("Deposito realizado!");
            }
            else if(opcao==2){
                System.out.println("Digite o valor para saque: ");
                valor = leitor.nextDouble();
                if (valor <=saldo){
                    saldo = saldo - valor;
                    System.out.println("Saque realizado!");
                } else {
                    System.out.println("Saldo insuficiente!");
                }
            }
            else if (opcao==3){
                System.out.println("Saldo atual: " + saldo + " reais");
            }
            else if (opcao!=0){
                System.out.println("Opcao invalida!");
            }
            
        }
        while (opcao!=0);
        System.out.println("Ate logo! Programa encerrado.");
    }
}
