package PatronesEstructurales.Decorator;

import PatronesEstructurales.Decorator.Telefono;

public class TelefonoDecorator implements Telefono {
    Telefono telefono;

    public TelefonoDecorator(Telefono telefono) {
        this.telefono = telefono;
    }

    @Override
    public void crearTelefono() {
        this.telefono.crearTelefono();
    }
}
