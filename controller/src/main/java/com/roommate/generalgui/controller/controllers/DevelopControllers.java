package com.roommate.generalgui.controller.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Artem Karnov @date 7/6/17.
 *         artem.karnov@t-systems.com
 */
@Controller
public class DevelopControllers {
    @RequestMapping("/leftBar")
    public String leftBar() {
        return "pages/skeleton/LeftPanel";
    }

    @RequestMapping("/upperBar")
    public String upperBar() {
        return "pages/skeleton/UpperPanel";
    }

    @RequestMapping("/signin")
    public String signIn() {
        return "pages/service/sign-in";
    }

    @RequestMapping("/signup")
    public String signUp() {
        return "pages/service/sign-up";
    }
}
