package gr.codehub.thomas.bank;

import lombok.Data;

@Data
public class Account {
    private Customer holder;
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}
