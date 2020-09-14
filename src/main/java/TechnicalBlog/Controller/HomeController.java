package TechnicalBlog.Controller;

import TechnicalBlog.Model.Post;
import TechnicalBlog.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.PersistenceUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private final PostService postService;

    public HomeController(PostService postService) {
        this.postService = postService;
    }

    @RequestMapping("/")
    public String getAllPosts(Model model){
        List<Post> posts= postService.getAllPosts();
        model.addAttribute("posts", posts);
     return "index";
    }
}
