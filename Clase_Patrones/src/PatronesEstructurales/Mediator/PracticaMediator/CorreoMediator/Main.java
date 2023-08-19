package PatronesEstructurales.Mediator.PracticaMediator.CorreoMediator;

public class Main {
    public static void main(String[] args) {
        Mediator mediador = new MediatorConcreto();
        Correos correo1 = new Correo1();
        Correos correo2 = new Correo2();

        mediador.registra(correo1);
        mediador.registra(correo2);

        correo1.envia();
    }
}
