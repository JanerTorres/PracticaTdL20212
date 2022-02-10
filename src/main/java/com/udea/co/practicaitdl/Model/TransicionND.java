/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udea.co.practicaitdl.Model;

import java.util.List;

/**
 *
 * @author USUARIO
 */
public class TransicionND {
    
    private Estado actual;
    private List<Estado> siguientes;
    private char simbolo;

    public TransicionND(Estado actual, char simbolo) {
        this.actual = actual;
        this.simbolo = simbolo;
    }
    
    public void addSiguiente(Estado estado){
        this.siguientes.add(estado);
    }
    

    public Estado getActual() {
        return actual;
    }

    public void setActual(Estado actual) {
        this.actual = actual;
    }

    public List<Estado> getSiguientes() {
        return siguientes;
    }

    public void setSiguientes(List<Estado> siguientes) {
        this.siguientes = siguientes;
    }

    public char getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(char simbolo) {
        this.simbolo = simbolo;
    }    
    
    
}
