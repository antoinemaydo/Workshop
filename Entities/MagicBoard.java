package Entities;

import Entities.Factories.AbstractFactory;
import Entities.Factories.FactoryProducer;

import java.util.Scanner;

public class MagicBoard {
    private static MagicBoard instance;

    private MagicBoard() {
    }

    public static MagicBoard getInstance() {

        if(instance == null) {
            instance = new MagicBoard();
            System.out.println("A magic board has been created.");
        }

        return instance;
    }

    public Product DesignProduct(){
        Product product=new Product();
        System.out.println("Do you want a doll or bicycle?(Doll/Bicycle)");
        AbstractFactory toyFactory = FactoryProducer.getFactory("Toy");
        Scanner sc = new Scanner(System.in);
        String toyString=sc.next();
        try {
            product.toy = toyFactory.getToy(toyString);
        }
        catch (IllegalArgumentException iae){
            return null;
        }
        System.out.println("Which color do you want to be your toy?(R/G/B)");
        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");
        String colorString=sc.next();
        try {
            product.color = colorFactory.getColor(colorString);
        }
        catch (IllegalArgumentException iae) {
            return null;
        }
        return product;
    }
}
