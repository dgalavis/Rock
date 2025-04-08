/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.rock;

import core.persona.Artista;
import core.persona.Locutor;
import java.util.ArrayList;

/**
 *
 * @author galav
 */
public class Programa {
    private String nombre;
    private int serial;
    private ArrayList <Emision> emisiones;
    private ArrayList <Locutor> locutores;

    public Programa(String nombre, Locutor locutor) {
        this.nombre = nombre;
        this.serial =0;
        this.locutores = locutores;
        this.emisiones = new ArrayList<>();
       
    }
    public Emision getLastEmision() {
        return this.emisiones.get(this.emisiones.size()-1);
    }
    

 
}
