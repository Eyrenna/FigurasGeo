package cuadrado;

import figuraGeometrica.FiguraGeometrica;

public class Cuadrado extends FiguraGeometrica {

    //Atributos

    private double lado = 0d;


    //Constructor

    public Cuadrado() {
        super();
    }

    public Cuadrado(double lado) {
        super();
        this.lado = lado;
    }

    public Cuadrado(String nombre, double lado) {
        super(nombre);
        this.lado = lado;
    }


    //Geters

    public double getLado() {
        return this.lado;
    }


    //Métodos

    @Override
    public double area() {
        return Math.pow(getLado(), 2);
    }


}
