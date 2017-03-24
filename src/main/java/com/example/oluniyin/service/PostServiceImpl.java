package com.example.oluniyin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.oluniyin.domain.Post;
import com.example.oluniyin.repository.PostRepository;

@Service
public class PostServiceImpl implements PostService {

	PostRepository postRepository;

	public  PostServiceImpl(PostRepository postRepository) {
		this.postRepository = postRepository;
	}

	@Override
	public List<Post> list() {

		return postRepository.findAllByOrderByPostedOnDesc();
	}

	@Override
	public Post create(Post post) {
	
		return null;
	}

	@Override
	public Post read(Long id) {

		return null;
	}

	@Override
	public Post update(Long id, Post post) {
		
		return null;
	}

	@Override
	public void delete(Long id) {


	}

}
