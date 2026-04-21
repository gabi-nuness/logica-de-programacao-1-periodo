/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.buscadordepares;

/**
 *
 * @author gabri
 */
public class BuscadorDePares {

    public static void main(String[] args) {
        
        //Gabriela Nunes
        
        int [] numeros = {1,2,23,3,45,6,7,98,10,28};
        int i;
        
        for (i=0; i<numeros.length; i++){
            if (numeros[i] % 2 == 0){ 
                System.out.println("Numero par: " + numeros[i]);
            }
        }
    }
}
