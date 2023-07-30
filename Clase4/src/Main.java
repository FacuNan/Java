import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumaFuncional(5));


    }

    /**Funcion iterativa**/
    public static void suma(int numero){
        int cantidad = 0;

        for(int i = 0; i <= numero; i++){
            cantidad += i;

        }

        System.out.println("La cantidad sumada de forma iterativa es " + cantidad);
    }



    /**funcion recursiva Head Recursiva**/
    public static void headRecursiva(int numero){
        if(numero ==1){
            return ;
        }

       headRecursiva(numero - 1);
        System.out.println(numero);

    }

    /**Funcion tailRecursiva**/
    public static void tailRecursiva(int numero){
        if(numero ==1){
            return;
        }
        System.out.println("El numero es " + numero);
        tailRecursiva(numero - 1);

    }



    /** Funcion suma de forma funcional**/
    public static int sumaFuncional(int numero){
        return IntStream.rangeClosed(0,5).reduce(0, (a,b)-> a +b);
    }



}

