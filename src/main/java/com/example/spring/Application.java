package com.example.spring;

import com.example.spring.domain.Comment;
import com.example.spring.domain.Link;
import com.example.spring.repository.CommentRepository;
import com.example.spring.repository.LinkRepository;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing
public class Application {

    private static final Logger log = LoggerFactory.getLogger(SpringApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }

    @Bean
    CommandLineRunner runner(LinkRepository linkRepository, CommentRepository commentRepository) {
        return args -> {
            Link link = new Link("Getting started with spring boot 2", "https://www.baeldung.com/spring-boot-console-app");
            linkRepository.save(link);

            Comment comment = new Comment("This tutorial is awesome!", link);
            commentRepository.save(comment);
            link.addComment(comment);

        };
    }

}
