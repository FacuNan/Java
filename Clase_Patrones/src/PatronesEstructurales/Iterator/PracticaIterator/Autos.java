package PatronesEstructurales.Iterator.PracticaIterator;

import java.util.ArrayList;

public class Autos implements AutoIterator {
    private ArrayList<Auto> autos = new ArrayList<>();
    private int posicion = 0;

    public void Crear(Auto auto){
        autos.add(auto);
    }

    @Override
    public Auto siguiente() {
        Auto auto = autos.get(posicion);
        posicion += 1;
        return auto;
    }

    @Override
    public Auto atras() {
        Auto auto = autos.get(posicion);
        posicion -=1;
        return auto;
    }

    @Override
    public boolean hayMas() {
        return posicion < autos.size();
    }

    @Override
    public void reinicia() {
        posicion = 0;

    }
}
