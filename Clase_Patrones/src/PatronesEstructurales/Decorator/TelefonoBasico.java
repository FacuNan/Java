package PatronesEstructurales.Decorator;

import PatronesEstructurales.Decorator.Telefono;

public class TelefonoBasico implements Telefono {
    @Override
    public void crearTelefono() {
        tengoSMS();
        tengoGMS();
    }

    public void tengoGMS(){
        System.out.println("Tengo GMS");
    }

    public void tengoSMS(){
        System.out.println("Tengo SMS");
    }
}
