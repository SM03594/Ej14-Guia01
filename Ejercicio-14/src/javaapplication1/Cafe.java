/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Alumno
 */

//enum Textura { ESPUMOSA, NORMAL, LIQUIDA }

public class Cafe {
    private String nombre;
    private int leche;
    private Textura textura;
    private int tempAgua;
    

    
    public Cafe(String nombre, int leche, Textura textura, int tempAgua) {
        this.nombre = nombre;
        this.textura = textura;
        this.tempAgua = tempAgua;
        
        if(leche < 0) {
            this.leche = 0;
        } else {
            this.leche = leche;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getLeche() {
        return leche;
    }

    public Textura getTextura() {
        return textura;
    }

    public int getTempAgua() {
        return tempAgua;
    }
    
}
