package com.frank.springboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Package: com.frank.springboot.Controller
 * @ClassName: SysController
 * @Author Frank
 * @Data 2022-03-30-22:23
 * @Description:
 */
@RestController
public class SysController {

    @RequestMapping("/test/{name}")
    public String test(@PathVariable("name") String name, HttpServletRequest request){
        System.out.println(request.getMethod());
        return name+"test";
    }

    @RequestMapping("/query/user")
    public String getUser(){
        return "SysController.getUser 8081";
    }

}
