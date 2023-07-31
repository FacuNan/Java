package PatronesCreacionales.Builder;

public class CocheBuilder {
    Vehiculo vehiculo;

    public CocheBuilder(String marca){
        vehiculo = new Vehiculo();
        vehiculo.marca = marca;
    }


    public CocheBuilder setPuertas(int puertas){
        vehiculo.puertas = puertas;
        return this;
    }

    public Vehiculo build(){
        return this.vehiculo;
    }


}
