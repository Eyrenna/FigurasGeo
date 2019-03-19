package draw;

public interface Drawable {

    void draw();

    default void applyTheme(){
        throw new UnsupportedOperationException("Operacion applyTheme sin implementar");
    }/*Indicaba error porque esto no existía hasta java8; por lo qu hay que indicarle que es java8*/

}
/*Por defecto todos los métodos de una interfaz son publicos y abstractos; puede contener métodos estáticos.
Las interfaces se implementan -- es decir que tiene que contener las
El método abstracto tienes obligación de decirle a todas las clases que implementen esta interfaz cómo se comportará
este método en caso específico. Si no se implementa salta Error.
El método default si no especificas en alguna de las clases que implementan la interfaz un comportamiento diferente del
que está descrito en la interfaz se aplica 'por defecto' lo descrito en la interfaz.
 */