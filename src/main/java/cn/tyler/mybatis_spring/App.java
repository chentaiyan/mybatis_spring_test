package cn.tyler.mybatis_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tyler.mybatis_spring.service.MybatisSpringDemoService;
import cn.tyler.mybatis_spring.vo.EmpVO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	MybatisSpringDemoService bean = (MybatisSpringDemoService) applicationContext.getBean("mybatisSpringDemoServiceImpl");
	
	EmpVO empVO = bean.findEmpByNumber(7369);
	
	System.out.println(empVO);
	
    }
}
