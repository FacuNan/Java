package PatronesCreacionales.Builder;

public class Vehiculo {
    private int id;
    public String marca;
    public int puertas;

    public Vehiculo() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPuertas() {
        return puertas;
    }
}
