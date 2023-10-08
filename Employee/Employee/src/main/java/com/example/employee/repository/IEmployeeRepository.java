package com.example.employee.repository;
import com.example.employee.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
public interface IEmployeeRepository extends JpaRepository<Employee,Integer> {
    @Query(value = "select * from employee",nativeQuery = true)
    Page<Employee> findEmployeeBy(Pageable pageable);

    @Transactional
    @Modifying
    @Query(value = "delete from employee where id= :id",nativeQuery = true)
    void deleteEmployeeById(@Param(value = "id") int id);
}
