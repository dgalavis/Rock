/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.rock;

import core.persona.Artista;
import core.persona.Invitado;
import core.persona.Locutor;
import java.util.ArrayList;

/**
 *
 * @author galav
 */
public class RockRollRadio {
    private ArrayList <Artista> artistas;
    private ArrayList <Cancion> canciones;
    private ArrayList <Invitado> invitados;
    private ArrayList <Locutor> locutores;
    private ArrayList <Programa> programas;

    public void addLocutor(Locutor locutor) {
        this.locutores.add(locutor);
    }
    
}
