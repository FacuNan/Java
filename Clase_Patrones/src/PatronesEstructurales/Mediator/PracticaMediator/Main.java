package PatronesEstructurales.Mediator.PracticaMediator;

public class Main {
    public static void main(String[] args) {
        Mediador mediador = new MediadorConcreto();
        Persona Facundo = new Facundo();
        Persona Nancy = new Nancy();

        mediador.registra(Nancy);
        mediador.registra(Facundo);

        Facundo.envia();
        Nancy.envia();
    }
}
