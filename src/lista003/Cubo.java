/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista003;

/**
 *
 * @author franc
 */
public class Cubo extends FiguraGeometrica{
    
    private float volume;
    private int quantArestas = 12;
    private float tamAresta;

    public float getTamAresta() {
        return tamAresta;
    }

    public void setTamAresta(float tamAresta) {
        this.tamAresta = tamAresta;
    }

    public int getQuantArestas() {
        return quantArestas;
    }
    
    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }
    
    public float calcVolume(float tamAresta){
        return tamAresta * tamAresta * tamAresta;
    }
    
    public float calcArea(float tamAresta){
        return 6 * (tamAresta * tamAresta);
    }
    
    public float calcPerimetro(float tamAresta){
        return 12 * tamAresta;
    }
    
}
