/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.alistadeamigos;

/**
 *
 * @author gabri
 */
import java.util.Scanner;
public class AListaDeAmigos {

    public static void main(String[] args) {
        
        //Gabriela Nunes
        
        Scanner leitor = new Scanner(System.in);
        String [] nomes = new String[5];
        int i;
        
        for (i=0; i<nomes.length; i++){
            System.out.println("Digite o nome de um amigo: ");
            nomes[i] = leitor.next();
        }
         for (i=0; i<nomes.length; i++){
            System.out.println((i+1) + " - " + nomes[i]);
        }
    }
}
