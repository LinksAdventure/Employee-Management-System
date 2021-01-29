package com.x5.service;

import com.x5.dao.DepartmentMapper;
import com.x5.domain.Department;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface DepartmentService {

    List<Department> findAllDept();


}
