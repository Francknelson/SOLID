/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista003;

/**
 *
 * @author franc
 */
abstract class FiguraGeometrica {
    
    private boolean poligono;
    private boolean plana;
    private boolean espacial;
    private float perimetro;
    private float area;
    
    public boolean isPoligono() {
        return poligono;
    }

    public void setPoligono(boolean poligono) {
        this.poligono = poligono;
    }

    public boolean isPlana() {
        return plana;
    }

    public void setPlana(boolean plana) {
        this.plana = plana;
    }

    public boolean isEspacial() {
        return espacial;
    }

    public void setEspacial(boolean espacial) {
        this.espacial = espacial;
    }


    public float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }
      public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }
}
