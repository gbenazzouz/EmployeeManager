package com.aigs.springboot.Dao;

import com.aigs.springboot.Entity.Employee;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
@Qualifier("mongoData")
public class EmployeeMongoDaoImpl implements EmployeeDao {

    @Override
    public Collection<Employee> getAllEmployees() {
        return null;
    }

    @Override
    public Employee getEmployeeById(int id) {
        return null;
    }

    @Override
    public void deleteEmployeeById(int id) {

    }

    @Override
    public void updateEmployee(Employee employee) {

    }

    @Override
    public void createEmployee(Employee employee) {

    }
}
