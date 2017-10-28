package cn.tyler.mybatis_spring.service;

import cn.tyler.mybatis_spring.vo.EmpVO;

public interface MybatisSpringDemoService
{
    EmpVO findEmpByNumber(int number);
}
