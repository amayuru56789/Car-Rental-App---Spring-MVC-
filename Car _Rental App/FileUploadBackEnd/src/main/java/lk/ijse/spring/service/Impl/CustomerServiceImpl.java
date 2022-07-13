package lk.ijse.spring.service.Impl;

import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service //put for the Application Context
@Transactional // introduce aspect for Transaction manager
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public void saveCustomer(Customer entity){
        if(!customerRepo.existsById(entity.getCustomerID())){
            customerRepo.save(entity);
        }else {
            throw new RuntimeException("Customer already exist...");
        }

    }

    @Override
    public void deleteCustomer(String id){
        customerRepo.deleteById(id);
    }

    @Override
    public void updateCustomer(Customer entity){
        if(customerRepo.existsById(entity.getCustomerID())){
            customerRepo.save(entity);
        }else {
            throw new RuntimeException("No Such as Customer To Update...! Please Check the ID...!");
        }

    }

    @Override
    public Customer searchCustomer(String id){
        return customerRepo.findById(id).get();
    }

    @Override
    public List<Customer> getAllCustomers(){
        return customerRepo.findAll();
    }
}
