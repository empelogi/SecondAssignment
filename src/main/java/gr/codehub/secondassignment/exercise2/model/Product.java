package gr.codehub.secondassignment.exercise2.model;


public class Product {

    private int id;
    private String name;
    private double priceWhenBuy;
    private double priceWhenSell;

    public Product(int id, String name, double priceWhenBuy, double priceWhenSell){
        this.id = id;
        this.name = name;
        this.priceWhenBuy = priceWhenBuy;
        this.priceWhenSell = priceWhenSell;
    }

    public Product(){

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPriceWhenBuy() {
        return priceWhenBuy;
    }

    public double getPriceWhenSell() {
        return priceWhenSell;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", priceWhenBuy=" + priceWhenBuy +
                ", priceWhenSell=" + priceWhenSell +
                '}';
    }
}
