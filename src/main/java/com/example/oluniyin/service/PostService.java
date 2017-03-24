package com.example.oluniyin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.oluniyin.domain.Post;

@Service
public interface PostService {

	List<Post> list();
	Post create(Post post);
	Post read (Long id);
	Post update(Long id, Post post);
	void delete(Long id);
}
