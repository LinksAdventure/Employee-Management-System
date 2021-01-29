package com.x5.controller;

import com.x5.domain.Department;
import com.x5.domain.Msg;
import com.x5.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
@RestController
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @GetMapping("/depts")
    public Msg getDepart(){
        List<Department> allDept = departmentService.findAllDept();
        Msg msg = Msg.success().add("deptInfo", allDept);
        return msg;
    }

}
