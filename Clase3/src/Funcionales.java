import java.util.function.Function;

public class Funcionales {
    /*La programacioon funcional consiste en intentar de reducir lineas de coidigo*/
    /** Ejemplos de programacion funcional de alto nivel**/


    /**retorna una funcion**/
    private Function<String, String> toMayus = x -> x.toUpperCase();

    public void prueba(){
        saluda(toMayus, "Facundo");
    }
/** Invoca una funcion como parametro**/
    public void saluda(Function<String, String> mifuncion, String nombre){
        System.out.println(mifuncion.apply(nombre));
    }
}
