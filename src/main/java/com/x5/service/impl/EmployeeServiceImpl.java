package com.x5.service.impl;

import com.x5.dao.DepartmentMapper;
import com.x5.dao.EmployMapper;
import com.x5.domain.Department;
import com.x5.domain.Employee;
import com.x5.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployMapper employMapper;

    @Autowired
    DepartmentMapper departmentMapper;
    @Override
    public List<Employee> findALL() {
        List<Employee> all = employMapper.findAll();
       return all;
    }

    @Override
    public void saveEmp(Employee employee) {
        String name = employee.getDepartment().getName();
        List<Department> byName = departmentMapper.findByName(name);
        if (byName.size() == 1){
            employee.setDepartment(byName.get(0));
        }else {
            throw new RuntimeException("department name duplicate");
        }
        employMapper.save(employee);
    }

    @Override
    public boolean findbyName(String name) {
        List<Employee> byName = employMapper.findByName(name);
        if (byName.isEmpty()){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Employee findById(Integer id) {
        return employMapper.findById(id);
    }

}
