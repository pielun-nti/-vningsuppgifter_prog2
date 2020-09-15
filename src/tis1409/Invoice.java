package tis1409;

public class Invoice {
    int id;
    Customer customer;
    double amount;
    public Invoice(int id, Customer customer, double amount){
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public double getAmountAfterDiscount(){
        return amount;
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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
