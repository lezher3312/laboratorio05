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
    public void agregarnodo(int d){
        nodoarbol nuevo = new nodoarbol(d);
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
    //metodo para saber cuando el arbol esta vacio
    public boolean estaVacio(){
        return raiz==null;
    }
    // metodo para recorrer el arbol Inorden
    public void inOrden(nodoarbol r){
        if(r!=null){
            inOrden(r.hijoIzquierdo);
            System.out.println(r.dato +",");
            System.out.println("inOrden: I,R,D");
            inOrden(r.hijoDerecho);
        }
    }
     //metodo para recorrer el arbol PreOrden
     public void PreOrden(nodoarbol r){
        if(r!=null){
        System.out.print(r.dato+", ");
        System.out.println("PreOrden: R,I,D");
            PreOrden(r.hijoIzquierdo);
            PreOrden(r.hijoDerecho);
       }
     }
     //metodo para recorrer el arbol PostOrden
     public void PostOrden(nodoarbol r){
        if(r!=null){
            
            PostOrden(r.hijoIzquierdo);
            PostOrden(r.hijoDerecho);
            System.out.print(r.dato+", ");
            System.out.println("PostOrden: I,D,R");
        }
     } 
     //Metodo para buscar un Nodo en el arbol
     public nodoarbol buscarNodo(int d){
         nodoarbol aux=raiz;
         while(aux.dato!=d){
             if(d<aux.dato){
                 aux=aux.hijoIzquierdo;
             }
             if(aux==null){
                 return null;
             }
         }
         return aux;
     }
     //Metodo para Eliminar un Nodo del Arbol
     public boolean eliminar(int d){
         nodoarbol auxiliar=raiz;
         nodoarbol padre=raiz;
         boolean esHijoIzq=true;
         while(auxiliar.dato!=d){
             padre=auxiliar;
             if(d<auxiliar.dato){
                 esHijoIzq=true;
                 auxiliar=auxiliar.hijoIzquierdo;
             }else{
                 esHijoIzq=false;
                 auxiliar=auxiliar.hijoDerecho;
             }
             if(auxiliar==null){
                 return false;
             }
         }//fin del while
         if(auxiliar.hijoIzquierdo==null && auxiliar.hijoDerecho==null){
             if(auxiliar==raiz){
                 raiz=null;
             }else if(esHijoIzq){
                 padre.hijoIzquierdo=null;
             }else{
                 padre.hijoDerecho=null;
             }
             
         }else if(auxiliar.hijoDerecho==null){
             
             if(auxiliar==raiz){
                 
                 raiz=auxiliar.hijoIzquierdo; 
                 
             }else if(esHijoIzq){
                 
                 padre.hijoIzquierdo=auxiliar.hijoIzquierdo;
                 
             }else{
                 
                 padre.hijoDerecho=auxiliar.hijoIzquierdo;
             }
             
         }else if(auxiliar.hijoIzquierdo==null){
             if(auxiliar==raiz){
                 raiz=auxiliar.hijoDerecho;
             }else if(esHijoIzq){
                 padre.hijoIzquierdo=auxiliar.hijoDerecho;
                  }else{
                 padre.hijoDerecho=auxiliar.hijoIzquierdo;
           }  
         }else{
             nodoarbol reemplazo=obtenerNodoReemplazo(auxiliar);
             if(auxiliar==raiz){
                 raiz=reemplazo;
             }else if(esHijoIzq){
                 padre.hijoIzquierdo=reemplazo;
             }else{
                 padre.hijoDerecho=reemplazo;
             }
             reemplazo.hijoIzquierdo=auxiliar.hijoIzquierdo;
         }
           return true;
       }
         //Metodo encargado de devolver el nodo reemplazo
         public nodoarbol obtenerNodoReemplazo(nodoarbol nodoReemp){
           nodoarbol reemplazarPadre=nodoReemp;
           nodoarbol reemplazo=nodoReemp;
           nodoarbol auxiliar=nodoReemp.hijoDerecho;
           while(auxiliar!=null){
               reemplazarPadre=reemplazo;
               reemplazo=auxiliar;
               auxiliar=auxiliar.hijoIzquierdo;
           }
           if(reemplazo!=nodoReemp.hijoDerecho){
               reemplazarPadre.hijoIzquierdo=reemplazo.hijoDerecho;
               reemplazo.hijoDerecho=nodoReemp.hijoDerecho;
       }
           System.out.println("El Nodo Reemplazo es: " + reemplazo);
           return reemplazo;
    }
}
