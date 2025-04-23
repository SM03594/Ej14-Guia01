/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Alumno
 */
public class Ej_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MaquinaDeCafe maquina = new MaquinaDeCafe();
        maquina.cargarLeche(5);
        
        Cafe latte = new Cafe("latte", 2, Textura.ESPUMOSA, 70);
        Cafe expresso = new Cafe("expresso", 0, Textura.ESPUMOSA, 70);
        Cafe lagrima = new Cafe("lagrima", 3, Textura.LIQUIDA, 70);
       
        maquina.onOff();
        
        maquina.servirCafe(latte);
        maquina.servirCafe(latte);
        maquina.servirCafe(expresso);
        maquina.servirCafe(lagrima);
        
        maquina.cargarLeche(3);
        
        maquina.servirCafe(lagrima);

        maquina.onOff();

    }
    
}
