package com.example.employee.repository;
import com.example.employee.model.EmployeeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IEmployeeTypeRepository extends JpaRepository<EmployeeType,Integer> {
    @Query(value = "select * from employee_type",nativeQuery = true)
    List<EmployeeType> findAllEmployeeType();
}
