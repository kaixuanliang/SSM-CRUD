package com.lkx.test;

import com.lkx.dao.DepartmentMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试dao层
 * @Author: LiangKaiXuan
 * @Date: 2018/8/15 21:03
 */
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MapperTest {
    /**
     * 测试department
     */
    public void testCrud(){
        //1、创建SpringIOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2、从容器中获取mapper
        DepartmentMapper bean = ioc.getBean(DepartmentMapper.class);

    }
}
