package Entities.Toys;

import Interfaces.Toy;

public class Bicycle implements Toy {
    @Override
    public void makeASound() {
        System.out.println("Vryt vryt");
    }
}
