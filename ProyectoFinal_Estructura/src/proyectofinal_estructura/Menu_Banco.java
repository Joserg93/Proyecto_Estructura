/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal_estructura;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *  Fecha de Primera Edición 16/11/2015
 *  Fecha de Última Edición 29/11/2015
 * @author Jose Miguel y Diego
 */
public class Menu_Banco {
    Scanner dato = new Scanner(System.in);//objeto Scanner para capturar datos del usuario del sistema
    //variables para guardar la informacion capturada del sistema
        String usuario, pass;
        String opcion;
        String[] Vec_nom={"José","Allan","Melissa","Cristina","Diego","María","Olger","Pablo","Juan","Antonio"};
        char[] Vec_prioridad={'A','B','C','D'};
        Nodo_Cliente CL;
        int cont=0;
        int random=0;
    //Instancias del sistema
        public static ListaFila instancia_fila = new ListaFila();
        public static Banco instancia_banco = new Banco();
    //Metodo Menu
    public void Menu(){
        do{//while de reimprecion del menu 
            opcion=JOptionPane.showInputDialog(null,
                "                   - Bienvenidos al Simulador de Bancos -\n"
                + "     Para mayor rapidez en su trámite favor siga las instrucciones.\n \n"
                + "Ingrese cualquiera de las instrucciones siguiente, segun sea su necesidad.\n"
                + "1- Inicio de Simulador de fila Bancaria.\n"
                + "2- Salir del sistema.", 
        "PLATAFORMA INICIAL INGRESO AL SIMULADOR",JOptionPane.INFORMATION_MESSAGE);
//                System.out.println();
//                System.out.println("Bienvenidos al Simulador de Bancos");
//                System.out.println("1- Generar Simulacion.");
//                System.out.println("2- Salir.");
//                opcion=dato.next();
                switch(opcion){//Switch Case de las opciones 
                    case "1":
                        cont=0;
                    //Inicio Carga lista de personas que se encuentran listas para entrar a la fila
                        Nodo_Cliente Vec_fila[]= new Nodo_Cliente[(int)Math.floor(Math.random()*100+20)];
                        for(int x=0;x<Vec_fila.length;x++){
                            Vec_fila[x]=new Nodo_Cliente((Vec_nom[(int)Math.floor(Math.random() * 10 +0)]),
                                    (Vec_prioridad[(int)Math.floor(Math.random() * 4 + 0)]),x+1,
                                    ((int)Math.floor(Math.random() * 25+3)));
                        }
                    //Fin Carga lista de personas que se encuentran listas para entrar a la fila
                        for(int x=0;x<Vec_fila.length;x++){
                            if(cont==20){
                                for(int y=0;y<20;y++){
                                    instancia_fila.Agregar_Fila(Vec_fila[y]);
                                }
//                                instancia_fila.Imprimir();
                                instancia_fila.Ordenar_Fila();
                                instancia_banco.Iniciar_Banco();
//                                System.out.println();
//                                instancia_fila.Imprimir();
                                instancia_banco.Procesar_Cajas();
                                instancia_banco.Promedio_Caja();
                            }
                            cont=cont+1;
                        }
                        break;    
                    default:
                        opcion="2";
                        break;
                }
            }while(!"2".equals(opcion));
        JOptionPane.showMessageDialog(null, "Gracias por su visita, lo esperamos pronto.");
    }
}
