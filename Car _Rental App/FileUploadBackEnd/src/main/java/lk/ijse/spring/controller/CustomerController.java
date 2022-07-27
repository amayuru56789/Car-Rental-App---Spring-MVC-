package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//REST = Representational State Transfer (A way of data transfer among client server app)
@RestController
@RequestMapping("avc/customer") // handler mapping
@CrossOrigin
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping  // handler mapping
    public List<CustomerDTO> getAllCustomers(){ // handler methods

        return customerService.getAllCustomers();
    }

    @PostMapping  // handler mapping
    public void saveCustomer(@ModelAttribute CustomerDTO customer){ // handler methods
        customerService.saveCustomer(customer);
    }

    @PutMapping  // handler mapping
    public void updateCustomer(@RequestBody CustomerDTO customer){ // handler methods
        customerService.updateCustomer(customer);
    }

    @DeleteMapping(params = {"id"})  // handler mapping
    public void deleteCustomer(@RequestParam String id){ // handler methods
        customerService.deleteCustomer(id);
    }

    /*fixed Ambiguous Mapping using path variable*/
    @GetMapping(path = "/{id}")  // handler mapping
    public CustomerDTO searchCustomer(@PathVariable String id){ // handler methods
        return customerService.searchCustomer(id);
    }
}
