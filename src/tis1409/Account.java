package tis1409;

public class Account {
    int id;
    Customer customer;
    double balance;
    public Account(int id, Customer customer, double balance){
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer){
        this.id = id;
        this.customer = customer;
    }

    public double deposit(double amount){
        this.balance += amount;
        return this.balance;
    }

    public double withdraw(double amount){
        if (balance >= amount){
            this.balance -= amount;
        }else{
            System.err.println("You do not have enough balance to withdraw this amount");
        }
        return this.balance;
    }

    @Override
    public String toString() {
        return "ID=" + id + ",balance=" + balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
