package PatronesCreacionales.Factory;

public class PrecioFactory {
    Precio precio;
    public PrecioFactory() {
    }

    public PrecioFactory(String pais) {
        if(pais.equalsIgnoreCase("España")){
            System.out.println("Precio en Euros");
            precio = new PrecioEuros();
        }else{
            System.out.println("Precio en USD");
            precio = new PrecioDolares();
        }
    }

public double getPrecios(){
        return precio.getPrecio();
}

}
