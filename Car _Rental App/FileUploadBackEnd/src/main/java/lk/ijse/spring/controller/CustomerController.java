package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("avc/customer")
@CrossOrigin
public class CustomerController {

    @GetMapping
    public String getAllCustomers(){
        return "hello tonny";
    }
}
