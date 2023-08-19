package PatronesEstructurales.Adapter.EjercicioAdapter;

public class Main {
    public static void main(String[] args) {
        CocheAdapter cocheIngles = new CocheAdapter();

        enciende(cocheIngles);
        System.out.println(estaEncendido(cocheIngles));
    }

    public static void enciende(CocheEspañol cocheEspañol){
        cocheEspañol.enciende();
    }

    public static void apaga(CocheEspañol cocheespañol){
        cocheespañol.apaga();
    }

    public static boolean estaEncendido(CocheEspañol cocheEspañol){
        return cocheEspañol.estaEncendido();
    }
}
