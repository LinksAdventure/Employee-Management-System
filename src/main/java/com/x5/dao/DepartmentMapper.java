package com.x5.dao;

import com.x5.domain.Department;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DepartmentMapper {
    @Select("select * from dept")
    @Results({
            @Result(property = "id", column = "dept_id"),
            @Result(property = "name", column = "dept_name")
    })
    List<Department> findAllDepart();

    @Select("select * from dept where dept_name = #{name}")
    @Results({
            @Result(property = "id", column = "dept_id"),
            @Result(property = "name", column = "dept_name")
    })
    List<Department> findByName(String name);
}
