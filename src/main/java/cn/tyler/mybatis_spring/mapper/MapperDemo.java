package cn.tyler.mybatis_spring.mapper;

import org.apache.ibatis.annotations.Param;

import cn.tyler.mybatis_spring.vo.EmpVO;

public interface MapperDemo
{

    EmpVO findEmpByNumber(@Param("number")int number);
}
