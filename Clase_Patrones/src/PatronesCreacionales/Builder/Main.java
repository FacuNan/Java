package PatronesCreacionales.Builder;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new CocheBuilder("Fireston").setPuertas(4).build();
        System.out.println(vehiculo.getPuertas());
        System.out.println(vehiculo.getMarca());

        Vehiculo vehiculo2 = new CocheBuilder("Ferrari").setPuertas(4).build();

        System.out.println(vehiculo2.getMarca());
        System.out.println(vehiculo2.getPuertas());
    }
}
