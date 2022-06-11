package Entities.Factories;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factoryName){
        if(factoryName.equals("Toy")){
            return new ToyFactory();
        }
        else if(factoryName.equals("Color")) {
            return new ColorFactory();
        }
        return null;
    }
}
