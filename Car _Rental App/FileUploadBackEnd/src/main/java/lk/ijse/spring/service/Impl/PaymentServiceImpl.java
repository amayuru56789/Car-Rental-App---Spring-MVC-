package lk.ijse.spring.service.Impl;

import lk.ijse.spring.entity.Payment;
import lk.ijse.spring.repo.PaymentRepo;
import lk.ijse.spring.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepo paymentRepo;

    @Override
    public void savePayment(Payment entity) {
        if (!paymentRepo.existsById(entity.getPayId())){
            paymentRepo.save(entity);
        }else {
            throw new RuntimeException("Payment is Already Exist...");
        }
    }

    @Override
    public void deletePayment(String id) {
        if (paymentRepo.existsById(id)){
            paymentRepo.deleteById(id);
        }else {
            throw new RuntimeException("Please check the Pay ID... no Such as Payment ID...!");
        }
    }

    @Override
    public void updatePayment(Payment entity) {
        if (paymentRepo.existsById(entity.getPayId())){
            paymentRepo.save(entity);
        }else {
            throw new RuntimeException("No Such As PaymentID to update...! Please check the Pay ID...!");
        }
    }

    @Override
    public Payment searchPayment(String id) {
        if (paymentRepo.existsById(id)){
            return paymentRepo.findById(id).get();
        }else {
            throw new RuntimeException("No Payment for "+id+" ...!");
        }
    }

    @Override
    public List<Payment> getAllPayments() {
        return paymentRepo.findAll();
    }
}
