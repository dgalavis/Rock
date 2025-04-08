/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.rock;

import core.persona.Artista;
import core.persona.Invitado;
import java.util.ArrayList;

/**
 *
 * @author galav
 */
public class Emision {
    private int serial;
    private ArrayList <Cancion> canciones;
    private ArrayList <Invitado> invitados;
    Programa programa;

    public Emision(Programa programa) {
        this.programa = programa;
        this.programa.addEmision(this);
        this.canciones = new ArrayList <>();
        this.invitados= new ArrayList <>();
        

    }
    public boolean addCancion(Cancion cancion) {
        if (!this.canciones.contains (cancion)){
            this.canciones.add(cancion);
         return true;
        }
        return false;
         
    }
    
    public int getCantidadCanciones(Artista artista) {
        int numCanciones = 0;
        for (Cancion cancion : this.canciones) {
            if (cancion.getArtista().equals(artista)) {
                numCanciones++;
            }
        }
        return numCanciones;
    }
    
}
