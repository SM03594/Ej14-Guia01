/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Alumno
 */
public class ModuloLeche {
    private int cantidad;
    private Textura textura;
    private final int capacidadLiquido = 5;

    public ModuloLeche() {
        this.cantidad = 0;
        this.textura = Textura.LIQUIDA;
    }

    private void cambiarTextura(Textura textura) {
        this.textura = textura;
    }
    
    public void cargarLeche(int cantidad) {
        if(cantidad > 0) {
            int nuevaCant = this.cantidad + cantidad;
            
            if(nuevaCant <= this.capacidadLiquido) {
                this.cantidad = nuevaCant;
            } else {
                this.cantidad = this.capacidadLiquido;
            }

            System.out.println("Leche cargada, cantidad de leche actual: " + this.cantidad + "\n");
        } else {
            System.out.println("Error: cantidad de leche invalida");
        }
        
    }
    
    public boolean darLeche(int cantidad, Textura textura) {
        boolean operacionExito = false;
        
        if(this.cantidad >= cantidad) {
            this.cantidad -= cantidad;
            if(this.textura != textura) {
                cambiarTextura(textura);
            }
            operacionExito = true;
        } 
        
        return operacionExito;
    }

}


