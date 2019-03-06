package cuadrado;

public class Cuadrado {

    //Atributos

    private double lado = 0d;
    private String nombre = null;


    //Constructor

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public Cuadrado(String nombre, double lado) {
        this.nombre = nombre;
        this.lado = lado;
    }


    //Geters

    public double getLado() {
        return this.lado;
    }

    public String getNombre() {
        return this.nombre;
    }


    //Métodos

    public double area() {
        return Math.pow(getLado(), 2);
    }


}
