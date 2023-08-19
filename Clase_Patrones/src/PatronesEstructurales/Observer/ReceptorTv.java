package PatronesEstructurales.Observer;

public class ReceptorTv implements Receptor{
    @Override
    public void recibe() {
        System.out.println("La tv ha recibido la señal");

    }
}
