package com.sciencepublish.controllor;

import com.sciencepublish.model.User;
import com.sciencepublish.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * Created by 47163 on 2017/12/20.
 */
@Controller
@EnableAutoConfiguration
public class HelloWorld
{
    @Autowired
    private UserService regService;
    @RequestMapping("/")
    String home(Map<String,Object> map)
    {
        return "index";
    }
}
