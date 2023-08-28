package com.mohan.rest.webservices.restfulwebservices.socialmedia.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mohan.rest.webservices.restfulwebservices.socialmedia.user.Post;

public interface PostRepository extends JpaRepository<Post, Integer>{

	
}
