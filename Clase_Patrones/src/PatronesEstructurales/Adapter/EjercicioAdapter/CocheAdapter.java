package PatronesEstructurales.Adapter.EjercicioAdapter;

public class CocheAdapter implements CocheEspañol{
    public CocheIngles cocheIngles = new CocheIngles();
    @Override
    public void enciende() {
        this.cocheIngles.powerOn(100);

    }

    @Override
    public void apaga() {
        this.cocheIngles.powerOff();
    }

    @Override
    public boolean estaEncendido() {
        return cocheIngles.onPower();
    }
}
