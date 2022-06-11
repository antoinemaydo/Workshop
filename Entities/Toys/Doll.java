package Entities.Toys;

import Interfaces.Toy;

public class Doll implements Toy {
    @Override
    public void makeASound() {
        System.out.println("Nani na ni na");
    }
}
