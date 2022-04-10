/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista003;

/**
 *
 * @author franc
 */
public class Lista003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Quadrado quadrado = new Quadrado();
       quadrado.setEspacial(false);
       quadrado.setPlana(true);
       quadrado.setPoligono(true);
       quadrado.setTamanhoLados(4);
       quadrado.setArea(quadrado.calcArea(quadrado.getTamanhoLados()));
       quadrado.setPerimetro(quadrado.calcPerimetro(quadrado.getTamanhoLados(), quadrado.getQuantLados()));
       System.out.println("Area do quadrado eh " + quadrado.getArea() + "cm2");
       System.out.println("Perimetro do quadrado eh " + quadrado.getPerimetro()+ "cm");
       System.out.println("\n");
       
       Circulo circulo = new Circulo();
       circulo.setEspacial(false);
       circulo.setPlana(true);
       circulo.setPoligono(false);
       circulo.setRaio(3);
       
       double area_cirulo = circulo.calcArea(circulo.getRaio());
       float area_circulo_float = (float)area_cirulo;
       circulo.setArea(area_circulo_float);
       
       double perimetro_circulo = circulo.calcPerimetro(circulo.getRaio());
       float primetro_circulo_float = (float)perimetro_circulo;
       circulo.setPerimetro(primetro_circulo_float);
       
       System.out.println("Area do circulo eh " + circulo.getArea() + "cm2");
       System.out.println("Perimetro do quadrado eh " + circulo.getPerimetro()+ "cm");
       System.out.println("\n");
       
       Retangulo retangulo = new Retangulo();
       retangulo.setEspacial(false);
       retangulo.setPoligono(true);
       retangulo.setPlana(true);
       retangulo.setAltura(4);
       retangulo.setLargura(8);
       retangulo.setArea(retangulo.calcArea(retangulo.getAltura(), retangulo.getLargura()));
       retangulo.setPerimetro(retangulo.calcPerimetro(retangulo.getAltura(), retangulo.getLargura()));
       
       System.out.println("Area do retangulo eh " + retangulo.getArea() + "cm2");
       System.out.println("Perimetro do retangulo eh " + retangulo.getPerimetro()+ "cm");
       System.out.println("\n");
       
       Triangulo triangulo = new Triangulo();
       triangulo.setEspacial(false);
       triangulo.setPlana(true);
       triangulo.setPoligono(true);
       triangulo.setBase(5);
       triangulo.setLado1(5);
       triangulo.setLado2(5);
       
       double area_triangulo = triangulo.calcArea(triangulo.getBase(), triangulo.getLado1(), triangulo.getLado2());
       float area_triangulo_float = (float)area_triangulo;
       triangulo.setArea(area_triangulo_float);
       
       triangulo.setPerimetro(triangulo.calcPerimetro(triangulo.getBase(), triangulo.getLado1(), triangulo.getLado2()));
       
       System.out.println("Area do triangulo eh " + triangulo.getArea() + "cm2");
       System.out.println("Perimetro do retangulo eh " + triangulo.getPerimetro()+ "cm");
       System.out.println("\n");
       
       Cubo cubo = new Cubo();
       cubo.setEspacial(true);
       cubo.setPlana(false);
       cubo.setPoligono(true);
       cubo.setTamAresta(4);
       
       cubo.setArea(cubo.calcArea(cubo.getTamAresta()));
       
       cubo.setPerimetro(cubo.calcPerimetro(cubo.getTamAresta()));
       
       cubo.setVolume(cubo.calcVolume(cubo.getTamAresta()));
       
       System.out.println("Area do cubo eh " + cubo.getArea() + "cm3");
       System.out.println("Perimetro do cubo eh " + cubo.getPerimetro()+ "cm");
       System.out.println("Volume do cubo eh " + cubo.getVolume()+ "cm");
       System.out.println("\n");
    }
    
}
