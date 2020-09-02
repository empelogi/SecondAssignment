package gr.codehub.secondassignment.exercise2;

import gr.codehub.secondassignment.exercise2.model.Product;
import gr.codehub.secondassignment.exercise2.service.IStore;
import gr.codehub.secondassignment.exercise2.service.InventoryRetailStore;
import gr.codehub.secondassignment.exercise2.service.SimpleRetailStore;

public class Main {

    public static void main(String[] args) {


        Product x1 = new Product(1, "Painting Picasso. Guernica", 100, 1000);
        Product x2 = new Product(2, "Painting Tsarouxis. Naftis A", 200, 2000);
        Product x4 = new Product(3, "Chair. Luis XV", 100, 1000);

        IStore simple= new SimpleRetailStore();
        simple.buy(x1);
        simple.buy(x4);
        simple.sell(x1);
        System.out.println(simple.getRevenue());

        System.out.println("========================================================================");
        IStore invStore = new InventoryRetailStore();
        invStore.buy(x1);
        invStore.buy(x2);
        invStore.sell(x1);
        System.out.println(invStore.getRevenue());

        invStore.sell(x2);
        invStore.getInventory();
        System.out.println(invStore.getRevenue());



    }
}
