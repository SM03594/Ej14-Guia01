/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Alumno
 */
public class ModuloAgua {
    private int temperatura;

    public ModuloAgua() {
        this.temperatura = 16; //temperatura ambiente
    }

    private void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }
    
    public void servirAgua(int temp) {
        if(temp != this.temperatura) {
            this.setTemperatura(temp);
        }
    }
    
    
}
