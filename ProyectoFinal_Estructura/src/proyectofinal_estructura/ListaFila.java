/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal_estructura;

/**
 *
 * @author joser
 */
public class ListaFila {//Lista Circular
    
    //atributos de la clase
    public Nodo_Fila primero;
    public Nodo_Fila ultimo;
    public int tamaño;
    public char letra;
    //método constructor vacío
    public ListaFila(){
        this.primero = null;//this.ultimo = null;
        this.tamaño = 0;
    }
    //método que agrege al Final de la lista
    /**
     * Método que agrega al Final de la Lista
     * @param pDato: Recibe el dato que se almacenará en el nodo de la lista de clientes
     * @return: Dato falso ó verdadero, sobre el estado del nodo agregado
     */
    public boolean Agregar_Fila(Nodo_Cliente Dato_Cliente) {
        boolean retorno = true;
        try {
            //en caso que la lista esté vacía
            if (this.primero == null) {
                Nodo_Fila nuevo = new Nodo_Fila(Dato_Cliente);
                this.primero = nuevo;
                this.ultimo = nuevo;
            } //inserta al inicio de la lista cuando ya hay al menos un elemento
            else {
                Nodo_Fila nuevo = new Nodo_Fila(Dato_Cliente);
//                nuevo.sgte=primero;
//                primero=nuevo;
                this.ultimo.sgte=nuevo;
                this.ultimo=nuevo;
            }
            //incrementa el tamaño de la lista
            tamaño++;
        } catch (Exception e) {
            retorno = false;
        }
        return (retorno); //Retorna verdadero ó falso
    }
    /**
     *Método que ordena la fila bancaria
     */
    public void Ordenar_Fila(){
        Nodo_Fila temp = this.primero;
        Nodo_Fila temp2 = temp;
        Nodo_Fila temp3 = temp;
        letra='B';
        for(int x=0; x<=2;x++){
            temp=this.primero;
            temp2=temp;
            temp3=temp;
            for(int y=1;y<=tamaño;y++){
                if(temp.dato.getPrioridad()==letra){
                    if(temp==this.primero){
                        temp2=temp;
                        temp=temp.sgte;
                        this.ultimo.sgte=temp2;
                        this.primero.sgte=null;
                        this.primero=temp;
                        this.ultimo=temp2;
                        temp3=this.primero;
                    }else{
                        temp2=temp;
                        temp=temp.sgte;
                        temp3.sgte=temp;
                        this.ultimo.sgte=temp2;
                        temp2.sgte=null;
                        this.ultimo=temp2;
                    }
                }else{
                    temp3=temp;
                    temp=temp.sgte;
                }
            }
            if(x==0){
                letra='C';
            }else{
                letra='D';
            }
        }
    }
    //Imprimir Lista para pruebas
    public void Imprimir(){
        Nodo_Fila temp = this.primero;
        for(int y=1;y<=tamaño;y++){
            System.out.println(temp.dato.getLugarFila()+" "+temp.dato.getNombre()+" "+temp.dato.getPrioridad());
            temp=temp.sgte;
        }
    }
    //método que borra el primer elemento de la lista
//    public boolean borrar() {
//        boolean retorno = true;
//        //si la lista está vacía no puede borrar
//        if (this.primero == null) {
//            retorno = false;
//        } //en caso de que la lista tenga elementos
//        else {
//            //si la lista tiene únicamente un elemento
//            if (this.primero == this.ultimo) {
//                this.primero = this.ultimo = null;
//            } //si la lista tiene más de un elemento
//            else {
//                Nodo_Fila actual = this.primero;
//                this.primero = actual.sgte;
//                this.primero.ant = this.ultimo;
//                actual = null;
//            }
//            this.tamaño--;
//        }
//        return (retorno);
//    }
  
}
