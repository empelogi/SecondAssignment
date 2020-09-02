package gr.codehub.secondassignment.exercise2.service;

import gr.codehub.secondassignment.exercise2.model.Product;

import java.util.ArrayList;

public class InventoryRetailStore implements IStore {


    private ArrayList<Product> inventory;
    double totalBuyBalance = 0;
    double totalSellBalance = 0;

    public InventoryRetailStore() {
        this.inventory = new ArrayList<>();
    }

    @Override
    public void buy(Product product) {
        inventory.add(product);
        totalBuyBalance = totalBuyBalance + product.getPriceWhenBuy();
    }

    @Override
    public void sell(Product product) {
        inventory.remove(product);
        totalSellBalance = totalSellBalance + product.getPriceWhenSell();
    }

    @Override
    public double getRevenue() {
        return totalSellBalance - totalBuyBalance;
    }

    @Override
    public void getInventory() {
        System.out.println("The inventory contains the following: ");
        inventory.forEach(System.out::println);
    }

    @Override
    public void reset() {
        inventory.clear();
    }

}
