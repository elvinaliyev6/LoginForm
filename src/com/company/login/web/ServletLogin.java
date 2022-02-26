package com.company.login.web;

import com.company.login.bean.LoginBean;
import com.company.login.database.LoginDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletLogin", value = "/login")
public class ServletLogin extends HttpServlet {
    private LoginDao loginDao=new LoginDao();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String username=request.getParameter("username");
    String password=request.getParameter("password");

        LoginBean login=new LoginBean();
        login.setUsername(username);
        login.setPassword(password);

        try{
            if(loginDao.validate(login)){
                response.sendRedirect("loginsuccess.jsp");
            }else{
                HttpSession session=request.getSession();
                response.sendRedirect("login.jsp");
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
