/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal_estructura;

import javax.swing.JOptionPane;

/**
 *  Fecha de Primera Edición 16/11/2015
 *  Fecha de Última Edición 1/12/2015
 * @author Jose Miguel y Diego
 */
public class Banco {
    //Instancias de la clase banco
        //creacion de las cajas del banco
        Caja caja_1 = new Caja("Caja 1");
        Caja caja_2 = new Caja("Caja 2");
        Caja caja_3 = new Caja("Caja 3");
        Caja caja_4 = new Caja("Caja 4");
        Caja caja_5 = new Caja("Caja 5");
    //atributos de la clase
        ListaFila instancia_fila = null;//instancia vacia de tipo ListaFila
        Cliente CL;//clase tipo cliente
        //lista vacias de tipo Nodo_caja de cada caja del banco
        Nodo_Caja c1 = null;
        Nodo_Caja c2 = null;
        Nodo_Caja c3 = null;
        Nodo_Caja c4 = null;
        Nodo_Caja c5 = null;
        //variables contador de tipo integer para manejar el tiempo de cada caja y el indice del arreglo
        public int cont,cont_1,cont_2,cont_3,cont_4,cont_5;
        //variables promedio que almacenan el total del tiempo de cada caja
        public int promedio_1,promedio_2,promedio_3,promedio_4,promedio_5;
        //arreglo de tipo cliente que almacena los clientes de la ListaFila
        public Cliente Vec_fila[];
    //Metodos
 
    /**
     *metodo para inicializar la instancia fila con lo que contiene la instancia fila de la clase Menu Banco
     */
     public void Iniciar_Lista_Fila(){ 
        this.instancia_fila = Menu_Banco.instancia_fila;
     }

    /**
     *metodo que carga el arreglo Vec_fila con el parametro de arreglo de fila de tipo cliente
     * @param Fila:recibe un arreglo de tipo cliente
     */
    public void Arreglo(Cliente Fila[]){
            this.Vec_fila=Fila;
            cont=20;
        }

    /**
     *metodo que reinicia la clase banco
     */
    public void reiniciar(){
        this.instancia_fila.Borrar_Todo();
        this.caja_1.clientes.Borrar_Todo();
        this.caja_2.clientes.Borrar_Todo();
        this.caja_3.clientes.Borrar_Todo();
        this.caja_4.clientes.Borrar_Todo();
        this.caja_5.clientes.Borrar_Todo();
        Nodo_Caja c1 = null;
        Nodo_Caja c2 = null;
        Nodo_Caja c3 = null;
        Nodo_Caja c4 = null;
        Nodo_Caja c5 = null;
        Cliente CL=null;
        cont_1=0;
        cont_2=0;
        cont_3=0;
        cont_4=0;
        cont_5=0;
        promedio_1=0;
        promedio_2=0;
        promedio_3=0;
        promedio_4=0;
        promedio_5=0;
        this.Vec_fila=null;
    }
    /**
     *metodo que procesa la cola del banco y asigna los clientes a las cajas
     */
    public void Procesar_Cajas(){
        boolean condicion=false;//variable de tipo boolean para controlar los primeros 5 clientes de la cola del banco 
        Nodo_Fila temp=instancia_fila.primero;//variable temporal de tipo Nodo_Fila 
        while(temp!=null){//ciclo while que recorre toda la lista de la fila del banco
            if(condicion==false){//condicion para verificar el primer ingreso de clientes a las cajas
                caja_1.clientes.agregar(temp.dato);//se agrega el nodo de tipo cliente a la lista de la caja
                instancia_fila.Borrar();//se borra el primer nodo de la lista fila por estar asignado en una caja
                instancia_fila.Agregar_Fila(CL=Vec_fila[cont]);//se agrega un nuevo cliente a la fila del banco
                instancia_fila.Ordenar_Fila();//se ordena la fila del banco
                cont=cont+1;//se aumenta la variable contador para tomar un nuevo indice del arreglo
                temp=instancia_fila.primero;//se asigna a la variable temporal el nuevo primero de la lista
                caja_2.clientes.agregar(temp.dato);//se agrega el nodo de tipo cliente a la lista de la caja
                instancia_fila.Borrar();//se borra el primer nodo de la lista fila por estar asignado en una caja
                instancia_fila.Agregar_Fila(CL=Vec_fila[cont]);//se agrega un nuevo cliente a la fila del banco
                instancia_fila.Ordenar_Fila();//se ordena la fila del banco
                cont=cont+1;//se aumenta la variable contador para tomar un nuevo indice del arreglo
                temp=instancia_fila.primero;//se asigna a la variable temporal el nuevo primero de la lista
                caja_3.clientes.agregar(temp.dato);//se agrega el nodo de tipo cliente a la lista de la caja
                instancia_fila.Borrar();//se borra el primer nodo de la lista fila por estar asignado en una caja
                instancia_fila.Agregar_Fila(CL=Vec_fila[cont]);//se agrega un nuevo cliente a la fila del banco
                instancia_fila.Ordenar_Fila();//se ordena la fila del banco
                cont=cont+1;//se aumenta la variable contador para tomar un nuevo indice del arreglo
                temp=instancia_fila.primero;//se asigna a la variable temporal el nuevo primero de la lista
                caja_4.clientes.agregar(temp.dato);//se agrega el nodo de tipo cliente a la lista de la caja
                instancia_fila.Borrar();//se borra el primer nodo de la lista fila por estar asignado en una caja
                instancia_fila.Agregar_Fila(CL=Vec_fila[cont]);//se agrega un nuevo cliente a la fila del banco
                instancia_fila.Ordenar_Fila();//se ordena la fila del banco
                cont=cont+1;//se aumenta la variable contador para tomar un nuevo indice del arreglo
                temp=instancia_fila.primero;//se asigna a la variable temporal el nuevo primero de la lista
                caja_5.clientes.agregar(temp.dato);//se agrega el nodo de tipo cliente a la lista de la caja
                instancia_fila.Borrar();//se borra el primer nodo de la lista fila por estar asignado en una caja
                instancia_fila.Agregar_Fila(CL=Vec_fila[cont]);//se agrega un nuevo cliente a la fila del banco
                instancia_fila.Ordenar_Fila();//se ordena la fila del banco
                cont=cont+1;//se aumenta la variable contador para tomar un nuevo indice del arreglo
                temp=instancia_fila.primero;//se asigna a la variable temporal el nuevo primero de la lista
                c1 = caja_1.clientes.primero;//se asigna el primer nodo de la lista de la caja a la variable de tipo Nodo_caja 
                c2 = caja_2.clientes.primero;//se asigna el primer nodo de la lista de la caja a la variable de tipo Nodo_caja
                c3 = caja_3.clientes.primero;//se asigna el primer nodo de la lista de la caja a la variable de tipo Nodo_caja
                c4 = caja_4.clientes.primero;//se asigna el primer nodo de la lista de la caja a la variable de tipo Nodo_caja
                c5 = caja_5.clientes.primero;//se asigna el primer nodo de la lista de la caja a la variable de tipo Nodo_caja
                cont_1=0;//se inicializa el contador de tiempo de la caja
                cont_2=0;//se inicializa el contador de tiempo de la caja
                cont_3=0;//se inicializa el contador de tiempo de la caja
                cont_4=0;//se inicializa el contador de tiempo de la caja
                cont_5=0;//se inicializa el contador de tiempo de la caja
                condicion=true;//se cambia el estado de la variable condicion para no volver a asignar los primeros 5 clientes de la fila
            }else{ 
                if(c1.dato.getDuracionTramite()==cont_1&&temp!=null){//condicion que verifica si el tiempo del tramite del cliente es igual al contador que maneja el tiempo de la caja
                    caja_1.clientes.agregar(temp.dato);//se agrega el nodo de tipo cliente a la lista de la caja
                    c1 = caja_1.clientes.primero;//se asigna el nuevo primer nodo de la lista de la caja a la variable de tipo Nodo_caja 
                    instancia_fila.Borrar();//se borra el primer nodo de la lista fila por estar asignado en una caja
                    temp=instancia_fila.primero;//se asigna a la variable temporal el nuevo primero de la lista
                    if(cont!=Vec_fila.length){//condicion para verificar si aun hay clientes en la fila para asignar a la cola del banco
                        instancia_fila.Agregar_Fila(CL=Vec_fila[cont]);//se agrega un nuevo cliente a la fila del banco
                        instancia_fila.Ordenar_Fila();//se ordena la fila del banco
                        cont=cont+1;//se aumenta la variable contador para tomar un nuevo indice del arreglo
                    }
                    cont_1=0;//se reinicia el contador de la caja para manejar el tiempo de un nuevo tramite de la caja
                }
                if(c2.dato.getDuracionTramite()==cont_2&&temp!=null){//condicion que verifica si el tiempo del tramite del cliente es igual al contador que maneja el tiempo de la caja
                    caja_2.clientes.agregar(temp.dato);//se agrega el nodo de tipo cliente a la lista de la caja
                    c2 = caja_2.clientes.primero;//se asigna el nuevo primer nodo de la lista de la caja a la variable de tipo Nodo_caja 
                    instancia_fila.Borrar();//se borra el primer nodo de la lista fila por estar asignado en una caja
                    temp=instancia_fila.primero;//se asigna a la variable temporal el nuevo primero de la lista
                    if(cont!=Vec_fila.length){//condicion para verificar si aun hay clientes en la fila para asignar a la cola del banco
                        instancia_fila.Agregar_Fila(CL=Vec_fila[cont]);//se agrega un nuevo cliente a la fila del banco
                        instancia_fila.Ordenar_Fila();//se ordena la fila del banco
                        cont=cont+1;//se aumenta la variable contador para tomar un nuevo indice del arreglo
                    }
                    cont_2=0;//se reinicia el contador de la caja para manejar el tiempo de un nuevo tramite de la caja
                }
                if(c3.dato.getDuracionTramite()==cont_3&&temp!=null){//condicion que verifica si el tiempo del tramite del cliente es igual al contador que maneja el tiempo de la caja
                    caja_3.clientes.agregar(temp.dato);//se agrega el nodo de tipo cliente a la lista de la caja
                    c3 = caja_3.clientes.primero;//se asigna el nuevo primer nodo de la lista de la caja a la variable de tipo Nodo_caja 
                    instancia_fila.Borrar();//se borra el primer nodo de la lista fila por estar asignado en una caja
                    temp=instancia_fila.primero;//se asigna a la variable temporal el nuevo primero de la lista
                    if(cont!=Vec_fila.length){//condicion para verificar si aun hay clientes en la fila para asignar a la cola del banco
                        instancia_fila.Agregar_Fila(CL=Vec_fila[cont]);//se agrega un nuevo cliente a la fila del banco
                        instancia_fila.Ordenar_Fila();//se ordena la fila del banco
                        cont=cont+1;//se aumenta la variable contador para tomar un nuevo indice del arreglo
                    }
                    cont_3=0;//se reinicia el contador de la caja para manejar el tiempo de un nuevo tramite de la caja
                }
                if(c4.dato.getDuracionTramite()==cont_4&&temp!=null){//condicion que verifica si el tiempo del tramite del cliente es igual al contador que maneja el tiempo de la caja
                    caja_4.clientes.agregar(temp.dato);//se agrega el nodo de tipo cliente a la lista de la caja
                    c4 = caja_4.clientes.primero;//se asigna el nuevo primer nodo de la lista de la caja a la variable de tipo Nodo_caja 
                    instancia_fila.Borrar();//se borra el primer nodo de la lista fila por estar asignado en una caja
                    temp=instancia_fila.primero;//se asigna a la variable temporal el nuevo primero de la lista
                    if(cont!=Vec_fila.length){//condicion para verificar si aun hay clientes en la fila para asignar a la cola del banco
                        instancia_fila.Agregar_Fila(CL=Vec_fila[cont]);//se agrega un nuevo cliente a la fila del banco
                        instancia_fila.Ordenar_Fila();//se ordena la fila del banco
                        cont=cont+1;//se aumenta la variable contador para tomar un nuevo indice del arreglo
                    }
                    cont_4=0;//se reinicia el contador de la caja para manejar el tiempo de un nuevo tramite de la caja
                }
                if(c5.dato.getDuracionTramite()==cont_5&&temp!=null){//condicion que verifica si el tiempo del tramite del cliente es igual al contador que maneja el tiempo de la caja
                    caja_5.clientes.agregar(temp.dato);//se agrega el nodo de tipo cliente a la lista de la caja
                    c5 = caja_5.clientes.primero;//se asigna el nuevo primer nodo de la lista de la caja a la variable de tipo Nodo_caja 
                    instancia_fila.Borrar();//se borra el primer nodo de la lista fila por estar asignado en una caja
                    temp=instancia_fila.primero;//se asigna a la variable temporal el nuevo primero de la lista 
                    if(cont!=Vec_fila.length){//condicion para verificar si aun hay clientes en la fila para asignar a la cola del banco
                        instancia_fila.Agregar_Fila(CL=Vec_fila[cont]);//se agrega un nuevo cliente a la fila del banco
                        instancia_fila.Ordenar_Fila();//se ordena la fila del banco
                        cont=cont+1;//se aumenta la variable contador para tomar un nuevo indice del arreglo
                    }
                    cont_5=0;//se reinicia el contador de la caja para manejar el tiempo de un nuevo tramite de la caja
                }
            }
            cont_1=cont_1+1;//se aumenta la variable contador de cada caja para representar un minuto de tiempo real de tramite
            cont_2=cont_2+1;//se aumenta la variable contador de cada caja para representar un minuto de tiempo real de tramite
            cont_3=cont_3+1;//se aumenta la variable contador de cada caja para representar un minuto de tiempo real de tramite
            cont_4=cont_4+1;//se aumenta la variable contador de cada caja para representar un minuto de tiempo real de tramite
            cont_5=cont_5+1;//se aumenta la variable contador de cada caja para representar un minuto de tiempo real de tramite
        }
    }

    /**
     *metodo para calcular los clientes, promedio de atencion de todos los tramites y el total de clientes atendidos por el banco 
     */
    public void Promedio_Caja(){
        Nodo_Caja temp = caja_1.clientes.primero;//variable temporal de tipo Nodo_caja que se inicializa con el primero de la caja_1 
        promedio_1=0;//inicializacion de la variable que almacena la cantidad de tiempo en tramites de una caja
        promedio_2=0;//inicializacion de la variable que almacena la cantidad de tiempo en tramites de una caja
        promedio_3=0;//inicializacion de la variable que almacena la cantidad de tiempo en tramites de una caja
        promedio_4=0;//inicializacion de la variable que almacena la cantidad de tiempo en tramites de una caja
        promedio_5=0;//inicializacion de la variable que almacena la cantidad de tiempo en tramites de una caja
        for(int x=0;x<5;x++){//ciclo for para recorrer las listas de las cajas del banco
            while(temp!=null){//ciclo while que recorre la lista de una caja en especifico 
                if(x==0){//condicion que verifica el contador del ciclo for para saber cual caja se esta utilizando
                    promedio_1=promedio_1+temp.dato.getDuracionTramite();//se aumenta la variable promedio con el tiempo del tramite del nodo de la lista que se esta leyendo en ese momento
                    temp=temp.sgte;//se asigna el nodo siguiente a la variable temporal
                }
                if(x==1){//condicion que verifica el contador del ciclo for para saber cual caja se esta utilizando
                    promedio_2=promedio_2+temp.dato.getDuracionTramite();//se aumenta la variable promedio con el tiempo del tramite del nodo de la lista que se esta leyendo en ese momento
                    temp=temp.sgte;//se asigna el nodo siguiente a la variable temporal
                }
                if(x==2){//condicion que verifica el contador del ciclo for para saber cual caja se esta utilizando
                    promedio_3=promedio_3+temp.dato.getDuracionTramite();//se aumenta la variable promedio con el tiempo del tramite del nodo de la lista que se esta leyendo en ese momento
                    temp=temp.sgte;//se asigna el nodo siguiente a la variable temporal
                }
                if(x==3){//condicion que verifica el contador del ciclo for para saber cual caja se esta utilizando
                    promedio_4=promedio_4+temp.dato.getDuracionTramite();//se aumenta la variable promedio con el tiempo del tramite del nodo de la lista que se esta leyendo en ese momento
                    temp=temp.sgte;//se asigna el nodo siguiente a la variable temporal
                }
                if(x==4){//condicion que verifica el contador del ciclo for para saber cual caja se esta utilizando
                    promedio_5=promedio_5+temp.dato.getDuracionTramite();//se aumenta la variable promedio con el tiempo del tramite del nodo de la lista que se esta leyendo en ese momento
                    temp=temp.sgte;//se asigna el nodo siguiente a la variable temporal
                }
            }
            if(x==0){//condicion que verifica el contador del ciclo for para asignar a la variable temporal la caja que se va a utilizar en la siguiente repeticion del ciclo
                temp = caja_2.clientes.primero;//se asigna el primero de la caja a la variable temporal
            }
            if(x==1){//condicion que verifica el contador del ciclo for para asignar a la variable temporal la caja que se va a utilizar en la siguiente repeticion del ciclo
                temp = caja_3.clientes.primero;//se asigna el primero de la caja a la variable temporal
            }
            if(x==2){//condicion que verifica el contador del ciclo for para asignar a la variable temporal la caja que se va a utilizar en la siguiente repeticion del ciclo
                temp = caja_4.clientes.primero;//se asigna el primero de la caja a la variable temporal
            }
            if(x==3){//condicion que verifica el contador del ciclo for para asignar a la variable temporal la caja que se va a utilizar en la siguiente repeticion del ciclo
                temp = caja_5.clientes.primero;//se asigna el primero de la caja a la variable temporal
            }
        }
        JOptionPane.showMessageDialog(null,"Cajas:\n"//se imprime en pantalla la informacion de las cajas
                + "     Nombre de Caja: "+caja_1.nombre+"\n"
                + "         Cantidad de clientes atendidos: "+caja_1.clientes.tamaño+"\n"
                + "         Promedio de tiempo: "+(promedio_1/caja_1.clientes.tamaño)+" min "+"\n"
                + "     Nombre de Caja: "+caja_2.nombre+"\n"
                + "         Cantidad de clientes atendidos: "+caja_2.clientes.tamaño+"\n"
                + "         Promedio de tiempo: "+(promedio_2/caja_2.clientes.tamaño)+" min "+"\n"
                + "     Nombre de Caja: "+caja_3.nombre+"\n"
                + "         Cantidad de clientes atendidos: "+caja_3.clientes.tamaño+"\n"
                + "         Promedio de tiempo: "+(promedio_3/caja_3.clientes.tamaño)+" min "+"\n"
                + "     Nombre de Caja: "+caja_4.nombre+"\n"
                + "         Cantidad de clientes atendidos: "+caja_4.clientes.tamaño+"\n"
                + "         Promedio de tiempo: "+(promedio_4/caja_4.clientes.tamaño)+" min "+"\n"
                + "     Nombre de Caja: "+caja_5.nombre+"\n"
                + "         Cantidad de clientes atendidos: "+caja_5.clientes.tamaño+"\n"
                + "         Promedio de tiempo: "+(promedio_5/caja_5.clientes.tamaño)+" min "+"\n"
                + "     Total de Clientes Atendidos: "+(caja_1.clientes.tamaño+caja_2.clientes.tamaño
                            +caja_3.clientes.tamaño+caja_4.clientes.tamaño+caja_5.clientes.tamaño),
                "Información de rendimiento de cajas",JOptionPane.INFORMATION_MESSAGE);
    }
}
