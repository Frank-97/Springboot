package com.frank.springboot.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * @Package: com.frank.springboot.servlet
 * @ClassName: JackServlet
 * @Author Frank
 * @Data 2022-03-15-10:29
 * @Description:
 */
@WebServlet("/frank/*")
public class JackServlet extends HttpServlet{

    public JackServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("---------------doGet----------------------");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("---------------doPost----------------------");
    }
}
