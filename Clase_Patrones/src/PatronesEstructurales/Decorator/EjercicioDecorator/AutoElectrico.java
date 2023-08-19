package PatronesEstructurales.Decorator.EjercicioDecorator;

public class AutoElectrico extends AutoDecorator{
    public AutoElectrico(Vehiculo vehiculo) {
        super(vehiculo);
    }

    @Override
    public void crear() {
        super.crear();
        System.out.println("soy un auto que beneficia el medio ambiente");
    }
}
