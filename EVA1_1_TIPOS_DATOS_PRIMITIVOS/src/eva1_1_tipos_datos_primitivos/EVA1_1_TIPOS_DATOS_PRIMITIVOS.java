/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_1_tipos_datos_primitivos;

/**
 *
 * @author rocio
 */
public class EVA1_1_TIPOS_DATOS_PRIMITIVOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int iVal=Integer.MAX_VALUE;
        System.out.println("Valor mas grande: "+ iVal);
        iVal +=1; //overflow (desborde)
        iVal=Integer.MIN_VALUE;
        System.out.println("Valor mas pequeño: "+ iVal);
        
        for( int i=0;i<10;i++){
            String mensaje = "Hola mundo";
            System.out.println(mensaje+i);
        }
        System.out.println(mensaje+i); //<-- NO IDENTIFICA LAS VARIABLES 
    }
    
}
