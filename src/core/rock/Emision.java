/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.rock;

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
    }
    
}
