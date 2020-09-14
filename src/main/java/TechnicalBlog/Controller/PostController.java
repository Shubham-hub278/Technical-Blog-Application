package TechnicalBlog.Controller;

import TechnicalBlog.Model.Post;
import TechnicalBlog.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {
    @Autowired
    private PostService postService;

        @RequestMapping("posts")
        public String getUserPosts(Model model){
        List<Post> posts=postService.getAllPosts();
        model.addAttribute("posts", posts);
        return "posts";
    }
        @RequestMapping("/posts/newPost")
        public String newPost(){
        return "posts/create";
    }

        @RequestMapping(value="/posts/create", method=RequestMethod.POST)
        public String createPost(Post newPost){
        postService.createPost(newPost);
        return "redirect:/posts"; }

        @RequestMapping(value="/editPost",method=RequestMethod.GET)
        public String editPost(@RequestParam(name = "postId") Integer postId, Model model){
           Post post=postService.getPost(postId);
           model.addAttribute("post",post);
            return "posts/edit";
        }

        @RequestMapping(value="/editPost", method=RequestMethod.PUT)
        public String editPostsubmit(@RequestParam(name="postId") Integer postId, Post post){
        post.setID(postId);
        postService.updatePost(post);
        return "redirect:/posts";
        }
        @RequestMapping(value="/deletePost", method=RequestMethod.DELETE)
        public String deletepostsubmit(@RequestParam(name="postId") Integer postId){
        postService.deletePost(postId);
        return "redirect:/posts";
        }
    }
