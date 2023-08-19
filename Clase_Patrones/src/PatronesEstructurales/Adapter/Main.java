package PatronesEstructurales.Adapter;

public class Main {
    public static void main(String[] args) {
        /**PowerAdapter ya trabaja con la clase LightBuilb**/
        PowerAdapter lightBuilb = new PowerAdapter();

        enciende(lightBuilb);
        estaEncendido(lightBuilb);
        apaga(lightBuilb);
        estaEncendido(lightBuilb);

    }

    /**Secrean las funciones con la interface como parametro**/

    public static void enciende(Encufable enchufable){
        enchufable.enciende();

    }

    public static void apaga(Encufable enchufable){
        enchufable.apaga();
    }

    public static boolean estaEncendido(Encufable enchufable){
        return enchufable.encendido();
    }
}
