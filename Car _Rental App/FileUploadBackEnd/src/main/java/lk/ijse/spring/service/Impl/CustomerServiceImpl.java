package lk.ijse.spring.service.Impl;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.repo.CustomerRepo;
import lk.ijse.spring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service //put for the Application Context
@Transactional // introduce aspect for Transaction manager
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public void saveCustomer(CustomerDTO dto){
        if(!customerRepo.existsById(dto.getCustomerID())){

            Customer customer = new Customer(dto.getCustomerID(), dto.getCustomerName(), dto.getCustomerAddress(), dto.getContact(), dto.getLicense(), dto.getNicCard());

            customerRepo.save(customer);
        }else {
            throw new RuntimeException("Customer already exist...");
        }

    }

    @Override
    public void deleteCustomer(String id){
        if (customerRepo.existsById(id)){
            customerRepo.deleteById(id);
        }else {
            throw new RuntimeException("Please check the Customer ID.. no Such as Customer...!");
        }

    }

    @Override
    public void updateCustomer(CustomerDTO dto){
        if(customerRepo.existsById(dto.getCustomerID())){

            Customer customer = new Customer(dto.getCustomerID(), dto.getCustomerName(), dto.getCustomerAddress(), dto.getContact(), dto.getLicense(), dto.getNicCard());

            customerRepo.save(customer);
        }else {
            throw new RuntimeException("No Such as Customer To Update...! Please Check the ID...!");
        }

    }

    @Override
    public CustomerDTO searchCustomer(String id){
        if (customerRepo.existsById(id)){
//            return customerRepo.findById(id).get();
            Customer customer = customerRepo.findById(id).get();
            return new CustomerDTO(customer.getCustomerID(), customer.getCustomerName(), customer.getCustomerAddress(), customer.getContact(), customer.getLicense(), customer.getNicCard());
        }else {
            throw new RuntimeException("No Customer For "+id+" ...!");
        }
        /*return customerRepo.findById(id).get();*/
    }

    @Override
    public List<CustomerDTO> getAllCustomers(){
        List<Customer> all = customerRepo.findAll();
        List<CustomerDTO> arrayList = new ArrayList<>();
        for (Customer customer : all) {
            arrayList.add(new CustomerDTO(customer.getCustomerID(), customer.getCustomerName(), customer.getCustomerAddress(), customer.getContact(), customer.getLicense(), customer.getNicCard()));
        }
        return arrayList;
        /*return customerRepo.findAll();*/
    }
}
