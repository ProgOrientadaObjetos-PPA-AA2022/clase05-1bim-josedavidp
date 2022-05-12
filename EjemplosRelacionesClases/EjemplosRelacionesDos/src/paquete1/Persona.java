/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Persona {

    private String nombre;
    private String cedula;
    private Barrio barrio;

    public Persona(String n, String ced, Barrio b) {
        nombre = n;
        cedula = ced;
        barrio = b;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerCedula(String n) {
        cedula = n;
    }

    public void establecerBarrio(Barrio n) {
        barrio = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public Barrio obtenerBarrio() {
        return barrio;
    }

    @Override
    public String toString() {
        String g = String.format("La persona con los datos: %s(%s)\n"
                + "pertenece al barrio: %s\n", nombre, cedula, obtenerBarrio().obtenerNombre());
        return g;

    }
}
