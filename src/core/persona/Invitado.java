/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.persona;

import core.rock.Emision;
import java.util.ArrayList;

/**
 *
 * @author galav
 */
public class Invitado extends Persona{
    private ArrayList<Emision> emisiones;

    public Invitado(String nombre) {
        super(nombre);
        this.emisiones= new ArrayList<>();
        
    }
}
