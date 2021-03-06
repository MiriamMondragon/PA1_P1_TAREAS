/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.uth.pa1.parcial1.tarea1.app;

import hn.uth.pa1.parcial1.tarea1.app.objetos.OperacionMiriamMondragon;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Miriam
 */
public class operacionControllerMiriamMondragon {
    private static List<OperacionMiriamMondragon> listaOperaciones = new ArrayList<>();
    
    public static void agregarOperacionLista(OperacionMiriamMondragon operacion){
        listaOperaciones.add(operacion);
    }
    
    public static Object[][] getListaOperacionesComoArreglo(){
        Object arreglo[][] = new Object[listaOperaciones.size()][3];
        
        int indice = listaOperaciones.size() - 1;
        for (OperacionMiriamMondragon operacionTmp : listaOperaciones) {
            String formula = "";
            if(operacionTmp.getNumero2() <0){
                formula = operacionTmp.getNumero1() + operacionTmp.getSignoOperacion() + " (" + operacionTmp.getNumero2() + ")";
            }else {
                formula = operacionTmp.getNumero1() + operacionTmp.getSignoOperacion() + operacionTmp.getNumero2();
            }
            String signoResultado = "";
            if(operacionTmp.getResultado() >= 0){
                signoResultado = "Positivo";
            }else{
                signoResultado = "Negativo";
            }
            arreglo[indice][0] = formula;
            arreglo[indice][1] = operacionTmp.getResultado();
            arreglo[indice][2] = signoResultado;
            indice--;
        }
        return arreglo;
    }
    
    public static int tamanoLista(){
        return listaOperaciones.size();
    }
    
    public static void borrarOperacion(int fila){
        if(fila >= 0){
            listaOperaciones.remove(listaOperaciones.size()-(fila+1));
        }
    }
    
    public static void reescribirOperacion(int fila, OperacionMiriamMondragon nuevaOperacion){
        if(fila >= 0){
            listaOperaciones.set(listaOperaciones.size()-(fila+1), nuevaOperacion);
        }
    }
    
}
