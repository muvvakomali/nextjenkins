package com.example.employee.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.employee.entity.Employee;

@Service
public class EmployeeService {
	private final List<Employee> employees = new ArrayList<>();
    public Employee addEmployee(Employee employee) {
        employees.add(employee);
        return employee;
    }
    public Employee updateEmployee(int id, Employee updatedEmployee) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                employee.setName(updatedEmployee.getName());
                employee.setSalary(updatedEmployee.getSalary());
                return employee;
            }
        }
        return null;
    }
    public boolean deleteEmployee(int id) {
        return employees.removeIf(employee -> employee.getId() == id);
    }
    public List<Employee> getAllEmployees() {
        return employees;
    }
    public Employee getEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }
}
