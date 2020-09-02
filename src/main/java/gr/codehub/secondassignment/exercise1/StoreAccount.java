package gr.codehub.secondassignment.exercise1;

public class StoreAccount extends Account {

    private String storeName;
    private Category category;

    //suitable constructors
    public StoreAccount(String owner, double balance, String storeName, Category category) {

        super(owner, balance);
        this.storeName = storeName;
        this.category = category;
    }

    public StoreAccount(String storeName, Category category) {
        this.storeName = storeName;
        this.category = category;
    }

    public StoreAccount() {

    }


    //getter and setter methods
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public void withdraw(double withdraw) {
        super.withdraw(withdraw);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }

    public void ChangeCategory(Category category) {
        setCategory(category);
    }

}
