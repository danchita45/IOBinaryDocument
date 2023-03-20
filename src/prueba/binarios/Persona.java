/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.binarios;

import java.io.Serializable;

/**
 *
 * @author D45
 */
public class Persona implements Serializable {
    String Nombre;
    int edad;

    public Persona(String Nombre, int edad) {
        this.Nombre = Nombre;
        this.edad = edad;
    }

    public Persona() {
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", edad=" + edad + '}';
    }


    
    
}
