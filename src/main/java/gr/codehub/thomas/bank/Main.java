package gr.codehub.thomas.bank;

public class Main {
    public static void main(String[] args) {
        //
        Customer customer1 = new Customer();
        customer1.setName("Thomas Rich");
        customer1.setEmail("thomas.rich@rich.com");
        //
        Customer customer2 = new Customer();
        customer2.setName("Thomas Poor");
        customer2.setEmail("thomas.poor@poor.com");
        //
        Account account1 = new Account();
        account1.setHolder(customer1);
        account1.deposit(12345.67);
        //
        Account account2 = new Account();
        account2.setHolder(customer2);
        account2.withdraw(399.99);
        //
        Bank bank = new Bank();
        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.showAllAccounts();
    }

}
