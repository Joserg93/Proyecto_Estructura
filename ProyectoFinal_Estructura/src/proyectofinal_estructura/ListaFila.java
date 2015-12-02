/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal_estructura;

import static proyectofinal_estructura.Menu_Banco.instancia_fila;

/**
 *  Fecha de Primera Edición 16/11/2015
 *  Fecha de Última Edición 1/12/2015
 * @author Jose Miguel y Diego
 */
public class ListaFila {
    
    //atributos de la clase
    public Nodo_Fila primero;
    public Nodo_Fila ultimo;
    public char letra;
    //método constructor de la lista fila
    public ListaFila(){
        this.primero = null;
        this.ultimo = null;
    }
    
    /**
     *metodo para agregar un nuevo cliente a la lista fila
     * @param Dato_Cliente:recibe un dato de tipo cliente
     */
    public void Agregar_Fila(Cliente Dato_Cliente) {
            //en caso que la lista esté vacía
            if (this.primero == null){
                Nodo_Fila nuevo = new Nodo_Fila(Dato_Cliente);
                this.primero = nuevo;
                this.ultimo = nuevo;
            }else{//inserta al final de la lista cuando ya hay al menos un elemento en la lista
                Nodo_Fila nuevo = new Nodo_Fila(Dato_Cliente);
                this.ultimo.sgte=nuevo;
                this.ultimo=nuevo;
            }
    }
    
    /**
     *metodo para ordenar la lista de clientes de la fila 
     */
    public void Ordenar_Fila(){
        Nodo_Fila temp = this.primero;//variable temporal de tipo Nodo_Fila 
        Cliente Vec_fila[]=new Cliente[20];//arreglo de tipo cliente para almacenar la lista de clientes de la lista
        Cliente Vec_fila2[]=new Cliente[20];//arreglo de tipo cliente para almacenar la lista ordenada de los clientes de la lista
        Cliente CL=null;//variable de tipo cliente para poder agregar a la lista de la fila
        int cont=0;//variable contador para manejar el indice del arreglo Vec_fila2
        letra='A';//variable  char para manejar la verificacion de la prioridad del cliente
        for(int x=0;x<20;x++){//ciclo for que recorre los clientes de la lista fila y los agrega al arreglo Vec_fila 
            Vec_fila[x]=new Cliente(temp.dato.getNombre(),temp.dato.getPrioridad(),temp.dato.getLugarFila(),
                        temp.dato.getDuracionTramite());//agrega el cliente al arreglo con el indice del contador del ciclo for
            temp=temp.sgte;//se asigna el nodo siguiente a la variable temporal
        }
        for(int x=0;x<4;x++){//ciclo for para reordenar los clientes del arreglo Vec_fila y asignarlos al arreglo Vec_fila2
            for(int y=0;y<Vec_fila.length;y++){//ciclo for que recorre el arreglo Vec_fila
                if(Vec_fila[y].getPrioridad()==letra){//condicion que verifica si la prioridad del cliente es igual a la letra que se esta buscando
                    Vec_fila2[cont]=Vec_fila[y];//asigna el cliente del arreglo Vec_fila al arreglo Vec_fila2 en el indice de la variable contador
                    cont=cont+1;//aumenta la varriable contador para guardar en un nuevo indice del arreglo
                }
            }
            if(x==0){//condicion que verifica el contador del ciclo for de X para asignar a la variable letra que se va a utilizar en la siguiente repeticion del ciclo
                letra='B';
            }else if(x==1){//condicion que verifica el contador del ciclo for de X para asignar a la variable letra que se va a utilizar en la siguiente repeticion del ciclo
                letra='C';
            }else if(x==2){//condicion que verifica el contador del ciclo for de X para asignar a la variable letra que se va a utilizar en la siguiente repeticion del ciclo
                letra='D';
            }
        }
        Borrar_Todo();//se borra toda la lista fila para agregarle los clientes ordenados
        for(int z=0;z<20;z++){//ciclo for para agregar los clientes ordenados del arreglo Vec_fila2 a la lista fila
            Agregar_Fila(CL=Vec_fila2[z]);//agrega el cliente a la lista de la fila del banco
        }
    }
    
    /**
     *metodo para borrar el primer nodo de la lista fila
     */
    public void Borrar() {
        //si la lista está vacía no puede borrar
        if (this.primero != null) {
                this.primero=this.primero.sgte;
            }
    }
    
    /**
     *metodo para borrar todos los nodos de la lista de la fila
     */
    public void Borrar_Todo() {
        this.primero=null;
        this.ultimo=null;
    }
}
