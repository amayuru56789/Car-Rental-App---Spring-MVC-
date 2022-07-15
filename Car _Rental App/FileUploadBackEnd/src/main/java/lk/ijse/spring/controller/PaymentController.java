package lk.ijse.spring.controller;

import lk.ijse.spring.entity.Payment;
import lk.ijse.spring.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("avc/pay")
@CrossOrigin
public class PaymentController {

    @Autowired
    PaymentService paymentService;

    @GetMapping
    public List<Payment> getAllPayments(){
        return paymentService.getAllPayments();
    }

    @PostMapping
    public void savePayment(@ModelAttribute Payment payment){
        paymentService.savePayment(payment);
    }

    @PutMapping
    public void updatePayment(@RequestBody Payment payment){
        paymentService.updatePayment(payment);
    }

    @DeleteMapping(params = {"id"})
    public void deletePayment(String id){
        paymentService.deletePayment(id);
    }

    @GetMapping(path = "/{id}")
    public Payment searchPayment(@PathVariable String id){
        return paymentService.searchPayment(id);
    }
}
