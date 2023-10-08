package com.example.employee.controller;
import com.example.employee.model.EmployeeType;
import com.example.employee.service.IEmployeeTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@CrossOrigin("*")
public class EmployeeTypeController {
    @Autowired
    private IEmployeeTypeService employeeTypeService;

    @GetMapping("/employeeType")
    public ResponseEntity<List<EmployeeType>> getEmployeeTypeList(){
        List<EmployeeType> employeeTypeList = employeeTypeService.getAllEmployeeType();
        if (employeeTypeList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(employeeTypeList, HttpStatus.OK);
    }
}
