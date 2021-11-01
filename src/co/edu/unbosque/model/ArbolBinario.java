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

}
