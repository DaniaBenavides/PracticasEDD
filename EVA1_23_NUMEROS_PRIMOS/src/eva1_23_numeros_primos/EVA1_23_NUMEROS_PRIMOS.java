/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_23_numeros_primos;

import java.util.Scanner;

/**
 *
 * @author rocio
 */
public class EVA1_23_NUMEROS_PRIMOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un número");
        int iVal = input.nextInt();
        boolean esPrimo = true;

        for (int i = 2; i < iVal; i++) {
            //DIVISIÓN: iVal/i;
            //Si la divicion es exacta -> terminamos NO ES PRIMO
            //Si terminamos el for sin dividir exactamente: ES PRIMO
            //MODULO --> Calcula el residuo de la división

            int iMod = iVal % i;
            if (iMod == 0) {
                esPrimo = false;
                break;
            }
        }//IMPRIMIR SI ES PRIMO O NO
        if (esPrimo) {
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero no es primo");
        }

    }

}
