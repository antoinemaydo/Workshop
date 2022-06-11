package Entities.Factories;

import Entities.Colors.Blue;
import Entities.Colors.Green;
import Entities.Colors.Red;
import Entities.Toys.Bicycle;
import Entities.Toys.Doll;
import Interfaces.Color;
import Interfaces.Toy;

public class ToyFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Toy getToy(String toy) {

        if(toy.equals("Doll")){
            return new Doll();
        }
        else if(toy.equals("Bicycle")){
            return new Bicycle();
        }
        else{
            throw new IllegalArgumentException();
        }
    }
}
