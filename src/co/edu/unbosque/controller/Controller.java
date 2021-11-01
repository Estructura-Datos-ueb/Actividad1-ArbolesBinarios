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
    private ArbolBinarioBusqueda abb ;
    private PilaVector pila = new PilaVector();

    public Controller (){
        	v = new ViewConsole();
        	start();
    }
    
    public void start() {

        a1 = ArbolBinario.nuevoArbol(null, 1, null);
        a2 = ArbolBinario.nuevoArbol(null,4 , null);
        a = ArbolBinario.nuevoArbol(a1, 5, a2);
        pila.insertar(a);

        try {
          //a1 = abb.insertar(45);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    

}