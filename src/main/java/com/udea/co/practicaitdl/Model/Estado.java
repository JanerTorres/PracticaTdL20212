/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udea.co.practicaitdl.Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class Estado {
    
    private String nombre;
    private boolean aceptacion;
    public List<Transicion> transiciones = new ArrayList<>();

    public Estado(String valor, boolean aceptacion) {
        this.nombre = valor;
        this.aceptacion = aceptacion;
    }

    public boolean isAceptacion() {
        return aceptacion;
    }

    public void setAceptacion(boolean aceptacion) {
        this.aceptacion = aceptacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarTransicion(Transicion entrada){
        transiciones.add(entrada);
    }
    
    
    
}
