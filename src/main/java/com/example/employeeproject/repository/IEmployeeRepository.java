package com.example.employeeproject.repository;

import com.example.employeeproject.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query(value = "SELECT * from employee e, employee_department ed WHERE e.id = ed.employee_id AND ed.department = :department", nativeQuery = true)
    List<Employee> findEmployeeByDepartment( String department);

}
