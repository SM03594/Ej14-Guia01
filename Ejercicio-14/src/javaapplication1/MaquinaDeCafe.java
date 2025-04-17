/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Alumno
 */
public class MaquinaDeCafe {
    private boolean encendida;
    private ModuloAgua agua;
    private ModuloLeche leche;

    public MaquinaDeCafe() {
        this.encendida = false;
        this.agua = new ModuloAgua();
        this.leche = new ModuloLeche();
    }
    
    public void cargarLeche(int cantidad) {
        if(cantidad > 0) {
            leche.cargarLeche(cantidad);
        }
    }
    
    
    public void servirCafe(Cafe cafe){
       
        if(this.encendida == true) {
            int cantLeche = cafe.getLeche();
            Textura textura = cafe.getTextura();
            int tempAgua = cafe.getTempAgua();

            if(leche.darLeche(cantLeche, textura)) {

                if(agua.getTemperatura() != tempAgua) {
                    agua.setTemperatura(tempAgua);
                }

                String nombre = cafe.getNombre();

                System.out.println("El café " + nombre + " se ha servido correctamente.\n");

            } else {
                System.out.println("ERROR: no hay sufuciente leche.\n");
            } 
        } else {
            System.out.println("ERROR: la maquina esta apagada\n");
        }
        
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }
    
    
    
}
