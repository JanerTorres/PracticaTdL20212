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
public class Automata {
    
    private List<Character> simbolosEntrada;
    private List<Estado> estados;
    private Estado estadoInicial; // Se guarda únicamente la posición del estado inicial de la lista de estados que ya fueron definidos
    private List<TransicionD> transiciones;
    private boolean esDeterministico;

    public Automata(List<Character> simbolosEntrada, List<Estado> estados, Estado estadoInicial, List<TransicionD> transiciones, boolean esDeterministico) {
        this.simbolosEntrada = simbolosEntrada;
        this.estados = estados;
        this.estadoInicial = estadoInicial;
        this.transiciones = transiciones;
        this.esDeterministico = esDeterministico;
    }

    public Automata() {
        this.esDeterministico = true;
        this.simbolosEntrada = new ArrayList<Character>();
        this.estados = new ArrayList<Estado>();
        this.transiciones = new ArrayList<TransicionD>();
    }
    
    // LA IDEA ES QUE CUANDO SE CREE EL AUTOMATA, SEA VACIÓ. Y POR DEFECTO SERÁ DETERMINISTICO, MIENTRAS NO SE CAMBIE
    // A MEDIDA SE VAYAN LEYENDO LOS VALORES DE LOS SIMBOLOS Y ESTADOS, ESTOS SE IRÁN AGREGANDO A SUS RESPECTIVAS LISTAS
    
    public void agregarSimbolo(Character simbolo){
        simbolosEntrada.add(simbolo);
    }
    
    public void agregarEstado(String valorEstado, boolean esAceptacion){
        Estado estado = new Estado(valorEstado, esAceptacion);
        this.estados.add(estado);
    }
    
    // Cuando se vayan a agregar las transiciones, la idea es que se recorra la lista de los estados
    // con el fin de extraer los datos más facilmente.
    public void agregarTransicion(Estado actual, Estado siguiente, Character simbolo){
        transiciones.add(new TransicionD(actual, siguiente, simbolo));
    }
    
    

    public boolean isEsDeterministico() {
        return esDeterministico;
    }

    public void setEsDeterministico(boolean esDeterministico) {
        this.esDeterministico = esDeterministico;
    }

    public List<Character> getSimbolosEntrada() {
        return simbolosEntrada;
    }

    public void setSimbolosEntrada(List<Character> simbolosEntrada) {
        this.simbolosEntrada = simbolosEntrada;
    }

    public List<Estado> getEstados() {
        return estados;
    }

    public void setEstados(List<Estado> estados) {
        this.estados = estados;
    }

    public Estado getEstadoInicial() {
        return estadoInicial;
    }

    public void setEstadoInicial(Estado estadoInicial) {
        this.estadoInicial = estadoInicial;
    }

    public List<TransicionD> getTransiciones() {
        return transiciones;
    }

    public void setTransiciones(List<TransicionD> transiciones) {
        this.transiciones = transiciones;
    }

    
}
