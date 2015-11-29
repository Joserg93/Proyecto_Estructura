/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal_estructura;

import javax.swing.JOptionPane;

/**
 *  Fecha de Primera Edición 16/11/2015
 *  Fecha de Última Edición 29/11/2015
 * @author Jose Miguel y Diego
 */
public class Banco {
    //Instancias de la clase banco 
        Caja caja_1 = new Caja("Caja 1");
        Caja caja_2 = new Caja("Caja 2");
        Caja caja_3 = new Caja("Caja 3");
        Caja caja_4 = new Caja("Caja 4");
        Caja caja_5 = new Caja("Caja 5");
    //atributos de la clase
        Nodo_Fila primero_fila = null;
        Nodo_Fila ultimo_fila = null;
        Nodo_Caja c1 = null;
        Nodo_Caja c2 = null;
        Nodo_Caja c3 = null;
        Nodo_Caja c4 = null;
        Nodo_Caja c5 = null;
        public int cont_1,cont_2,cont_3,cont_4,cont_5;
        public int promedio_1,promedio_2,promedio_3,promedio_4,promedio_5;
        public Caja caja;
        
        public void Iniciar_Banco(){ 
            this.primero_fila = Menu_Banco.instancia_fila.primero;
            //this.ultimo_fila = Menu_Banco.instancia_fila.ultimo;
        }
    /**
     *
     */
    public void Procesar_Cajas(){
        Nodo_Fila temp=primero_fila;
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
                c1 = caja_1.clientes.primero;
                c2 = caja_2.clientes.primero;
                c3 = caja_3.clientes.primero;
                c4 = caja_4.clientes.primero;
                c5 = caja_5.clientes.primero;
                cont_1=0;
                cont_2=0;
                cont_3=0;
                cont_4=0;
                cont_5=0;
            }else{
                if(c1.dato.getDuracionTramite()==cont_1&&temp!=null){
                    caja_1.clientes.agregar(temp.dato);
                    c1 = caja_1.clientes.primero;
                    temp=temp.sgte;
                    cont_1=0;
                }
                if(c2.dato.getDuracionTramite()==cont_2&&temp!=null){
                    caja_2.clientes.agregar(temp.dato);
                    c2 = caja_2.clientes.primero;
                    temp=temp.sgte;
                    cont_2=0;
                }
                if(c3.dato.getDuracionTramite()==cont_3&&temp!=null){
                    caja_3.clientes.agregar(temp.dato);
                    c3 = caja_3.clientes.primero;
                    temp=temp.sgte;
                    cont_3=0;
                }
                if(c4.dato.getDuracionTramite()==cont_4&&temp!=null){
                    caja_4.clientes.agregar(temp.dato);
                    c4 = caja_4.clientes.primero;
                    temp=temp.sgte;
                    cont_4=0;
                }
                if(c5.dato.getDuracionTramite()==cont_5&&temp!=null){
                    caja_5.clientes.agregar(temp.dato);
                    c5 = caja_5.clientes.primero;
                    temp=temp.sgte;
                    cont_5=0;
                }
            }
            cont_1=cont_1+1;
            cont_2=cont_2+1;
            cont_3=cont_3+1;
            cont_4=cont_4+1;
            cont_5=cont_5+1;
        }
    }
    public void Promedio_Caja(){
        Nodo_Caja temp = caja_1.clientes.primero;
        promedio_1=0;
        promedio_2=0;
        promedio_3=0;
        promedio_4=0;
        promedio_5=0;
        for(int x=0;x<5;x++){
            while(temp!=null){
                if(x==0){
                    promedio_1=promedio_1+temp.dato.getDuracionTramite();
                    temp=temp.sgte;
                }
                if(x==1){
                    promedio_2=promedio_2+temp.dato.getDuracionTramite();
                    temp=temp.sgte;
                }
                if(x==2){
                    promedio_3=promedio_3+temp.dato.getDuracionTramite();
                    temp=temp.sgte;
                }
                if(x==3){
                    promedio_4=promedio_4+temp.dato.getDuracionTramite();
                    temp=temp.sgte;
                }
                if(x==4){
                    promedio_5=promedio_5+temp.dato.getDuracionTramite();
                    temp=temp.sgte;
                }
            }
            if(x==0){
                temp = caja_2.clientes.primero;
            }
            if(x==1){
                temp = caja_3.clientes.primero;
            }
            if(x==2){
                temp = caja_4.clientes.primero;
            }
            if(x==3){
                temp = caja_5.clientes.primero;
            }
        }
        JOptionPane.showMessageDialog(null,"Cajas:\n"
                + "     Nombre de Caja: "+caja_1.nombre+"\n"
                + "         Cantidad de clientes atendidos: "+caja_1.clientes.tamaño+"\n"
                + "         Promedio de tiempo: "+(promedio_1/caja_1.clientes.tamaño)+"\n"
                + "     Nombre de Caja: "+caja_2.nombre+"\n"
                + "         Cantidad de clientes atendidos: "+caja_2.clientes.tamaño+"\n"
                + "         Promedio de tiempo: "+(promedio_1/caja_2.clientes.tamaño)+"\n"
                + "     Nombre de Caja: "+caja_3.nombre+"\n"
                + "         Cantidad de clientes atendidos: "+caja_3.clientes.tamaño+"\n"
                + "         Promedio de tiempo: "+(promedio_1/caja_3.clientes.tamaño)+"\n"
                + "     Nombre de Caja: "+caja_4.nombre+"\n"
                + "         Cantidad de clientes atendidos: "+caja_4.clientes.tamaño+"\n"
                + "         Promedio de tiempo: "+(promedio_1/caja_4.clientes.tamaño)+"\n"
                + "     Nombre de Caja: "+caja_5.nombre+"\n"
                + "         Cantidad de clientes atendidos: "+caja_5.clientes.tamaño+"\n"
                + "         Promedio de tiempo: "+(promedio_1/caja_5.clientes.tamaño),
                "Información de rendimiento de cajas",JOptionPane.INFORMATION_MESSAGE);
//        
//        System.out.println("Nombre de Caja: "+caja_1.nombre+" Cantidad de clientes atendidos: "
//                +caja_1.clientes.tamaño+" promedio de tiempo: "+(promedio_1/caja_1.clientes.tamaño));
//        System.out.println("Nombre de Caja: "+caja_2.nombre+" Cantidad de clientes atendidos: "
//                +caja_2.clientes.tamaño+" promedio de tiempo: "+(promedio_2/caja_2.clientes.tamaño));
//        System.out.println("Nombre de Caja: "+caja_3.nombre+" Cantidad de clientes atendidos: "
//                +caja_3.clientes.tamaño+" promedio de tiempo: "+(promedio_3/caja_3.clientes.tamaño));
//        System.out.println("Nombre de Caja: "+caja_4.nombre+" Cantidad de clientes atendidos: "
//                +caja_4.clientes.tamaño+" promedio de tiempo: "+(promedio_4/caja_4.clientes.tamaño));
//        System.out.println("Nombre de Caja: "+caja_5.nombre+" Cantidad de clientes atendidos: "
//                +caja_5.clientes.tamaño+" promedio de tiempo: "+(promedio_5/caja_5.clientes.tamaño));
//        System.out.println("Tolal de clientes atendidos: "+(caja_1.clientes.tamaño+caja_2.clientes.tamaño
//                +caja_3.clientes.tamaño+caja_4.clientes.tamaño+caja_5.clientes.tamaño));
    }
}
