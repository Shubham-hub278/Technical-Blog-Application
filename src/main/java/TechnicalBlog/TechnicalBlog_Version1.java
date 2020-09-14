package TechnicalBlog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
public class TechnicalBlog_Version1 {

    public static void main(String [] args){
        SpringApplication.run(TechnicalBlog_Version1.class, args);
    }
}
