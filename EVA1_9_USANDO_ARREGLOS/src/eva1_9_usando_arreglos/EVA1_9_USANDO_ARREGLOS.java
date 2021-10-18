/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_9_usando_arreglos;

/**
 *
 * @author rocio
 */
public class EVA1_9_USANDO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // 1. UN ARREGLO DE ENTEROS
        int[] aiDatos =new int[10];
        // 2. LLENAR CON VALORES
        //ARREGLO: estructura de acceso aleatorio
        //indice:
        //Primer elemento del arreglo: posición 0
        // Ultimo elemento del arreglo: posición N
        //ACCESO DE VALORES:
        for(int i=0;i<10;i++){
                        // casting --> convertimos doubles a enteros
            aiDatos[i]=(int)(Math.random()*100); //random -->valores emtre 0.0 y 1.0 x 100 (valores entre cero y uno)
        }
        // 3. IMPRIMIR LOS VALORES
        for(int i=0;i<10;i++){
            System.out.println("["+aiDatos[i]+"]");
        }
    }
    
}
