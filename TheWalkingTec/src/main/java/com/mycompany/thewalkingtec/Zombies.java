/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thewalkingtec;

/**
 *
 * @author Alina
 */
public abstract class Zombies {
    
    private int velocidad; //velocidad a la que se mueve
    private Defensa objetivoActual; //el objetivo más cercano para atacar
    
    public void moverse(){
        
    }
    
    public void buscarObjetivo(){
        objetivoActual = null; //resetear el objetivo mas cercano
        
    }
    
}
