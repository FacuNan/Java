package PatronesEstructurales.Iterator;

import java.util.ArrayList;

public class Usuarios implements UsuarioIterator {
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private int posicion = 0;

    public void Crear(Usuario usuario) {
        usuarios.add(usuario);
    }


    @Override
    public boolean hayMas() {
        return posicion < usuarios.size();
    }

    @Override
    public Usuario siguiente() {
        Usuario usuario = usuarios.get(posicion);
        posicion += 1;
        return usuario;
    }

    @Override
    public Usuario atras() {
        Usuario usuario = usuarios.get(posicion);
        posicion -= 1;
        return usuario;
    }

    @Override
    public void reinicia() {
        posicion = 0;

    }
}
