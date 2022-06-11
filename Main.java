import Entities.Workshop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Workshop workshop=Workshop.getInstance();
        String command="Y";
        while(command.equals("Y")||command.equals("Yes")) {
            workshop.createProduct();
            Scanner sc=new Scanner(System.in);
            command=sc.next();
        }
    }
}
