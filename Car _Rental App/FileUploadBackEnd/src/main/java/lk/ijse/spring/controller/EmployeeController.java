package lk.ijse.spring.controller;

import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.entity.Employee;
import lk.ijse.spring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("avc/employee")
@CrossOrigin
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @PostMapping
    public void saveEmployee(@ModelAttribute Employee employee){
        employeeService.saveEmployee(employee);
    }

    @PutMapping
    public void updateCustomer(@RequestBody Employee employee){
        employeeService.updateEmployee(employee);
    }

    @DeleteMapping(params = {"id"})
    public void deleteCustomer(@RequestParam String id){
        employeeService.deleteEmployee(id);
    }

    @GetMapping(path = "/{id}")
    public Employee searchEmployee(@PathVariable String id){
        return employeeService.searchEmployee(id);
    }

}
