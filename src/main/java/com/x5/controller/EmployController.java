package com.x5.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.x5.dao.DepartmentMapper;
import com.x5.domain.Department;
import com.x5.domain.Employee;
import com.x5.domain.Msg;
import com.x5.service.DepartmentService;
import com.x5.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class EmployController {

    @Autowired
    EmployeeService employeeService;


//    /**
//     * 需要返回的有 contextpath
//     * pageinfo
//     * @param model
//     * @return
//     */
//    @RequestMapping("/emps")
//    public String getList(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model){
//        List<Employee> all = employeeService.findALL();
//        PageHelper.startPage(pn, 5);
//        List<Employee> employeeList = employeeService.findALL();
//        PageInfo pageInfo = new PageInfo(employeeList, 5);
//        model.addAttribute("pageInfo", pageInfo);
//        return "list";
//    }
    @GetMapping("/emps")
    public Msg getList(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model){
        PageHelper.startPage(pn, 5);
        List<Employee> employeeList = employeeService.findALL();
        PageInfo pageInfo = new PageInfo(employeeList, 5);
        Msg msg = Msg.success().add("pageInfo", pageInfo);
        return msg;
    }
    @PostMapping("/emp")
    public Msg saveEmp(Employee employee){
        employeeService.saveEmp(employee);
        return Msg.success();
    }
    @GetMapping("/emp")
    public Msg selectEmp(@RequestParam("name") String name){
        boolean b = employeeService.findbyName(name);
        return Msg.success().add("find", b);
    }
    @GetMapping("/emp/{id}")
    public Msg getEmp(@PathVariable("id") Integer integer){
        Employee byId = employeeService.findById(integer);
        return Msg.success().add("emp", byId);

    }
}
