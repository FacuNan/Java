package PatronesEstructurales.Adapter;

public class Horno implements Encufable{

    private boolean encendido = false;

    @Override
    public void enciende() {
        this.encendido =true;
        System.out.println("estoy encendido");

    }

    @Override
    public void apaga() {
        this.encendido = false;
        System.out.println("Se ha apagado");
    }

    @Override
    public boolean encendido() {
        return encendido;
    }
}
