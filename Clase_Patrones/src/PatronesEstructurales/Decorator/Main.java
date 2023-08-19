package PatronesEstructurales.Decorator;

public class Main {
    public static void main(String[] args) {
        TelefonoInteligente telefonoInteligente = new TelefonoInteligente(new TelefonoBasico());

        telefonoInteligente.crearTelefono();

    }
}
