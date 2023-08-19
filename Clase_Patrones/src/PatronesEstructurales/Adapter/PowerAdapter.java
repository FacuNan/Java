package PatronesEstructurales.Adapter;

public class PowerAdapter implements Encufable{
    public LightBulb lightBulb = new LightBulb();
    @Override
    public void enciende() {
        this.lightBulb.turnOn(110);
    }

    @Override
    public void apaga() {
        this.lightBulb.turnOff();
    }

    @Override
    public boolean encendido() {
        return this.lightBulb.onPower();
    }
}
