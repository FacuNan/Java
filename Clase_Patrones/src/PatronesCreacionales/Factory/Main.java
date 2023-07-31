package PatronesCreacionales.Factory;

public class Main {
    public static void main(String[] args) {
        PrecioFactory preciofactory = new PrecioFactory("España");
        System.out.println(preciofactory.getPrecios());

    }
}
