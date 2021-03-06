package com.mastery.java.task.service;

import com.mastery.java.task.dto.Employee;

import java.util.List;

public interface EmployeeService {

    void addEmployee(Employee employee);

    void deleteEmployee(Long id);

    void updateEmployee(Long id, Employee updatedEmployee);

    List<Employee> getAllEmployees(String firstName, String lastName);

    Employee getEmployeeById(Long id);

    void addEmployeeToQueue(Employee employee);

    void readEmployeeFromQueue(Employee employee);

}
