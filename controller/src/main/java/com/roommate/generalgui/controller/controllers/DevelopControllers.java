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
    public String welcome() {
        return "pages/skeleton/LeftPanel";
    }
}
