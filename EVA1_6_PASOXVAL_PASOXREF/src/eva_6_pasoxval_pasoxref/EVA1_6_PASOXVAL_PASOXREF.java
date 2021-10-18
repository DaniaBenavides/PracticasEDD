/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_6_pasoxval_pasoxref;

/**
 *
 * @author rocio
 */
public class EVA1_6_PASOXVAL_PASOXREF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valorig = 5;
        System.out.println("ValOrig en el main = " + valorig);
        incrementa(valorig);
        System.out.println("ValOrig despues de llamar a incrementa = " + valorig);

        /*   valorig=incrementaQueSiFunciona(valorig);
        System.out.println("ValOrig despues de llamar a incrementa = " + valorig);*/
        
//DEMOSTRACIÓN DE PASO POR REFERENCIA
        Prueba objPrueba = new Prueba();
        System.out.println("Valor de la x = " + objPrueba.x);
        System.out.println("objPrueba en el main = "+objPrueba);
        System.out.println(objPrueba);
        System.out.println("Valor de la x despues de incrementa = " + objPrueba.x);

    }    
//PASO POR VALOR --> Pasamos una copia del valor en una variable (variables locales primitivos)
    public static void incrementa(int val) {
        val++; //incrementamos val en uno, val+1; val+-1 
        System.out.println("Valor en incrementa = " + val);
    }
   /* public static int incrementaQueSiFunciona(int val) {
        val++;
        return val++;
    }*/
//PASO POR REFERENCIA --> Pasan la dirección en memoria del objeto (objetos)
    public static void incrementaObj(Prueba val) {
        System.out.println("Objeto en incrementoObj = "+val);
        val.x++;
    }
}

class Prueba {

    public int x = 10;
}
