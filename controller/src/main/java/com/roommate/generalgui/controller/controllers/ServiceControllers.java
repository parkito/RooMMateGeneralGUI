package com.roommate.generalgui.controller.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Artem Karnov @date 06.07.2017.
 *         artem.karnov@t-systems.com
 */
@Controller
public class ServiceControllers {
    @RequestMapping("/signIn")
    public String signIn() {
        return "pages/service/sign-in";
    }

    @RequestMapping("/signUp")
    public String signUp() {
        return "pages/skeleton/sign-up";
    }

    @RequestMapping("/rememberMe")
    public String rememberMe() {
        return "pages/skeleton/forgot-password";
    }

    @RequestMapping("/pageNotFound")
    public String pageNotFound() {
        return "pages/skeleton/404.jsp";
    }

    @RequestMapping("/serverError")
    public String serverError() {
        return "pages/skeleton/500.jsp";
    }
}
