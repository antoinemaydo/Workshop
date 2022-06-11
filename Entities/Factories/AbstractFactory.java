package Entities.Factories;

import Interfaces.Color;
import Interfaces.Toy;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Toy getToy(String toy);
}
