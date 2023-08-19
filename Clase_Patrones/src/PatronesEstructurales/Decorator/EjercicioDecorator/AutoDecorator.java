package PatronesEstructurales.Decorator.EjercicioDecorator;

public class AutoDecorator implements Vehiculo{

    Vehiculo vehiculo;

    public AutoDecorator(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public void crear() {
        this.vehiculo.crear(); ;

    }
}
