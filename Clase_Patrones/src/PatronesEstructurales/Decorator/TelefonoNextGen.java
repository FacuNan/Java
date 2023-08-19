package PatronesEstructurales.Decorator;

public class TelefonoNextGen extends TelefonoDecorator {

    public TelefonoNextGen(Telefono telefono) {
        super(telefono);
    }

    @Override
    public void crearTelefono() {
        super.crearTelefono();
        System.out.println("Tengo 5G");
    }
}
