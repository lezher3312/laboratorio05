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
        //String nombre;
        arbolavl arbolito = new arbolavl();
        do{    
            try{
                opcion= Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar un nodo\n"
                        +"2. Recorrer el Arbol InOrden\n"
                        + "3. Recorrer el Arbol PreOrden\n" 
                        + "4. Recorrer el Arbol PostOrden\n"  
                        + "5. Buscar un Nodo en el Arbol\n"  
                        + "6. Eliminar un Nodo del Arbol\n"  
                        +"7. Salir\n"
                    +"Elige una opcion...","Arboles Binarios Avl"
                ,JOptionPane.QUESTION_MESSAGE));
                switch(opcion){
                    case 1:
                        elemento=Integer.parseInt(JOptionPane.showInputDialog(null,
                                "ingresa el numero del Nodo..","Agregando Nodo"
                        ,JOptionPane.QUESTION_MESSAGE));
                        /*nombre= JOptionPane.showInputDialog(null,
                                //"ingresa el nombre del Nodo..","Agregando Nodo"
                        ,JOptionPane.QUESTION_MESSAGE);*/
                        arbolito.agregarnodo(elemento);
                        break;
                    case 2:
                        if(!arbolito.estaVacio()){
                            arbolito.inOrden(arbolito.raiz);
                        }else{
                            JOptionPane.showMessageDialog(null,"El arbol esta vacio",
                                "¡CUIDADO!", JOptionPane.INFORMATION_MESSAGE);
                        }
                        
                        break;
                    case 3:
                         if(!arbolito.estaVacio()){
                              System.out.println();
                        arbolito.PreOrden(arbolito.raiz); 
                        }else{
                                                    JOptionPane.showMessageDialog(null,"El Arbol esta Vacio","¡Cuidado!"
                             ,JOptionPane.INFORMATION_MESSAGE); 
                          }
                       break;
                        case 4:
                          if(!arbolito.estaVacio()){
                              System.out.println();
                        arbolito.PostOrden(arbolito.raiz); 
                     }else{
                       JOptionPane.showMessageDialog(null,"El Arbol esta Vacio","¡Cuidado!"
                             ,JOptionPane.INFORMATION_MESSAGE); 
                          }
                       break;
                         case 5:
                          if(!arbolito.estaVacio()){
                         elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                             "Ingresar el Numero del Nodo Buscado....", "Buscando Nodo",JOptionPane.QUESTION_MESSAGE));
                        // arbolito.buscarNodo(elemento);
                         if(arbolito.buscarNodo(elemento)==null){
                          JOptionPane.showMessageDialog(null,"El Nodo no se encuentra en el Arbol","¡Nodo no Encontrado!"
                             ,JOptionPane.INFORMATION_MESSAGE);     
                         }else{
                             System.out.println("Nodo Encontrado, sus datos son: " + (elemento));
                         }
                     }else{
                       JOptionPane.showMessageDialog(null,"El Arbol esta Vacio","¡Cuidado!"
                             ,JOptionPane.INFORMATION_MESSAGE); 
                          }
                       break;
                         case 6:
                             if(!arbolito.estaVacio()){
                         elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                             "Ingresar el Numero del Nodo a Eliminar....", "Eliminando Nodo",JOptionPane.QUESTION_MESSAGE));
                        // arbolito.buscarNodo(elemento);
                         if(arbolito.eliminar(elemento)==false){
                          JOptionPane.showMessageDialog(null,"El Nodo no se encuentra en el Arbol","¡Nodo no Encontrado!"
                             ,JOptionPane.INFORMATION_MESSAGE);     
                         }else{
                            JOptionPane.showMessageDialog(null,"El Nodo ha sido Eliminado del Arbol","¡Nodo Eliminado!"
                             ,JOptionPane.INFORMATION_MESSAGE);     
                         }
                     }else{
                       JOptionPane.showMessageDialog(null,"El Arbol esta Vacio","¡Cuidado!"
                             ,JOptionPane.INFORMATION_MESSAGE); 
                          } 
                             break;
                        case 7: 
                        JOptionPane.showMessageDialog(null,"Aplicacion Finalizada",
                                "Fin", JOptionPane.INFORMATION_MESSAGE);
                        break;
                        default:
                        JOptionPane.showMessageDialog(null,"opccion Incorrecta",
                                "!Cuidado¡", JOptionPane.INFORMATION_MESSAGE);        
                }
            }catch (NumberFormatException n){
                JOptionPane.showMessageDialog(null,"error" + n.getMessage());
             }    
        }while(opcion!=7);
    }
    
}
