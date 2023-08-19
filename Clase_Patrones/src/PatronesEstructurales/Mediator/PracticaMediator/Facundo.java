package PatronesEstructurales.Mediator.PracticaMediator;

public class Facundo extends Persona {
    @Override
    void envia() {
        System.out.println("Soy Facundo y estoy mandando un mensaje a Nancy");
        mediador.reenvia(this);
    }

    @Override
    void recibe() {
        System.out.println("Soy Facundo y estoy recibinedo un mensaje de Nancy");
    }
}
