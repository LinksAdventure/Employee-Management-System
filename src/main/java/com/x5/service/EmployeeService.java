package com.x5.service;

import com.x5.domain.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
     List<Employee> findALL();

    void saveEmp(Employee employee);

    boolean findbyName(String name);

    Employee findById(Integer id);
}
