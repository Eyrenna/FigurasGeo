package circulo;

import figuraGeometrica.FiguraGeometrica;

import static java.lang.Math.PI;

public class Circulo extends FiguraGeometrica {

    //Atributos

    private double radio = 0d;
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
