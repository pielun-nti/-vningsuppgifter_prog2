package tis1409;

public class TestAccount {
    public static void main(String[] args){
        Customer customer = new Customer(1, "pierre", 50);
        Account acc = new Account(1, customer, 20000);
        System.out.println("afterdeposit: " +acc.deposit(1000));
        System.out.println("afterwithdraw:"+acc.withdraw(4000));
        System.out.println("balance" + acc.getBalance());
    }
}
