package cuadrado;

public class Cuadrado {
    //Atributos
    private double lado = 0d;

    //Constructor

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    //Geters
    public double getLado() {
        return this.lado;
    }

    //Métodos
    public double area() {
        return Math.pow(getLado(), 2);
    }
}
