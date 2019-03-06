package circulo;

import figuraGeometrica.FiguraGeometrica;

public class Circulo extends FiguraGeometrica {

    //Atributos

    private double radio = 0d;
    private String nombre = null;
    private final double PI = Math.PI;
    /*final porque el atributo no va a cambiar*/


    //Constructor

    public Circulo() {
        super();
    }

    public Circulo(double radio) {
        super();
        this.radio = radio;
    }

    public Circulo (String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }


    //Geters

    public double getRadio() {
        return this.radio;
    }


    //Métodos

    @Override
    public double area() {
        return PI * Math.pow(this.radio, 2);
        /*math.pow(numero, potencia) = elevar un número a una potencia*/
    }


}
