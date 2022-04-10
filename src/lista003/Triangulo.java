/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista003;

/**
 *
 * @author franc
 */
public class Triangulo extends FiguraGeometrica{
    
    private int quantLados = 3;
    private float base;
    private float lado1;
    private float lado2;

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }
    
    public boolean isEquilatero(float base, float lado1, float lado2){
        if (base == lado1 && base == lado2 && lado1 == lado2){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean isEscaleno(float base, float lado1, float lado2){
        if (base != lado1 && lado1 != lado2){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean isIsosceles(float base, float lado1, float lado2){
        if(lado1 == lado2 && lado1 != base && lado2 != base){
            return true;
        }
        else if(base == lado1 && lado1 != lado2 && base != lado2){
            return true;
        }
        else if (base == lado2 && lado1 != lado2 && base != lado1){
            return true;
        }
        else{
            return false;
        }
    }
    
    public float calcPerimetro(float base, float lado1, float lado2){
        return (base + lado1 + lado2) / 2;
    }
    
    public double calcArea(float base, float lado1, float lado2){
        float perimetro = calcPerimetro(base, lado1, lado2);
        
        return Math.sqrt(perimetro * (perimetro - lado1) * (perimetro - lado2) * (perimetro - base));
    }
    
}
