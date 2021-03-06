package com.greetgo.eschool.controller;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws IOException {

        //Condition to avoid loop redirection
        if(!request.getRequestURI().equals("/login")) {
            if (request.getSession().getAttribute("user") == null) {
                response.sendRedirect("/login");

                return false;
            }
        }

        return true;
    }
}
