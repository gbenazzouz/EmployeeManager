package com.aigs.springboot.Service;

import com.aigs.springboot.Dao.EmployeeDao;
import com.aigs.springboot.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class EmployeeService {

    @Autowired
    @Qualifier("fakeData")
    private EmployeeDao employeeDao;

    public Collection<Employee> getAllEmployees() {
        return employeeDao.getAllEmployees();
    }

    public Employee getEmployeeById(int id) {
        return employeeDao.getEmployeeById(id);
    }

    public void deleteEmployeeById(int id) {
        employeeDao.deleteEmployeeById(id);
    }

    public void updateEmployee(Employee employee) {
        employeeDao.updateEmployee(employee);
    }

    public void insertEmployee(Employee employee) {
        employeeDao.createEmployee(employee);
    }


}
