package PatronesEstructurales.Iterator;

public class Main {
    public static void main(String[] args) {
        Usuarios usuarios = new Usuarios();

        usuarios.Crear(new Usuario("Facundo", 32));
        usuarios.Crear(new Usuario("Nancy", 45));
        usuarios.Crear(new Usuario("Roman", 32));


        while(usuarios.hayMas()){
            Usuario usuario = usuarios.siguiente();
            System.out.println(usuario.getNombre());
        }



    }
}
