/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista003;

/**
 *
 * @author franc
 */
public class Quadrado extends FiguraGeometrica {
    
    private float tamanhoLados;
    private int quantLados = 4;
        
    public float getTamanhoLados() {
        return tamanhoLados;
    }

    public void setTamanhoLados(float tamanhoLado) {
        this.tamanhoLados = tamanhoLado;
    }
    

    public int getQuantLados() {
        return quantLados;
    }
    
    public float calcArea(float tamLados){
        return tamLados * tamLados;
    }
    
    public float calcPerimetro(float tamLados, int quantDados){
        return tamLados * quantDados;
    }
}
