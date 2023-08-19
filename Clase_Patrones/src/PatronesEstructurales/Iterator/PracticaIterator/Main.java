package PatronesEstructurales.Iterator.PracticaIterator;

public class Main {
    public static void main(String[] args) {
        Autos autos = new Autos();

        autos.Crear(new Auto("Ferrari", 1986));
        autos.Crear(new Auto("Wolfvagen", 1990));
        autos.Crear(new Auto("Mercedes Benz", 1998));


        while(autos.hayMas()){
            Auto auto = autos.siguiente();
            System.out.println("El auto es: " + auto.getNombre() + " Y es un modelo " + auto.getModelo());
        }

    }
}
