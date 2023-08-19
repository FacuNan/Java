package PatronesEstructurales.Mediator.PracticaMediator.CorreoMediator;

public class Correo2 extends Correos {
    @Override
    void recibe() {
        System.out.println("Soy Correo2y estoy recibinedo un Mensaje");

    }

    @Override
    void envia() {
        System.out.println("Soy Correo2 y estoy enviando un Mensaje");
        mediator.reenvia(this);
    }
}
