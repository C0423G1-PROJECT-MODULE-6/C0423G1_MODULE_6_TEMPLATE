package com.example.employee.controller;
import com.example.employee.model.Employee;
import com.example.employee.service.IEmployeeService;
import com.example.employee.service.IEmployeeTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin("*")
public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;
    @Autowired
    private IEmployeeTypeService employeeTypeService;
    @GetMapping("/employee")
    public ResponseEntity<Page<Employee>> getEmployeeList(@RequestParam(name = "page",defaultValue = "0") int page){
        Pageable pageable = PageRequest.of(page,5);
        Page<Employee> employeePage = employeeService.getAllEmployee(pageable);
        return new ResponseEntity<>(employeePage, HttpStatus.OK);
    }
    @DeleteMapping("/employee/{id}")
    public ResponseEntity<Employee> deleteEmployeeById(@PathVariable int id){
        employeeService.deleteEmployeeById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
