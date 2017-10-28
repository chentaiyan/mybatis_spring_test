package cn.tyler.mybatis_spring.service.impl;

import javax.inject.Inject;
import javax.inject.Named;

import cn.tyler.mybatis_spring.mapper.MapperDemo;
import cn.tyler.mybatis_spring.service.MybatisSpringDemoService;
import cn.tyler.mybatis_spring.vo.EmpVO;

@Named
public class MybatisSpringDemoServiceImpl implements MybatisSpringDemoService
{

    @Inject
    private MapperDemo mapperDemo;
    
    public EmpVO findEmpByNumber(int number)
    {
	return mapperDemo.findEmpByNumber(number);
    }

}
