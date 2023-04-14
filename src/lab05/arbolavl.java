/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab05;

/**
 *
 * @author josh
 */
public class arbolavl {
    nodoarbol raiz;
    public arbolavl(){
        raiz=null;
        System.out.println("se agrego un constructor ");
    }
    
    //metodo para insertar un nodo en el arbol
    public void agregarnodo(int d, String nom){
        nodoarbol nuevo = new nodoarbol(d,nom);
        if (raiz ==null){
            raiz=nuevo;
        }else{
            nodoarbol auxiliar =raiz;
            nodoarbol padre;
            while(true){
                padre=auxiliar;
                if(d<auxiliar.dato){
                    auxiliar=auxiliar.hijoIzquierdo;
                    if(auxiliar==null){
                        padre.hijoIzquierdo=nuevo;
                        return;
                    }
                }else{
                    auxiliar=auxiliar.hijoDerecho;
                    if(auxiliar ==null){
                        padre.hijoDerecho=nuevo;
                        return;
                    }
                }
            }
        }
    }
    
}
