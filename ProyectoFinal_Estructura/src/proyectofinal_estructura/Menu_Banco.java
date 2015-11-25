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
        Cliente[] Vec= new Cliente[10]; 
    public void Menu(){
        do{//while de reimprecion del menu 
                System.out.println();
                System.out.println("Bienvenidos al Simulador de Bancos");
                System.out.println("1- Generar Simulacion.");
                System.out.println("2- Salir.");
                opcion=dato.next();

                switch(opcion){//Switch Case de las opciones 
                    case "1":
                        
                        break;    
                    default:
                        opcion="3";
                        break;
                }
            }while(opcion!="3");
    }
}
