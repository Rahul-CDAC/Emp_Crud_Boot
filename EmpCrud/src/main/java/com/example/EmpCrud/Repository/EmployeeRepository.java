package com.example.EmpCrud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EmpCrud.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}

