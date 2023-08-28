package com.mohan.rest.webservices.restfulwebservices.socialmedia.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mohan.rest.webservices.restfulwebservices.socialmedia.user.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	
}
