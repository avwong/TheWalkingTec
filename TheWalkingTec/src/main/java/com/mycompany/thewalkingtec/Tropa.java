/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thewalkingtec;

import javax.swing.ImageIcon;

/**
 *
 * @author Alina
 */
public abstract class Tropa extends Thread{
    
    private String nombre;
    private ImageIcon apariencia;
    private int vida;
    private int danoPorSegundo;
    private int nivel = 0;
    private int alcance;
    private int nivelDeAparicion;
    private int fila, columna; //posicion
    //TODO: private Pantalla refPantalla;
    
    public abstract void atacar(Defensa objetivoAAtacar);
    
    public int recibirAtaque(int danoPorSegundo){
        if (vida <= 0) return -1;
        
        vida -= danoPorSegundo;
        
        if (vida <= 0){
            morir();
        }
        
        return vida;
    }
    
    public void subirNivel(){
        this.nivel += 1; 
    }
    
    public void morir(){
        if (vida <= 0) {
            //TODO
            //detenerlo
            //this.setStop();
            vida = 0;
            //ponerle imagen de RIP
            //refPantalla.pintarTropa(refLabel);
        }
    }
    
    
    //GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }

    public ImageIcon getApariencia() {
        return apariencia;
    }

    public int getVida() {
        return vida;
    }

    public int getDanoPorSegundo() {
        return danoPorSegundo;
    }

    public int getNivel() {
        return nivel;
    }

    public int getAlcance() {
        return alcance;
    }

    public int getNivelDeAparicion() {
        return nivelDeAparicion;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }
    
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApariencia(ImageIcon apariencia) {
        this.apariencia = apariencia;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setDanoPorSegundo(int danoPorSegundo) {
        this.danoPorSegundo = danoPorSegundo;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    public void setNivelDeAparicion(int nivelDeAparicion) {
        this.nivelDeAparicion = nivelDeAparicion;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
    

}
