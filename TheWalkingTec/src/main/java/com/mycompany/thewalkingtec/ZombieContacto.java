/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thewalkingtec;

/**
 *
 * @author Alina
 */
public class ZombieContacto extends Zombies{
    
    

    @Override
    public boolean puedeAtacar(Defensa objetivoActual) {
        // Solo puede atacar si está en la misma casilla
        return getFila() == objetivoActual.getFila() && getColumna() == objetivoActual.getColumna();
    }

    @Override
    public void atacar(Defensa objetivoAAtacar) {
        if (objetivoAAtacar != null) {
            objetivoAAtacar.recibirAtaque(getDanoPorSegundo());
        }
    }
    
}
