package PatronesEstructurales.Decorator;

public class TelefonoInteligente extends TelefonoDecorator{

    public TelefonoInteligente(Telefono telefono) {
        super(telefono);
    }

    @Override
    public void crearTelefono() {
        super.crearTelefono();
        System.out.println("Tengo 4g");
    }
}
