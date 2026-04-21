/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.transposicaocirculardecarga;

/**
 *
 * @author gabri
 */
public class TransposicaoCircularDeCarga {

    public static void main(String[] args) {
        
        //Gabriela Nunes
        
        int [] vetor = {1,2,3,4,5};
        int k = 2;
        int i;
        int j;
        int ultimo;
        
        for (j=0; j<k; j++){
            ultimo = vetor[vetor.length - 1];
            for (i=vetor.length - 1; i>0; i--){
                vetor[i] = vetor[i-1];
            }
            vetor[0] = ultimo;
        }
        for (i=0; i<vetor.length; i++){
            System.out.println(vetor[i]);
        }
    }
}
