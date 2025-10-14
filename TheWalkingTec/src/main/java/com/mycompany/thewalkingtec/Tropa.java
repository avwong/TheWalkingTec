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
public abstract class Tropa {
    
    private String nombre;
    private ImageIcon apariencia;
    private int vida;
    private int danoPorSegundo;
    private int nivel = 1;
    private int alcance;
    private int nivelDeAparicion;
    //TODO: private Pantalla refPantalla;
    
    public abstract void atacar(Defensa objetivoAAtacar);
    
    public abstract void recibirAtaque(int danoPorSegundo);
    
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
    
    
}
