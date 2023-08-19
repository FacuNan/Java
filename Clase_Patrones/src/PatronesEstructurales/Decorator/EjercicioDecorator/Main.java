package PatronesEstructurales.Decorator.EjercicioDecorator;

public class Main {
    public static void main(String[] args) {
        AutoElectrico autoElectrico = new AutoElectrico(new Auto());

        autoElectrico.crear();
    }
}
