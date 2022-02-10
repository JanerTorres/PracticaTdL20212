/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.udea.co.practicaitdl.Model;

/**
 *
 * @author USUARIO
 */
public class TransicionD {
    
    private Estado actual;
    private Estado siguiente;
    private char simbolo;

    public TransicionD(Estado actual, Estado siguiente, char simbolo) {
        this.actual = actual;
        this.siguiente = siguiente;
        this.simbolo = simbolo;
    }

    public char getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(char simbolo) {
        this.simbolo = simbolo;
    }

    public Estado getActual() {
        return actual;
    }

    public void setActual(Estado actual) {
        this.actual = actual;
    }

    public Estado getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Estado siguiente) {
        this.siguiente = siguiente;
    }

    
    
    
}
