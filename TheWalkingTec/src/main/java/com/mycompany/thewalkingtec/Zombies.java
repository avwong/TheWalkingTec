/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thewalkingtec;

/**
 *
 * @author Alina
 */
public abstract class Zombies extends Tropa{
    
    private int velocidad; //velocidad a la que se mueve
    private Defensa objetivoActual; //el objetivo más cercano para atacar
    
    
    @Override
    public void run() {
        while (getVida() > 0) {
            
            //paso x paso de como atacan los zombies
            
            buscarObjetivo();  // buscar defensa cercana
            moverHaciaObjetivo();
            
            if (objetivoActual != null && puedeAtacar(objetivoActual)) {
                atacar(objetivoActual);
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }

    
    
    public void buscarObjetivo(){
        objetivoActual = null; //resetear el objetivo mas cercano
        
        
        

    }
    
    public void moverHaciaObjetivo(){
        
        int tamañoCasilla = 20; //20px
        int x = getColumna() * tamañoCasilla;
        int y = getFila() * tamañoCasilla;

        if (getColumna() < objetivoActual.getColumna()) {
            setColumna(getColumna() + 1);
        } else if (getColumna() > objetivoActual.getColumna()) {
            setColumna(getColumna() - 1);
        }

        if (getFila() < objetivoActual.getFila()) {
            setFila(getFila() + 1);
        } else if (getFila() > objetivoActual.getFila()) {
            setFila(getFila() - 1);
        }

        
    }
    
    public abstract boolean puedeAtacar(Defensa objetivoActual); //según su tipo y rango

    
    //GETTERS
    public int getVelocidad() {
        return velocidad;
    }

    public Defensa getObjetivoActual() {
        return objetivoActual;
    }
    
    
    
    
}
