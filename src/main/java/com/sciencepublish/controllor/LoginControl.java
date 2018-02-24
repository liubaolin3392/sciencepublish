package com.sciencepublish.controllor;

import com.sciencepublish.model.User;
import com.sciencepublish.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by 47163 on 2017/12/20.
 */
@Controller
@EnableAutoConfiguration
public class LoginControl
{
    @Autowired
    private UserService regService;
    @RequestMapping("/")
    String home(Map<String,Object> map)
    {
        return "index";
    }
    @RequestMapping("/login")
    @ResponseBody String login(@ModelAttribute User user)
    {
        String isOk = "SUCESS";
        User loginUser = regService.getUserByUserId(user.getUserId());
        if (loginUser == null)
        {
            isOk = "FALSE";
        }
        return isOk;
    }
}
