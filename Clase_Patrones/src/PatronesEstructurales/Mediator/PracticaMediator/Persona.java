package PatronesEstructurales.Mediator.PracticaMediator;

abstract public class Persona {
public Mediador mediador;

public void setMediador(Mediador mediador){
    this.mediador = mediador;
}

abstract void envia();
abstract void recibe();

}
