import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {
        Funcionales funcionales = new Funcionales();
        Forfuncional forfuncional = new Forfuncional();


        /**For Funcional**/

        forfuncional.nombres.add("Facundo");
        forfuncional.nombres.add("Nancy");
        forfuncional.nombres.add("Paco");
        forfuncional.nombres.stream().forEach(x -> System.out.println(x));

        /**Funcion Stream**/

        Stream<String> valores = forfuncional.nombres.stream().map(x -> x.toUpperCase());

        valores.forEach(x -> System.out.println(x));

        /**Conversion de entero en Stream**/

        int[] numeros = {1,2,3,4,5,6};

        var resultado = Arrays.stream(numeros);

        resultado.forEach(x -> System.out.println(x));

        /**Suma de valores dentro del array **/

        var stInt = Arrays.stream(numeros);

        var result = stInt.filter(x -> x % 2 ==0).reduce(0, (x, y)->{
            System.out.println("X tiene el valor "  + x + " Y tiene el valor " + y);
            return x + y;
        } );


        System.out.println("El valor total es "+ result);



    }


}