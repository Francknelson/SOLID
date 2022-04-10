/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista003;

/**
 *
 * @author franc
 */
public class Circulo extends FiguraGeometrica {
    
   private double raio;
     
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
     
    public double calcArea(double raio){
        return 3.14 * (raio * raio);
    }
    
    public double calcPerimetro(double raio){
        return 2 * 3.14 * raio;
    }
}
