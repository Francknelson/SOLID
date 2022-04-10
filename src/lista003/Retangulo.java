/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista003;

/**
 *
 * @author franc
 */
public class Retangulo extends FiguraGeometrica{
    
    private float altura;
    private float largura;
    private int quantLados = 4;

    public int getQuantLados() {
        return quantLados;
    }
    
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }
    
    public float calcArea(float altura, float largura){
        return altura * largura;
    }
    
    public float calcPerimetro(float altura, float largura){
        return (altura * 2) + (largura * 2 );
    }
    
}
