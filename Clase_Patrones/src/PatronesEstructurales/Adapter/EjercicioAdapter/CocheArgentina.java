package PatronesEstructurales.Adapter.EjercicioAdapter;

public class CocheArgentina implements CocheEspañol{
    boolean enciende = false;
    int velocidad = 0;
    @Override
    public void enciende() {
        this.enciende= true;
        this.velocidad = 100;
    }

    @Override
    public void apaga() {
        this.enciende = false;
        this.velocidad =0;

    }

    @Override
    public boolean estaEncendido() {
        return this.enciende;
    }
}
