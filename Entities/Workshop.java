package Entities;

import Interfaces.Toy;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Workshop {
    private static Workshop instance;

    private static SantaClaus santaClaus;

    private static Queue<Dwarf> dwarves;

    private static MagicBoard magicBoard;

    private static List<Product> products;

    private Workshop() {
    }

    public static Workshop getInstance() {

        if(instance == null) {
            instance = new Workshop();
            System.out.println("A workshop has been created.");
            products=new ArrayList<>();
            santaClaus=SantaClaus.getInstance();
            magicBoard=MagicBoard.getInstance();
            System.out.println("How many dwarves do you want?");
            Scanner sc=new Scanner(System.in);
            try {
                int n = sc.nextInt();
                dwarves=Dwarf.GetListOfDwarves(n);
                System.out.println(n+" dwarves have been hired.");
            }
            catch(Exception e) {
                System.out.println("Enter a number!");
            }
        }

        return instance;
    }
    public void createProduct(){
        Product product=magicBoard.DesignProduct();
        if(product==null){
            System.out.println("Enter a valid choice.");
            System.out.println("Do you want to purchase a toy? (Y/N)");
            return;
        }
        Dwarf dwarf=dwarves.poll();
        dwarf.CraftProduct();
        products.add(product);
        System.out.println("A "+ product.toy.getClass().getSimpleName()+" has been created with color "+product.color.getClass().getSimpleName()+".");
        dwarves.add(dwarf);
        System.out.println("Do you want something else? (Y/N)");
    }
}
