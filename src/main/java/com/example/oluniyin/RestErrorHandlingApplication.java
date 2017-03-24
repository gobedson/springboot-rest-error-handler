package com.example.oluniyin;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.oluniyin.domain.Author;
import com.example.oluniyin.domain.Post;
import com.example.oluniyin.repository.AuthorRepository;
import com.example.oluniyin.repository.PostRepository;

@SpringBootApplication
public class RestErrorHandlingApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestErrorHandlingApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(AuthorRepository authorRepository, PostRepository postRepository) {
		return args -> {
			Author gy = new Author("Godson", "YEBADOKPO", "gobedson1@gmail.com");
			authorRepository.save(gy);
			

			Post post = new Post("Spring Boot Rocks!");
			post.setSlug("spring-boot-rocks");
			post.setTeaser("Post teaser");
			post.setBody("Post Body");
			post.setPostedOn(new Date());
			post.setAuthor(gy);
			postRepository.save(post);
			
			Post rest = new Post("Rest is what all the cool kids are doing");
			rest.setSlug("rest-is-cool");
			rest.setTeaser("Rest teaser");
			rest.setBody("rest body");
			rest.setPostedOn(new Date());
			rest.setAuthor(gy);
			postRepository.save(rest);
			
		};
	}
}
