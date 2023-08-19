package PatronesEstructurales.Observer;

public class Main {
    public static void main(String[] args) {
        Emisor emisor = new Emisor();

        ReceptorRadio radio = new ReceptorRadio();
        ReceptorTv television = new ReceptorTv();
        ReceptorSatelite satelite = new ReceptorSatelite();

        emisor.ingresarReceptor(radio);
        emisor.ingresarReceptor(television);
        emisor.ingresarReceptor(satelite);

        emisor.emite();
    }
}
