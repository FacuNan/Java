package PatronesEstructurales.Mediator.PracticaMediator.CorreoMediator;

public class Correo1 extends Correos{
    @Override
    void recibe() {
        System.out.println("Soy Correo1 y estoy recibinedo un Mensaje");

    }

    @Override
    void envia() {
        System.out.println("Soy Correo1 y estoy enviando un Mensaje");
        mediator.reenvia(this);
    }
}
