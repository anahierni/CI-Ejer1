/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/**Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
 *
 * @author Usuario
 */
public class rectanguloServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Rectangulo crearRectangulo(  ){
        System.out.println("Ingrese la medida de la base del rectángulo");
        double b=leer.nextInt();
        System.out.println("Ingrese la medida de la altura del rectángulo");
        double h=leer.nextInt();
        return new Rectangulo(b,h);
    }
    
    public double perimetro(Rectangulo r){
        return 2*r.getAltura()+2*r.getBase();
    }
    
     public double area(Rectangulo r){
        return r.getAltura()*r.getBase();
    }
     
    public void dibujar(Rectangulo r){
        
        for (int i = 1; i <= r.getAltura(); i++) {
             for (int j = 1; j <= r.getBase(); j++) {
                 if ((i==1) || (i==r.getAltura()) || (j==1) || (j==r.getBase())) {
                    System.out.print("*");
                }else{
                     System.out.print(" ");
                }
                
            }
             System.out.println("");
        }
    }
}
