package co.edu.unbosque.model;

public class ArbolBinarioBusqueda extends  ArbolBinario{
    public ArbolBinarioBusqueda() {
        super();
    }

    public Nodo buscar(Object buscado){
        Comparador dato;
        dato= (Comparador) buscado;
        if(raiz==null){
            return null;
        }else{
            return localizar (raizArbol(),dato);
        }
    }
    protected Nodo localizar(Nodo raizSub, Comparador buscado){
        if(raizSub==null){
            return null;
        }else if (buscado.igualQue(raizSub.getDato())){
            return raiz;
        }
        else if (buscado.menorQue(raizSub.getDato())){
            return localizar(raizSub.getIzquierdo(), buscado);
        }else {
            return localizar(raizSub.getDerecho(), buscado);
        }
    }

    public void insertar(Object valor )throws Exception{
        Comparador  dato;
        dato = (Comparador) valor;
        raiz = insertar(raiz, dato);

    }

    protected Nodo insertar(Nodo raizSub, Comparador dato)throws Exception{
        if(raizSub==null){
            raizSub = new Nodo(dato);
        }else if(dato.menorQue(raizSub.getDato())){
            Nodo izq;
            izq = insertar(raizSub, dato);
            raizSub.setIzquierdo(izq);
        }else if(dato.menorQue((raizSub.getDato()))) {
            Nodo drch;
            drch = insertar(raizSub, dato);
            raizSub.setDerecho(drch);
        }else{
            throw new Exception("Nodo duplicado");
        }
        return raizSub;
    }
}
