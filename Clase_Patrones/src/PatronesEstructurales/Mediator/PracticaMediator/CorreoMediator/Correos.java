package PatronesEstructurales.Mediator.PracticaMediator.CorreoMediator;

abstract public class Correos {

    public Mediator mediator;

    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }

    abstract void recibe();
    abstract void envia();
}
