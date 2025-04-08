/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.persona;

import java.util.ArrayList;

/**
 *
 * @author galav
 */
public class Artista extends Persona {
    private ArrayList<Artista> artistas;

    public Artista(String nombre) {
        super(nombre);
    }

    public String getNombre() {
        return nombre;
    }
}
