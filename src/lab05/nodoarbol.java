
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab05;

/**
 *
 * @author josh
 */
public class nodoarbol {
    int dato;
    String nombre;
    nodoarbol hijoIzquierdo, hijoDerecho;
    public nodoarbol(int d, String nom){
        this.dato=d;
        this.nombre=nom;
        this.hijoDerecho=null;
        this.hijoIzquierdo=null;
    }
    public String toString(){
        System.out.println("este es un mensaje nuevo ");
        return nombre + "su datos es" + dato;
    }
    
}
