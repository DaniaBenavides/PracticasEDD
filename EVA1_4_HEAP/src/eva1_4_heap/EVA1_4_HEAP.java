/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_4_heap;

/**
 *
 * @author rocio
 */
public class EVA1_4_HEAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Direcciones almacenadas en el heap
        MiClase obj = new MiClase();
        System.out.println(obj.getMensaje());
        System.out.println(obj);
        MiClase obj2=new MiClase();
        System.out.println(obj2);
        EVA1_4_HEAP objHeap=new EVA1_4_HEAP();
        System.out.println(objHeap);
    }

}

class MiClase {//NUEVO TIPO DE DATO --> TIPO DE DATO ABSTRACTOS
    String mensaje;//ATRIBUTOS -> ESTADO DEL OBJETO
    public MiClase(){//METODOS -> COMPORTAMIENTO
        mensaje="Hola mundo";
    }
    //getter / setter
    public String getMensaje(){
        return mensaje;
    }
    public void setMensaje(String mensaje){
        this.mensaje=mensaje;
    }
}
