package PatronesEstructurales.Adapter.EjercicioAdapter;

public class CocheIngles {
    boolean power = false;
    int velocidad =0;


    public void powerOn(int velocidad) {
        this.power= true;
        this.velocidad = velocidad;
    }


    public void powerOff() {
        this.power = false;
        this.velocidad =0;

    }


    public boolean onPower() {
        return this.power;
    }
}
