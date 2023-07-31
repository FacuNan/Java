package PatronesCreacionales;

public class Singleton {
    private static Singleton singleton;
    private boolean iniciado = false;

    public Singleton() {
    }

    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();

        }
        return singleton;

    }


    public void run(){
        if(iniciado == false){
            iniciado = true;
            System.out.println("Aplicacion iniciada");
        }
        iniciado = false;
        System.out.println("La aplicacion se ha cerrado");
    }
}
