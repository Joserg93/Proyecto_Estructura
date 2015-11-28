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
public class Banco {
    //Instancias de la clase banco 
        Caja caja_1 = new Caja("Caja 1");
        Caja caja_2 = new Caja("Caja 2");
        Caja caja_3 = new Caja("Caja 3");
        Caja caja_4 = new Caja("Caja 4");
        Caja caja_5 = new Caja("Caja 5");
    //atributos de la clase
        public Nodo_Fila primero_fila = Menu_Banco.instancia_fila.primero;
        public Nodo_Fila ultimo_fila = Menu_Banco.instancia_fila.ultimo;
        public int cont_1,cont_2,cont_3,cont_4,cont_5;
    /**
     *
     */
    public void Procesar_Cajas(){
        Nodo_Fila temp=primero_fila;
        Nodo_Caja c1 = caja_1.clientes.primero;
        Nodo_Caja c2 = caja_2.clientes.primero;
        Nodo_Caja c3 = caja_3.clientes.primero;
        Nodo_Caja c4 = caja_4.clientes.primero;
        Nodo_Caja c5 = caja_5.clientes.primero;
        while(temp!=null){
            if(temp==primero_fila){
                caja_1.clientes.agregar(temp.dato);
                temp=temp.sgte;
                caja_2.clientes.agregar(temp.dato);
                temp=temp.sgte;
                caja_3.clientes.agregar(temp.dato);
                temp=temp.sgte;
                caja_4.clientes.agregar(temp.dato);
                temp=temp.sgte;
                caja_5.clientes.agregar(temp.dato);
                temp=temp.sgte;
                cont_1=0;
                cont_2=0;
                cont_3=0;
                cont_4=0;
                cont_5=0;
            }else{
                if(c1.dato.getPrioridad()==cont_1&&temp!=null){
                    caja_1.clientes.agregar(temp.dato);
                    c1=c1.sgte;
                    temp=temp.sgte;
                    cont_1=0;
                }
                if(c2.dato.getPrioridad()==cont_2&&temp!=null){
                    caja_2.clientes.agregar(temp.dato);
                    c2=c2.sgte;
                    temp=temp.sgte;
                    cont_1=0;
                }
                if(c3.dato.getPrioridad()==cont_3&&temp!=null){
                    caja_3.clientes.agregar(temp.dato);
                    c3=c3.sgte;
                    temp=temp.sgte;
                    cont_1=0;
                }
                if(c4.dato.getPrioridad()==cont_4&&temp!=null){
                    caja_4.clientes.agregar(temp.dato);
                    c4=c4.sgte;
                    temp=temp.sgte;
                    cont_1=0;
                }
                if(c5.dato.getPrioridad()==cont_5&&temp!=null){
                    caja_5.clientes.agregar(temp.dato);
                    c5=c5.sgte;
                    temp=temp.sgte;
                    cont_1=0;
                }
            }
            cont_1=cont_1+1;
            cont_2=cont_2+1;
            cont_3=cont_3+1;
            cont_4=cont_4+1;
            cont_5=cont_5+1;
        }
    }
}
