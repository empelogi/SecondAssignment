package gr.codehub.secondassignment.exercise2.service;

import gr.codehub.secondassignment.exercise2.model.Product;

public class SimpleRetailStore implements IStore {

    private double totalBuyBalance;
    private double totalSellBalance;


    @Override
    public void buy(Product product) {
        totalBuyBalance = totalBuyBalance + product.getPriceWhenBuy();
    }

    @Override
    public void sell(Product product) {
        totalSellBalance = totalSellBalance + product.getPriceWhenSell();
    }

    @Override
    public double getRevenue() {
        double revenue = totalSellBalance - totalBuyBalance;
        return revenue;
    }

    @Override
    public void getInventory() {

    }

    @Override
    public void reset() {

    }


}
