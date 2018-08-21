package com.lkx.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lkx.bean.Employee;
import com.lkx.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Author: LiangKaiXuan
 * @Date: 2018/8/20 11:25
 */

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;
    /**
     * 查询员工数据，分页查询
     * @return
     */
    @RequestMapping("/emps")
    private String getEmps(@RequestParam(value = "pn",defaultValue = "1")Integer pn, Model model){
        //引入pagehelper分页插件
        PageHelper.startPage(pn,5);
        List<Employee> emps = employeeService.getAll();
        PageInfo page = new PageInfo(emps,5);
        model.addAttribute("pageInfo",page);
        //page.getNavigatepageNums();
        return "list";
    }
}
