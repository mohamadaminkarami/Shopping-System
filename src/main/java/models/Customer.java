package main.java.models;

public class Customer extends User {
    private int balance;

    public Customer(String username, String password) {
        super(username, password);
        this.balance = 0;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return this.getUsername();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Customer)) {
            return false;
        }

        Customer customer = (Customer) obj;

        return this.getUserId() == customer.getUserId();
    }

}
