package PatronesEstructurales.Observer;

public class ReceptorRadio implements Receptor{
    @Override
    public void recibe() {
        System.out.println("La radio ha recibido el mensaje");

    }
}
