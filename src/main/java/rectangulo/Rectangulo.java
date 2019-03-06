package rectangulo;

import figuraGeometrica.FiguraGeometrica;

public class Rectangulo extends FiguraGeometrica {

    //Atributos

    private double menor = 0d;
    private double mayor = 0d;
    private String nombre = null;


    //Constructor

    public Rectangulo() {
        super();
    }

    public Rectangulo(double menor, double mayor) {
        super();
        this.menor = menor;
        this.mayor = mayor;
    }

    public Rectangulo(String nombre, double menor, double mayor){
        super(nombre);
        this.menor = menor;
        this.mayor = mayor;
    }


    //Geters

    public double getMenor() {
        return this.menor;
    }

    public double getMayor() {
        return this.mayor;
    }


    //Métodos

    public double area() {
        return getMenor() * getMayor();
    }


}
