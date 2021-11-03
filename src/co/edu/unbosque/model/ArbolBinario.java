package co.edu.unbosque.model;

public class ArbolBinario {
    protected Nodo raiz;

    public ArbolBinario() {
        raiz=null;
    }

    public ArbolBinario(Nodo raiz) {
        this.raiz = raiz;
    }
    public Nodo raizArbol(){
        return raiz;
    }
    public boolean arbolVacio(){
        return raiz==null;
    }

    public static  Nodo nuevoArbol(Nodo ramaIzq,Object dato, Nodo ramaDcha){
        return  new Nodo(ramaIzq,dato,ramaDcha);
    }

    public static void preOrden(Nodo r){
        if(r != null){
            visitar(r.getDato());
            preOrden(r.getIzquierdo());
            preOrden(r.getDerecho());
        }
    }

    public static void inOrden(Nodo r){
        if(r != null){

            preOrden(r.getIzquierdo());
            visitar(r.getDato());
            preOrden(r.getDerecho());
        }
    }
    public static void postOrden(Nodo r){
        if(r != null){
            preOrden(r.getIzquierdo());
            preOrden(r.getDerecho());
            visitar(r.getDato());
        }
    }
    public static void visitar(Object dato){
        System.out.print(dato+", ");
    }

    public Nodo getRaiz() {
        return raiz;
    }
}
