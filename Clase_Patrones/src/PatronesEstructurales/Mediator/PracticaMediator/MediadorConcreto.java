package PatronesEstructurales.Mediator.PracticaMediator;

import java.util.ArrayList;

public class MediadorConcreto extends Mediador{
    ArrayList<Persona> personas = new ArrayList<>();
    @Override
    void registra(Persona persona) {
        if(!personas.contains(persona)){
            personas.add(persona);
            persona.setMediador(this);
        }

    }

    @Override
    /**La persona que se pasa como parametro es la persona que emite**/
    void reenvia(Persona persona) {
        for(Persona actual: personas){
            if(!actual.equals(persona)){
                actual.recibe();
            }

        }

    }
}
