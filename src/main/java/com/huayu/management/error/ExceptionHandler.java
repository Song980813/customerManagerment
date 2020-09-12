package com.huayu.management.error;

public class ExceptionHandler {
/*    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        //1、判断是哪一种异常
        String msg="";
        if(e instanceof MyExecption){
            MyExecption myExecption=(MyExecption)e;
            msg=myExecption.getMsg();
        }
        //2、发送邮件和短信通知到相关人员

        //3、跳转到友好的页面，并展示描述信息
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("error",msg);
        modelAndView.setViewName("/error/500.html");
        return modelAndView;
    }*/
}