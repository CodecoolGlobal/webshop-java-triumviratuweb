package com.codecool.shop.controller;

import org.mindrot.jbcrypt.BCrypt;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = {"/registration"})
public class Registration extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("registration");

        String userName = req.getParameter("user_name");
        String hashedPassword = BCrypt.hashpw(req.getParameter("password"), BCrypt.gensalt(userName.charAt(0)));
        String emailAddress = req.getParameter("email");


        resp.sendRedirect("/");
    }
}