package com.x5.test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.x5.dao.EmployMapper;
import com.x5.domain.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class EMPtest {
    @Autowired
    EmployMapper employMapper;

    @Test
    public void findAll() throws JsonProcessingException {
        List<Employee> all = employMapper.findAll();
        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(all);
        System.out.println(s);
    }
}
