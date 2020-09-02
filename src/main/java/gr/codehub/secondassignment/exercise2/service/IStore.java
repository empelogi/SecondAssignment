package gr.codehub.secondassignment.exercise2.service;

import gr.codehub.secondassignment.exercise2.model.Product;

public interface IStore {

    void buy(Product product);
    void sell(Product product);
    double getRevenue();

    void getInventory();
    void reset();


}
