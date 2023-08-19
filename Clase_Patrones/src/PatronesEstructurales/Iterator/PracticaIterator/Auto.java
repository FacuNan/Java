package PatronesEstructurales.Iterator.PracticaIterator;

public class Auto {
    private String nombre;
    private int modelo;

    private Auto() {
    }

    public Auto(String nombre, int modelo) {
        this.nombre = nombre;
        this.modelo = modelo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getModelo() {
        return modelo;
    }
}
