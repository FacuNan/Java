package PatronesEstructurales.Mediator;

public class ColegaConcreto extends Colega{

    @Override
    void recibe() {
        System.out.println("Soy el colega y recibi un mensaje");

    }

    @Override
    void envia() {
        System.out.println("Soy el colega y estoy mandando el mensaje...");
        mediador.reenvia(this);

    }
}
