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
 *  Fecha de Última Edición 1/12/2015
 * @author Jose Miguel y Diego
 */
public class Menu_Banco {
    Scanner dato = new Scanner(System.in);//objeto Scanner para capturar datos del usuario del sistema
    //variables de la clase Menu_Banco
        String opcion;//variable string para almacenar la opcion escojida del usuario
        //arreglo de tipo string que almacena los nombres utilazados al azar como clientes 
        String[] Vec_nom={"José","Allan","Melissa","Cristina","Diego","María","Olger","Pablo","Juan","Antonio"};
        //arreglo de tipo char que almacena las letras de las preoridades utilizadas al azar para los clientes 
        char[] Vec_prioridad={'A','B','C','D'};
        Cliente CL;//variable de tipo cliente para poder agregar a la lista de la fila
    //Instancias estaticas del sistema
        public static ListaFila instancia_fila = new ListaFila();
        public static Banco instancia_banco = new Banco();
    /**
     *Método que permite mostrar el menú principal del simulador
     */
        public void Menu(){
        do{//while de reimprecion del menu 
            opcion=JOptionPane.showInputDialog(null,
                "                   - Bienvenidos al Simulador de Bancos -\n"
                + "     Para mayor rapidez en su trámite favor siga las instrucciones.\n \n"
                + "Ingrese cualquiera de las instrucciones siguiente, segun sea su necesidad.\n"
                + "1- Inicio de Simulador de fila Bancaria.\n"
                + "2- Salir del sistema.", 
        "PLATAFORMA INICIAL INGRESO AL SIMULADOR",JOptionPane.INFORMATION_MESSAGE);//imprime a patalla el menu
                switch(opcion){//Switch Case de las opciones 
                    case "1":
                        //inicializa el arreglo Vec_fila con la cantidad de clientes que se utilizaran en la simulacion del banco 
                        Cliente Vec_fila[]= new Cliente[(int)Math.floor(Math.random() * (100-20) +20)];
                        for(int x=0;x<Vec_fila.length;x++){//ciclo for para cagar el arreglo Vec_fila con los clientes generados al azar 
                            Vec_fila[x]=new Cliente((Vec_nom[(int)Math.floor(Math.random() * 10 +0)]),
                                    (Vec_prioridad[(int)Math.floor(Math.random() * 4 + 0)]),x+1,
                                    ((int)Math.floor(Math.random() * (25-3)+3)));//agrega un nuevo cliente al arreglo Vec_fila con el indice del contador del ciclo for
                        }
                        for(int y=0;y<20;y++){//ciclo for para agregar los primeros 20 clientes iniciales a la lista fila del banco
                            instancia_fila.Agregar_Fila(CL=Vec_fila[y]);//agrega el cliente del arreglo Vec_fila a la lista fila
                        }
                        instancia_fila.Ordenar_Fila();//ordena la lista de clientes recien ingresada
                        instancia_banco.Arreglo(Vec_fila);//inicializa el arreglo de tipo clientes con los clientes del arreglo Vec_fila
                        instancia_banco.Iniciar_Lista_Fila();//inicializa la lista fila de la clase banco 
                        instancia_banco.Procesar_Cajas();//procesa todos clientes del banco en las cajas bajo el esquema de cola FIFO 
                        instancia_banco.Promedio_Caja();//calcula los promedios de los cajeros y las cantidades de clientes 
                        instancia_banco.reiniciar();//reinicia todos los cajeros y la fila del banco para una nueva simulacion
                        CL=null;
                        break;    
                    default:
                        opcion="2";
                        break;
                }
            }while(!"2".equals(opcion));//condicion do while que verifica la opcion
        JOptionPane.showMessageDialog(null, "Gracias por su visita, lo esperamos pronto.");//imprime a pantalla
    }
}
