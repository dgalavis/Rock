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
        this.locutores = new ArrayList<>();
        this.emisiones = new ArrayList<>();
        // Relación bidireccional: un Programa puede tener muchos Locutores y un Locutor puede estar en varios Programas.
        // Aunque la multiplicidad permite que un Locutor tenga de 0 a muchos Programas, al agregarlo aquí al Programa,
        // también lo agregamos a la lista del Locutor para mantener sincronizada la relación desde un solo punto.
        this.locutores.add(locutor); //Por la multipliciadd entre programa y locutor
        locutor.addPrograma(this);
       
    }
     public boolean addEmision(Emision emision){
        if (!this.emisiones.contains (emision)){
            this.emisiones.add(emision);
            return true;
        }
        return false;
    }
    public Emision getLastEmision() {
        return this.emisiones.get(this.emisiones.size()-1);
    }
    
     public String getNombre() {
        return nombre;
    }
    public int getFrecuenciaCanciones(Artista artista) {
        int frecuencia = 0;
        for (Emision emision : this.emisiones) {
            frecuencia += emision.getCantidadCanciones(artista);
        }
        return frecuencia;
    }

 
}
