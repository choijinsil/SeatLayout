package com.myway.seat.api;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.annotations.ApiIgnore;

@ApiIgnore
@Controller
public class DefaultController {
	@RequestMapping("/")
    public String home() {
        return "redirect:swagger-ui.html";
    }
}
