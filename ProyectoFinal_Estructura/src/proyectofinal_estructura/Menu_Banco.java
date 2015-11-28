/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal_estructura;
import java.util.Scanner;
/**
 *
 * @author joser
 */
public class Menu_Banco {
    Scanner dato = new Scanner(System.in);//objeto Scanner para capturar datos del usuario del sistema
    //variables para guardar la informacion capturada del sistema
        String usuario, pass;
        String opcion;
        String[] Vec_nom={"José","Allan","Melissa","Cristina","Diego","María","Olger","Pablo","Juan","Antonio"};
        char[] Vec_prioridad={'A','B','C','D'};
        Cliente CL;
        int rango=0;
        int cont=0;
        int random=0;
    //Instancias del sistema
        public static ListaFila instancia_fila = new ListaFila();
        
    //Metodo Menu
    public void Menu(){
        do{//while de reimprecion del menu 
                System.out.println();
                System.out.println("Bienvenidos al Simulador de Bancos");
                System.out.println("1- Generar Simulacion.");
                System.out.println("2- Salir.");
                opcion=dato.next();

                switch(opcion){//Switch Case de las opciones 
                    case "1":
                        cont=0;
                        rango=(int) (Math.random() * 100 + 20);
                        Cliente Vec_fila[]= new Cliente[rango];
                        for(int x=0;x<Vec_fila.length;x++){
                            Vec_fila[x]=new Cliente((Vec_nom[(int) (Math.random() * 10 +0)]),
                                    (Vec_prioridad[(int) (Math.random() * 4 + 0)]),x+1,
                                    ((int) (Math.random() * 25+3)));
                        }
                        for(int x=0;x<Vec_fila.length;x++){
                            if(cont==20){
                                for(int y=0;y<20;y++){
                                    instancia_fila.Agregar_Fila(Vec_fila[y]);
                                }
                                instancia_fila.Imprimir();
                                instancia_fila.Ordenar_Fila();
                                System.out.println();
                                instancia_fila.Imprimir();
                            }
                            cont=cont+1;
                        }
                       
                        break;    
                    default:
                        opcion="3";
                        break;
                }
            }while(opcion!="3");
    }
}
