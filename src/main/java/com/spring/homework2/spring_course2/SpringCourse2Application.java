package com.spring.homework2.spring_course2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * The type Spring course 2 application.
 */
@SpringBootApplication
@EnableMongoRepositories
public class SpringCourse2Application {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(SpringCourse2Application.class, args);
    }

}
