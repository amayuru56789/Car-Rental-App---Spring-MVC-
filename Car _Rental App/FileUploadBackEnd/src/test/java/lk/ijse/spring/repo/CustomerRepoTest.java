package lk.ijse.spring.repo;

import lk.ijse.spring.config.JPAConfig;
import lk.ijse.spring.entity.Customer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.jupiter.api.Assertions.*;

@WebAppConfiguration // introduced test class
@ContextConfiguration(classes = {JPAConfig.class}) // import JPAConfig
@ExtendWith(SpringExtension.class) // config 3rd party vendor and run
class CustomerRepoTest {

    @Autowired
    CustomerRepo customerRepo; // Inject the dependency of Customer Repo

    @Test // Test method
    public void saveCustomer(){
        Customer customer = new Customer("C001", "Amayuru", "Colombo", "+94769689591", "12", "12");
        customerRepo.save(customer);
    }

}