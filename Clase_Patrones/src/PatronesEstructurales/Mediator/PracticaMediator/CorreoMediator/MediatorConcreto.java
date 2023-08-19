package PatronesEstructurales.Mediator.PracticaMediator.CorreoMediator;

import java.util.ArrayList;

public class MediatorConcreto extends Mediator {
    ArrayList<Correos> correos = new ArrayList<>();



    @Override
    void registra(Correos correo) {
        if(!correos.contains(correo)){
            correos.add(correo);
            correo.setMediator(this);
        }

    }

    @Override
    void reenvia(Correos correo) {
        for(Correos actual: correos){
            if(!actual.equals(correo)){
                actual.recibe();
            }
        }

    }
}
