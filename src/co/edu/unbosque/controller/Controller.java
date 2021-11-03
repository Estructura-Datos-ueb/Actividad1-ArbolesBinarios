package co.edu.unbosque.controller;

import co.edu.unbosque.view.ViewConsole;
import co.edu.unbosque.model.Nodo;
import co.edu.unbosque.model.PilaVector;
import co.edu.unbosque.model.ArbolBinario;
import co.edu.unbosque.model.ArbolBinarioBusqueda;

public class Controller {

    private ViewConsole v;
    private Nodo a,a1,a2 ;
    private ArbolBinario arbol ;
    private ArbolBinarioBusqueda abb = new ArbolBinarioBusqueda() ;
    private PilaVector pila = new PilaVector();

    public Controller (){
        	v = new ViewConsole();
        	start();
    }
    
    public void start() {
/*
        a1 = ArbolBinario.nuevoArbol(null, 1, null);
        a2 = ArbolBinario.nuevoArbol(null,4 , null);
        a = ArbolBinario.nuevoArbol(a1, 5, a2);
        pila.insertar(a);
        System.out.println("in orden");
        ArbolBinario.inOrden(a);
        System.out.println("");
        System.out.println("post orden");
        ArbolBinario.postOrden(a);
        System.out.println("");
        System.out.println("pre orden");
        ArbolBinario.preOrden(a);
*/


            try {
                //a2 = ArbolBinario.nuevoArbol(null,4 , null);
                //abb.buscar(a2);
                System.out.println("" + abb.insertar(10));
                System.out.println("" + abb.insertar(24));
                System.out.println("" + abb.insertar(23));
                System.out.println("" + abb.insertar(5));
                System.out.println("" + abb.insertar(6));
                String r =  "" +abb.insertar(12);
                System.out.println("" + r);
                abb.buscar(5);
                abb.eliminar(12);
                System.out.println(abb.getRaiz());

            }catch (Exception e) {
                    e.printStackTrace();
            }


    }
    

}