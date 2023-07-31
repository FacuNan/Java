import PatronesCreacionales.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton app = Singleton.getInstance();
        Singleton app2 = Singleton.getInstance(); /**importante de poner Static para poder ser invocado desde el main**/

        app.run();
        app2.run();

        System.out.println(app + " "+ app2);


    }
}