package co.edu.unbosque.controller;

import co.edu.unbosque.view.ViewConsole;
import co.edu.unbosque.model.Nodo;
import co.edu.unbosque.model.PilaVector;
import co.edu.unbosque.model.ArbolBinario;
import co.edu.unbosque.model.ArbolBinarioBusqueda;

import java.lang.invoke.SwitchPoint;

public class Controller {

    private ViewConsole v;
    private Nodo a,a1,a2 ;
    private ArbolBinario arbol ;
    private ArbolBinarioBusqueda abb = new ArbolBinarioBusqueda() ;
    private PilaVector pila = new PilaVector();
    private int caso;

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
                 abb.insertar(10);
                 abb.insertar(24);
                 abb.insertar(23);
                 abb.insertar(5);
                 abb.insertar(6);
                String r =  "" +abb.insertar(12);
                System.out.println("" + r);
                System.out.println(abb.buscar(234));
                abb.eliminar(24);
                System.out.println(abb.getRaiz());

                v.mostrarInformacion("binvenidos");
                String[] opciones = {"Agregar elemento", "Eliminar elemento", "Buscar elemento",
                        "Recorrer preorden", "Recorrer inorden", "Recorrer postorden" , "Mostrar arbol abb por consola"};
                String metodo = v.mostrarLista("Seleccione una opcion", opciones);

                switch (metodo){
                    case "Agregar elemento":
                        int numAdd =Integer.parseInt(v.leerDato("Ingrese el dato que desea agregar en el arbol abb"));
                        abb.insertar(numAdd);
                        break;
                    case "Eliminar elemento":
                        int numDel =Integer.parseInt(v.leerDato("Ingrese el dato que desea eliminar en el arbol abb"));
                        abb.eliminar(numDel);
                        break;
                    case "Buscar elemento":
                        int numBusc =Integer.parseInt(v.leerDato("Ingrese el dato que desea buscar en el arbol abb"));
                        if( abb.buscar(numBusc)==null){
                            v.mostrarInformacion("El numero ingresado no se encunetra en el arbol abb");
                        }else{
                            v.mostrarInformacion("El numero ingresado  se encuentra en el arbol abb");
                        }
                        break;
                    case "Recorrer preorden":
                        ArbolBinario.preOrden(abb.getRaiz());
                        v.mostrarInformacion(arbol.getOrden());
                        break;
                    case "Recorrer inorden":
                        ArbolBinario.inOrden(abb.getRaiz());
                        v.mostrarInformacion(arbol.getOrden());
                        break;
                    case "Recorrer postorden":
                        ArbolBinario.postOrden(abb.getRaiz());
                        v.mostrarInformacion(arbol.getOrden());
                        break;
                    case "Mostrar arbol abb por consola":

                        break;
                }

            }catch (Exception e) {
                    e.printStackTrace();
            }


    }


}