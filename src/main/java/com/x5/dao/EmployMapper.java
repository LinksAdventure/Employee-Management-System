package com.x5.dao;

import com.x5.domain.Employee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface EmployMapper {
    @Select("Select * from emp join dept on d_id = dept_id")
    @Results({
            @Result(property = "department.id", column = "d_id"),
            @Result(property = "department.name", column = "dept_name")
    })
    List<Employee> findAll();

    @Select("select * from emp where name = #{name}")
    List<Employee> findByName(String name);

    @Insert("insert into emp(name, gender, email, d_id) values(#{name}, #{gender}, #{email}, #{department.id})")
    void save(Employee employee);
    @Select("select * from emp join dept on d_id = dept_id where id = #{id}")
    @Results({
            @Result(property = "department.id", column = "d_id"),
            @Result(property = "department.name", column = "dept_name")
    })
    Employee findById(Integer id);
}
