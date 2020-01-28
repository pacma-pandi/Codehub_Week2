package gr.codehub.thomas.bank;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Bank {
    private List<Account> accounts;

    public Bank(){
        super();
        accounts = new ArrayList<>();
    }

    public void addAccount(Account a) {
        accounts.add(a);
    }

    public void showAllAccounts() {
        accounts.forEach(System.out::println);
    }

    public double getTotalBalance() {
        return accounts.stream().mapToDouble(Account::getBalance).sum();
    }
}
