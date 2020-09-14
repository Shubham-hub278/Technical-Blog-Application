package TechnicalBlog.Controller;

import TechnicalBlog.Model.User;
import TechnicalBlog.Service.PostService;
import TechnicalBlog.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @Autowired
    private PostService postService;

    @Autowired
    private UserService userService;

    @RequestMapping("user/login")
    public String login(){
        return "user/login";
    }
    @RequestMapping("user/registration")
    public String Registration(){
        return "user/registration";
    }

    @RequestMapping(value="user/login", method= RequestMethod.POST)
    public String loginuser(User user){
        if(userService.login(user))
        return "redirect:/posts";
        else
            return "user/login";
    }
    @RequestMapping(value="user/logout", method= RequestMethod.POST)
    public String logout(){
        return "index";
    }
    @RequestMapping(value="user/registration",method= RequestMethod.POST)
    public String UserRegistration(User user)
    { return "user/login";}

}
