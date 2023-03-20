/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.binarios;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author D45
 */
public class PruebaBinarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Persona persona = new Persona();
        persona.setNombre("Daniel");
        persona.setEdad(23);

        File archivo = new File("Persona.dat");
        try {
            FileOutputStream fos = new FileOutputStream(archivo, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(persona);
            oos.close();
            fos.close();
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois;
            while (fis.available()>0) {  
                ois = new ObjectInputStream(fis);
                Persona np = (Persona) ois.readObject();
                System.out.println(np);
            }
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }

    }

}
