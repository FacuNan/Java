package PatronesEstructurales.Adapter;

public class LightBulb {
    boolean power = false;
    int voltaje = 0;

    public void turnOn(int voltaje){
        this.power = true;
        this.voltaje=voltaje;
        System.out.println("Se encendio");

    }

    public void turnOff(){
        this.power=false;
        this.voltaje=0;
        System.out.println("Se apago");
    }

    public boolean onPower(){
        System.out.println(this.power);
        return this.power;

    }

}
