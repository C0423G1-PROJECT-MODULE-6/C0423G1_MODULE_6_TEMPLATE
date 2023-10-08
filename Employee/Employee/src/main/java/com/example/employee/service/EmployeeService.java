package com.example.employee.service;
import com.example.employee.model.Employee;
import com.example.employee.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements IEmployeeService{
    @Autowired
    private IEmployeeRepository employeeRepository;
    @Override
    public Page<Employee> getAllEmployee(Pageable pageable) {
        return employeeRepository.findEmployeeBy(pageable);
    }

    @Override
    public void deleteEmployeeById(int id) {
        employeeRepository.deleteEmployeeById(id);
    }
}
