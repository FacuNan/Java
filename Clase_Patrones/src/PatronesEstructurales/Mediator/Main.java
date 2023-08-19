package PatronesEstructurales.Mediator;

public class Main {
    public static void main(String[] args) {
        Mediador mediador = new MediadorConcreto();
        Colega colega1 = new ColegaConcreto();
        Colega colega2 = new ColegaConcreto2();

        mediador.registra(colega1);
        mediador.registra(colega2);

        colega1.envia();
    }
}
