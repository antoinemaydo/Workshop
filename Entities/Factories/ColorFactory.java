package Entities.Factories;

import Entities.Colors.Blue;
import Entities.Colors.Green;
import Entities.Colors.Red;
import Interfaces.Color;
import Interfaces.Toy;

public class ColorFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        if(color.equals("B")){
            return new Blue();
        }
        else if(color.equals("R")){
            return new Red();
        }
        else if(color.equals("G")){
            return new Green();
        }
        else{
            throw new IllegalArgumentException();
        }
    }

    @Override
    public Toy getToy(String toy) {
        return null;
    }
}
