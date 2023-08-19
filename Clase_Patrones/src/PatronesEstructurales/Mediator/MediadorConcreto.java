package PatronesEstructurales.Mediator;

import java.util.ArrayList;

public class MediadorConcreto extends Mediador {
    ArrayList<Colega> colegas = new ArrayList<>();
    @Override
    void registra(Colega colega) {
        if(!colegas.contains(colega)){
            colegas.add(colega);
            colega.setMediador(this);
        }

    }

    @Override
    void reenvia(Colega colega) {
        for(Colega actual: colegas){
            /**Varifica que no se envie el mensaje a si mismo**/
            if(!actual.equals(colega)){
                actual.recibe();
            }

        }

    }
}
