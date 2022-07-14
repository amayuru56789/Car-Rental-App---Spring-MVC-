package lk.ijse.spring.service.Impl;

import lk.ijse.spring.entity.Employee;
import lk.ijse.spring.repo.EmployeeRepo;
import lk.ijse.spring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo repo;

    @Override
    public void saveEmployee(Employee entity) {
        if(!repo.existsById(entity.getEmpID())){
            repo.save(entity);
        }else {
            throw new RuntimeException("Employee already exist...");
        }
    }

    @Override
    public void deleteEmployee(String id) {
        if (repo.existsById(id)){
            repo.deleteById(id);
        }else {
            throw new RuntimeException("Please check the Employee ID.. no Such as Employee...!");
        }
    }

    @Override
    public void updateEmployee(Employee entity) {
        if(repo.existsById(entity.getEmpID())){
            repo.save(entity);
        }else {
            throw new RuntimeException("No Such as Employee To Update...! Please Check the ID...!");
        }
    }

    @Override
    public Employee searchEmployee(String id) {
        if (repo.existsById(id)){
            return repo.findById(id).get();
        }else {
            throw new RuntimeException("No Employee For "+id+" ...!");
        }
    }

    @Override
    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }
}
