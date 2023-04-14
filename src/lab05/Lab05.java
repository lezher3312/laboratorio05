/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab05;

import javax.swing.JOptionPane;

/**
 *
 * @author josh
 */
public class Lab05 {

    /**
     * @param args the command line arguments
     */
    //agregue un panel de opciones
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion=0, elemento;
        String nombre;
        arbolavl arbolito = new arbolavl();
        do{    
            try{
                opcion= Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar un nodo\n"
                +"2. Salir\n"
                    +"Elige una opcion...","Arboles Binarios"
                ,JOptionPane.QUESTION_MESSAGE));
                switch(opcion){
                    case 1:
                        elemento=Integer.parseInt(JOptionPane.showInputDialog(null,
                                "ingresa el numero del Nodo..","Agregando Nodo"
                        ,JOptionPane.QUESTION_MESSAGE));
                        nombre= JOptionPane.showInputDialog(null,
                                "ingresa el nombre del Nodo..","Agregando Nodo"
                        ,JOptionPane.QUESTION_MESSAGE);
                        arbolito.agregarnodo(elemento, nombre);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null,"Aplicacion Finalizada");
                }
            }catch (NumberFormatException n){
                JOptionPane.showMessageDialog(null,"error" + n.getMessage());
             }    
        }while(opcion!=2);
    }
    
}
