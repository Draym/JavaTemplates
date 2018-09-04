package com.test.servlets;

import com.test.User;
import com.test.UserSession;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "TestServlet", urlPatterns = {"/services"})
public class TestServlet extends HttpServlet {

    @EJB
    UserSession testClientBean;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String gender = request.getParameter("gender");
        Integer age = Integer.parseInt(request.getParameter("age"));
        String action = request.getParameter("action");
        String countryCode = request.getParameter("countryCode");
        String animalId = request.getParameter("animalId");
        String message = request.getParameter("message");
        boolean submitButtonPressed = request.getParameter("submit") != null;
        if (submitButtonPressed) {
            User user = new User();
            user.init(name, password, gender, age, action, countryCode, animalId, message);

            PrintWriter out = response.getWriter();
            out.print(testClientBean.welcomeUser(user));
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
