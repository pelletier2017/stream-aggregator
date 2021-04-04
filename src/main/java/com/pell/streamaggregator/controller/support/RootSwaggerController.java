package com.pell.streamaggregator.controller.support;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootSwaggerController {

    private static final String SWAGGER_UI_PATH = "/swagger-ui.html";

    @GetMapping("/")
    public String redirectToSwaggerApiDocs() {
        return "redirect:" + SWAGGER_UI_PATH;
    }

}
