package spring.boot;

import com.spring.boot.WebConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * Created by jianhao on 2018/1/8.
 */
@SpringBootApplication
@Import(WebConfig.class)
public class App {
    public static void main(String[] args){
        SpringApplication.run(App.class, args);

    }
}
