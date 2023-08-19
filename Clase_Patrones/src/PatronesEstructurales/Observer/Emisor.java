package PatronesEstructurales.Observer;

import java.util.ArrayList;

public class Emisor {
    private ArrayList<Receptor> receptor = new ArrayList<>();

    public void ingresarReceptor(Receptor receptor){
        this.receptor.add(receptor);
    }

    public void emite(){
        for (Receptor receptor: receptor){
            receptor.recibe();
        }
    }
}
