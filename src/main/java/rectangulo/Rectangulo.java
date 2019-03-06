package rectangulo;

public class Rectangulo {

    //Atributos

    private double menor = 0d;
    private double mayor = 0d;
    private String nombre = null;


    //Constructor

    public Rectangulo(double menor, double mayor) {
        this.menor = menor;
        this.mayor = mayor;
    }

    public Rectangulo(String nombre, double menor, double mayor){
        this.nombre = nombre;
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

    public String getNombre() {
        return this.nombre;
    }


    //Métodos

    public double area() {
        return getMenor() * getMayor();
    }


}
