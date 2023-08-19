package PatronesEstructurales.Mediator;

public class ColegaConcreto2 extends Colega{

    @Override
    void recibe() {
        System.out.println("Soy colega 2 y estoy recibinedo un mensaje");

    }

    @Override
    void envia() {
        System.out.println("Soy colega 2 y estoy enviando un mensaje");
        mediador.reenvia(this);

    }
}
