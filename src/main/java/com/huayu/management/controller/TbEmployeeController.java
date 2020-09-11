package com.huayu.management.controller;
import com.huayu.management.entity.TbEmployee;
import com.huayu.management.service.ITbEmployeeService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>
 * 员工表 前端控制器
 * </p>
 *
 * @author Song
 * @since 2020-09-02
 */
@Controller
@RequestMapping("/management/tb-employee")
public class TbEmployeeController {
    @Autowired
    private  ITbEmployeeService employeeService;

    @GetMapping("/logooin.do")
    public String loginall(TbEmployee tbEmployee, Model model){
        UsernamePasswordToken token=new UsernamePasswordToken(tbEmployee.getUsernum(),tbEmployee.getPassword());
        Subject subject= SecurityUtils.getSubject();
                try {
            subject.login(token);
        } catch (UnknownAccountException e) {
            ModelAndView mv=new ModelAndView("error");
            mv.addObject("message","password error!");
            System.out.println("用户不存在"+mv);
            return "redirect:/loghtml/loging.html";
        }
        model.addAttribute("log"+tbEmployee);
        return "redirect:/loghtml/zym.html";
    }

}
