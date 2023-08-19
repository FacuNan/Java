package PatronesEstructurales.Mediator.PracticaMediator;

public class Nancy extends Persona{

    @Override
    void envia() {
        System.out.println("Hola soy Nancy y estoy enviando un msj a Facundo");
        mediador.reenvia(this);

    }

    @Override
    void recibe() {
        System.out.println("Hola soy Nancy y estoy Recibinedo un msj de Facundo");

    }
}
