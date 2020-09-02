package gr.codehub.secondassignment.exercise1;

//tester method for account class
public class ManageAccounts {

    public static void main(String[] args) {

        Account eleniAccount = new Account("Eleni", 3015.2);
        AccountTesterMethod(eleniAccount);


        System.out.println("======================================================================");

        StoreAccount belogianniAccount = new StoreAccount("Eleni Belogianni", 500, "Elenis Cafe", Category.BASIC);
        StoreAccountTesterMethod(belogianniAccount);


    }

    //tester method for Accounts
    static void AccountTesterMethod(Account account) {

        System.out.println("The account holder is: " + account.getOwner() + "\n" +
                "The number of transactions is: " + account.getNumberOfTransactions() + "\n" +
                "The current balance of the account is: " + account.getBalance());

        //testing deposit method
        account.deposit(100.4);
        System.out.println("The account holder is: " + account.getOwner() + "\n" +
                "The number of transactions is: " + account.getNumberOfTransactions() + "\n" +
                "The current balance of the account is: " + account.getBalance());

        //testing withdraw method
        account.withdraw(150.2);
        System.out.println("The account holder is: " + account.getOwner() + "\n" +
                "The number of transactions is: " + account.getNumberOfTransactions() + "\n" +
                "The current balance of the account is: " + account.getBalance());

    }

    //tester method for Store Accounts
    static void StoreAccountTesterMethod(StoreAccount storeAccount) {

        System.out.println("The account holder is: " + storeAccount.getOwner() + "\n" +
                "The store name is: " + storeAccount.getStoreName() + "\n" +
                "The number of transactions is: " + storeAccount.getNumberOfTransactions() + "\n" +
                "The current balance of the account is: " + storeAccount.getBalance() + "\n" +
                "The account's category is: " + storeAccount.getCategory());

        //testing deposit method
        storeAccount.deposit(1023.5);
        System.out.println("The account holder is: " + storeAccount.getOwner() + "\n" +
                "The store name is: " + storeAccount.getStoreName() + "\n" +
                "The number of transactions is: " + storeAccount.getNumberOfTransactions() + "\n" +
                "The current balance of the account is: " + storeAccount.getBalance() + "\n" +
                "The account's category is: " + storeAccount.getCategory());

        //testing withdraw method
        storeAccount.deposit(100);
        System.out.println("The account holder is: " + storeAccount.getOwner() + "\n" +
                "The store name is: " + storeAccount.getStoreName() + "\n" +
                "The number of transactions is: " + storeAccount.getNumberOfTransactions() + "\n" +
                "The current balance of the account is: " + storeAccount.getBalance() + "\n" +
                "The account's category is: " + storeAccount.getCategory());

        //testing the change category method
        storeAccount.ChangeCategory(Category.EXTRA);
        System.out.println("The account holder is: " + storeAccount.getOwner() + "\n" +
                "The store name is: " + storeAccount.getStoreName() + "\n" +
                "The number of transactions is: " + storeAccount.getNumberOfTransactions() + "\n" +
                "The current balance of the account is: " + storeAccount.getBalance() + "\n" +
                "The account's category is: " + storeAccount.getCategory());

    }
}
