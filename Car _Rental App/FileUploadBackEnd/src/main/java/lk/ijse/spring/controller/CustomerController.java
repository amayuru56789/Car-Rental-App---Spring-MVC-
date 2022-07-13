package lk.ijse.spring.controller;

import lk.ijse.spring.service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("avc/customer")
@CrossOrigin
public class CustomerController {

    @Autowired
    CustomerServiceImpl customerService;

    @GetMapping
    public String getAllCustomers(){
        return "hello tonny";
    }
}
