package PatronesEstructurales.Observer;

public class ReceptorSatelite implements Receptor{

    @Override
    public void recibe() {
        System.out.println("El satelite ha recibido el mensaje");

    }
}
