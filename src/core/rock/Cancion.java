/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.rock;

import core.persona.Artista;

/**
 *
 * @author galav
 */
public class Cancion {
    private String nombre;
    Artista artista;
    Genero genero;

    public Cancion(String nombre, Artista artista, Genero genero) {
        this.nombre = nombre;
        this.artista = artista;
        this.genero = genero;
    }

    public Artista getArtista() {
        return artista;
    }

    
    
           
}
