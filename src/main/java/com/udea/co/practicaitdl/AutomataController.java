/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udea.co.practicaitdl;

import com.udea.co.practicaitdl.Model.Estado;
import com.udea.co.practicaitdl.Model.Transicion;
import com.udea.co.practicaitdl.View.VistaPpal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author naides
 */
public class AutomataController {
    
    
    
    public static List<Transicion> reconocer (char [] entrada){
        
        List<Transicion> ruta = new ArrayList<>();
        Estado actual = VistaPpal.automata.getEstadoInicial();
        
        for (int i = 0; i < entrada.length; i++) {
            for (Transicion t: actual.transiciones) {
      
                if (entrada[i] == t.getSimbolo()) {
                    
                    actual = t.getSiguiente();
                    ruta.add(t);
                    
                }
            } 
        } 
        
        return ruta;
    }
    
}
