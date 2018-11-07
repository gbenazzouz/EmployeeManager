package com.aigs.springboot.Dao;

import com.aigs.springboot.Entity.Employee;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


@Repository
@Qualifier("fakeData")
public class EmployeeFakeDaoImpl implements EmployeeDao {

    private static Map<Integer, Employee> employees;

    // initialize it in a static bloc
    {
        employees = new HashMap<Integer, Employee>() {
            {
                put(1, new Employee(1, "Anne Dupond", 20));
                put(2, new Employee(2, "Albert Thomas", 35));
            }
        };
    }

    @Override
    public Collection<Employee> getAllEmployees() {
        return employees.values();
    }


    @Override
    public Employee getEmployeeById(int id) {
        return employees.get(id);
    }

    @Override
    public void deleteEmployeeById(int id) {
        employees.remove(id);
    }

    @Override
    public void updateEmployee(Employee employee) {
        Employee e = getEmployeeById(employee.getId());

        e.setName(employee.getName());
        e.setAge(employee.getAge());
        employees.put(e.getId(), e);

    }


    @Override
    public void createEmployee(Employee employee) {
        employees.put(employee.getId(), employee);
    }
}
