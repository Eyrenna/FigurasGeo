package elipse;

import figuraGeometrica.FiguraGeometrica;

import static java.lang.Math.PI;

public class Elipse extends FiguraGeometrica {

    //Atributos

    private double menor = 0d;
    private double mayor = 0d;


    //Constructor

    public Elipse() {
        super();
    }

    public Elipse(double menor, double mayor) {
        super();
        this.menor = menor;
        this.mayor = mayor;
    }

    public Elipse(String nombre, double menor, double mayor) {
        super(nombre);
        this.menor = menor;
        this.mayor = mayor;
    }


    //Getters

    public double getMenor() {
        return this.menor;
    }

    public double getMayor() {
        return this.mayor;
    }


    //Métodos

    @Override
    public double area() {
        return PI * getMenor() * getMayor();
    }


}
