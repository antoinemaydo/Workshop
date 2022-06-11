package Entities;

import Entities.Factories.AbstractFactory;
import Entities.Factories.FactoryProducer;
import Interfaces.Toy;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Dwarf implements Comparable<Dwarf>{

    public String name;
    public Integer craftedItemsCount;

    public Dwarf(String name){
        this.name=name;
        this.craftedItemsCount=0;
    }

    public String getName() {
        return name;
    }

    public Integer getCraftedItemsCount() {
        return craftedItemsCount;
    }

    public static Queue<Dwarf> GetListOfDwarves(int numberOfDwarves){
        Queue<Dwarf> dwarves=new PriorityQueue<Dwarf>();
        Scanner sc=new Scanner(System.in);
        String name;
        for (int i=0;i<numberOfDwarves;i++){
            System.out.println("Choose name for the dwarf");
            name=sc.next();
            Dwarf dwarf=new Dwarf(name);
            dwarves.add(dwarf);
        }
        return dwarves;
    }

    public void CraftProduct(){
        craftedItemsCount++;
        System.out.println(this.getName()+" has crafted a product. Count of crafted items:"+this.getCraftedItemsCount());
    }

    @Override
    public int compareTo(Dwarf o) {
        return 0;
    }
}
