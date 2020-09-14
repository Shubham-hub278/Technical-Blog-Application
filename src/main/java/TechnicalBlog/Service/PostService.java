package TechnicalBlog.Service;

import TechnicalBlog.Model.Post;
import TechnicalBlog.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Service
public class PostService {

        @Autowired
        private PostRepository repository;

    public List<Post> getAllPosts() {
    return repository.getAllPosts();
        // Connection connection=null;
       // try{
          //  Class.forName("org.postgresql.Driver");

            //Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/TechnicalBlog","postgres", "upgrad@123");
            // Statement statement = connection.createStatement();
       //     ResultSet rs = statement.executeQuery("SELECT * FROM posts");
         //   while(rs.next()){
           //     Post post = new Post();
             //   post.setTitle(rs.getString("Title"));
         //       post.setBody(rs.getString("Body"));
    //            posts.add(post);
      //      }
      //  } catch (ClassNotFoundException | SQLException e) {
        //    e.printStackTrace();
       // }
       // finally{
         //   try{
           //     connection.close();
           // }catch(SQLException e){
             //   e.printStackTrace();
            //}
        //}
      //  return posts;
    }
    public Post getLatestPost(){
        return repository.getLatestPost();
    }
    public void createPost(Post newPost){
        newPost.setDate(new Date());
        repository.createPost(newPost);
        System.out.println("New Post: "+ newPost);
    }
    public Post getPost(Integer postID){
        return repository.getPost(postID);
    }
    public void updatePost(Post updatePost){
        updatePost.setDate(new Date());
    repository.updatePost(updatePost);
    }
    public void deletePost(Integer postId){
        repository.deletePost(postId);
    }
}
