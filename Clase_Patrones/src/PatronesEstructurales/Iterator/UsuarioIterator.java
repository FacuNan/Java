package PatronesEstructurales.Iterator;

public interface UsuarioIterator {
    boolean hayMas();
    Usuario siguiente();

    Usuario atras();
    void reinicia();
}
