package com.aigs.springboot.Dao;

import com.aigs.springboot.Entity.Employee;

import java.util.Collection;

public interface EmployeeDao {
    Collection<Employee> getAllEmployees();

    Employee getEmployeeById(int id);

    void deleteEmployeeById(int id);

    void updateEmployee(Employee employee);

    void createEmployee(Employee employee);
}
