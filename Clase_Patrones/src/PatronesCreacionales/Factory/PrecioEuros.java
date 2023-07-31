package PatronesCreacionales.Factory;

public class PrecioEuros implements Precio {
    public PrecioEuros() {
    }

    @Override
    public double getPrecio() {
        return 0.15;
    }
}
