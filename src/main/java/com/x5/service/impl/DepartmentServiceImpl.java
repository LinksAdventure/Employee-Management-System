package com.x5.service.impl;

import com.x5.dao.DepartmentMapper;
import com.x5.domain.Department;
import com.x5.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;

    @Override
    public List<Department> findAllDept() {
        return departmentMapper.findAllDepart();
    }
}
