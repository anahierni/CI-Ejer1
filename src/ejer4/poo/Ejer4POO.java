/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer4.poo;

import Entidad.Rectangulo;
import Servicio.rectanguloServicio;

/**
 *
 * @author Usuario
 */
public class Ejer4POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        rectanguloServicio rs=new rectanguloServicio();
        Rectangulo r;
        r=rs.crearRectangulo();
        System.out.println("El perimetro es "+rs.perimetro(r)+" y su área es "+rs.area(r));
        rs.dibujar(r);
    }
    
}
