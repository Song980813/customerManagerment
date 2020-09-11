package com.huayu.management.controller;

import com.huayu.management.entity.TbEmployee;
import com.huayu.management.service.ITbEmployeeService;
import com.huayu.management.utlis.LayuiUtils1;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.UUID;

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
    private ITbEmployeeService tbEmployeeService;

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


    @GetMapping("/savelog.do")
    public String savelogg(TbEmployee tbEmployee,Model model){
          int i=tbEmployeeService.addlog(tbEmployee);
           System.out.println("用户名"+tbEmployee.getUsernum()+"密码"+tbEmployee.getPassword()+"name"+tbEmployee.getName()+"sex"+tbEmployee.getSex()+"age"+tbEmployee.getAge()+"js"+tbEmployee.getPostId()+"电话"+tbEmployee.getPhone()+"tx"+tbEmployee.getIdentificationPhoto());
          System.out.println("tx"+tbEmployee.getIdentificationPhoto());
          System.out.println("当前状态"+i);
        model.addAttribute("log",tbEmployee);
          return "redirect:/loghtml/zym.html";
    }

    @PostMapping("/laAdd.do")
    @ResponseBody
    public LayuiUtils1 LaAdd(@RequestParam("file") MultipartFile pictureFile, HttpServletResponse response, HttpServletRequest request){
        System.out.println("2222222222222222222");
        LayuiUtils1 layuiUtils=new LayuiUtils1();
        try {
            String oriName = pictureFile.getOriginalFilename();
            String extName = oriName.substring(oriName.lastIndexOf("."));
            File file= new File(new File(request.getServletContext().getRealPath("/")).getParent()+"\\"+"image");
            if(!file.exists()){
                file.mkdir();
            }
            String picName = UUID.randomUUID().toString()+extName;
            File file2=new File(file+"\\"+picName);
            pictureFile.transferTo(file2);

            layuiUtils.setCode("200 ");
            layuiUtils.setData(picName);
            return layuiUtils;

        } catch (Exception e) {
            layuiUtils.setCode("0");
            layuiUtils.setMsg("服务器异常");
            e.printStackTrace();
        }
        return layuiUtils;
    }


}
