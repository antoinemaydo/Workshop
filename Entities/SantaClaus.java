package Entities;

public class SantaClaus {
    private static SantaClaus instance;

    private SantaClaus() {
    }

    public static SantaClaus getInstance() {

        if(instance == null) {
            instance = new SantaClaus();
            System.out.println("A Santa Claus has been created.");
        }

        return instance;
    }
}
