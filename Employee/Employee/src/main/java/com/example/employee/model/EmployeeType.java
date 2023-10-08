package com.example.employee.model;
import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.*;
import java.util.List;

@Entity
public class EmployeeType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String name;
    @OneToMany(mappedBy = "employeeType")
    @JsonBackReference
    private List<Employee> employeeList;

    public EmployeeType() {
    }

    public EmployeeType(int id, String name, List<Employee> employeeList) {
        this.id = id;
        this.name = name;
        this.employeeList = employeeList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
