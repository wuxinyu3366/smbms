package com.wxy.servlet.user;


import com.wxy.pojo.User;
import com.wxy.service.user.UserService;
import com.wxy.service.user.UserServiceImpl;
import com.wxy.util.Constants;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Administrator
 * @Auther: wuxy
 * @Date: 2021/1/27 - 01 - 27 - 15:42
 * @Description: com.wxy.servlet.user
 * @version: 1.0
 */
public class LoginServlet extends HttpServlet {
    //Servlet控制层，调用业务层代码

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("LoginServlet start!!============ " );
        //获取用户名和密码
        String userCode = req.getParameter("userCode");
        String userPassword = req.getParameter("userPassword");

        //调用service方法，进行用户匹配
        UserService userService = new UserServiceImpl();
        User user = userService.login(userCode,userPassword);

        if(null != user){//登录成功
            //放入session
            req.getSession().setAttribute(Constants.USER_SESSION,user);
            //页面跳转（frame.jsp）
            resp.sendRedirect("jsp/frame.jsp");
        }else{
            //页面跳转（login.jsp）带出提示信息--转发
            req.setAttribute("error", "用户名或密码不正确");
            req.getRequestDispatcher("login.jsp").forward(req,resp);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }


}
