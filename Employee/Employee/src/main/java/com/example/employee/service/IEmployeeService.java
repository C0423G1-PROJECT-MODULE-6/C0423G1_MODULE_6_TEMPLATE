package com.example.employee.service;
import com.example.employee.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IEmployeeService {
    Page<Employee> getAllEmployee(Pageable pageable);
    void deleteEmployeeById(int id);
}
