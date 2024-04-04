package com.prakash;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prakash.entity.Category;
import com.prakash.entity.Comment;
import com.prakash.entity.Post;
import com.prakash.entity.Role;
import com.prakash.entity.User;
import com.prakash.entity.dto.CategoryDto;
import com.prakash.entity.dto.CommentDto;
import com.prakash.entity.dto.PostDto;
import com.prakash.entity.dto.RoleDto;
import com.prakash.entity.dto.UserDto;
import com.prakash.service.impl.BloggingServiceImpl;

@RestController
public class BloggingController {
	@Autowired
	private BloggingServiceImpl bloggingServiceImpl;
	
	
	@PostMapping("/user/create")
	public User createUser(@RequestBody UserDto userDto) {
		return bloggingServiceImpl.addUser(userDto);	
	}
	
	@PostMapping("/post/create")
	public Post createPost(@RequestBody PostDto postDto) {
		return bloggingServiceImpl.addPost(postDto);	
	}
	@PostMapping("/role/create")
	public Role createRole(@RequestBody RoleDto roleDto) {
		return bloggingServiceImpl.addRole(roleDto);	
	}
	@PostMapping("/category/create")
	public Category createCategory(@RequestBody CategoryDto categoryDto) {
		return bloggingServiceImpl.addCategory(categoryDto);	
	}
	@PostMapping("/comment/create")
	public Comment createComment(@RequestBody CommentDto commentDto) {
		return bloggingServiceImpl.addComment(commentDto);	
	}
	@GetMapping("/user/all")
	public List<User> allUser() {
		List<User> users=bloggingServiceImpl.allUser();	
		return users;
	}
	

}
