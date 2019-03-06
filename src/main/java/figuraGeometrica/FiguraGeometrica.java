package figuraGeometrica;

public class FiguraGeometrica {

    //Atributos

    private String nombre = null;

    //Constructor

    public FiguraGeometrica() {
        this.nombre = "desconocido";
    }

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    //Métodos

    public String getNombre(){
        return this.nombre;
    }
    /*Al poner este método común e idéntico en todas sus subclases podemos eliminarla en cada una de ellas*/
}
