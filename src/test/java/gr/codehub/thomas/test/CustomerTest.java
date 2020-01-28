package gr.codehub.thomas.test;


import gr.codehub.thomas.bank.Customer;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CustomerTest {
    private Customer customer;
    @BeforeAll
    public static void setUpAll(){

    }

    @BeforeEach
    public void setUpEach(){
        customer = new Customer();
    }

    @Test
    public void setNameTest(){
        customer.setName("Thomas");
        assert(customer.getName().equals("Thomas"));
    }

    @Test
    public void setEmailTest(){
        customer.setEmail("thomas@test.com");
        assert(customer.getEmail().equals("thomas@test.com"));
    }
}
