/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_15_matriz;

/**
 *
 * @author rocio
 */
public class EVA1_15_MATRIZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //crear un arreglo de dos dimensiones 5 filas x 3 columnas (puros enteros)
        int iMatriz[][] = new int[5][3];
        //ACCEDER A UN ELEMENTO
        iMatriz[0][0] = 1000; //PRIMER POSICIÓN
        iMatriz[1][2] = 2000; //ULTIMA POSICIÓN
        System.out.println("Tamaño del arreglo: " + iMatriz.length);
        //CICLO X CADA DIMENSIÓN
        //CICLOS ANIDADOS (CICLO DENTRO DE OTRO CICLO)
        for (int i = 0; i < iMatriz.length; i++) {//filas iMatriz
            for (int j = 0; j < 3; j++) { //columnas
                System.out.print("[" + iMatriz[i][j] + "]");
            }
            System.out.println("");

        }

    }

}
