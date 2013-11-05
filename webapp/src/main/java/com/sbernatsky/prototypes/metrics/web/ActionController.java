package com.sbernatsky.prototypes.metrics.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping("/action")
public class ActionController {

    @RequestMapping(value = "/action/{name}.*", method = RequestMethod.GET)
    @ResponseBody
    public String getMovie(@PathVariable String name) {
        return name;
    }

    @RequestMapping(value = "/action.*", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public String getDefaultMovie() {
        return "this is default movie";
    }

}