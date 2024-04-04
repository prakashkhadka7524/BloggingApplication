package com.prakash.service;

import java.util.List;
import java.util.Optional;

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

public interface BloggingService {
	
	public User addUser(UserDto userDto);
	public Role addRole(RoleDto roleDto);
	public  Post addPost(PostDto postDto);
	public Comment addComment(CommentDto commentDto);
	public Category addCategory(CategoryDto categoryDto);
	
	public List<User> allUser();
	public List<Role> allRole();
	public List<Post> allPost();
	public List<Comment> allComment();
	public List<Category> allCategory();
	
	
	public Optional<User> findUserById(long userId);
	public Optional<Role> findRoleById(long roleId);
	public Optional<Post> findPostById(long postId);
	public Optional<Comment> findCommentById(long commentId);
	public Optional<Category> findCategoryById(long categoryId);
	
	public User updateUser(long userId);
	public Role updateRole(long roleId);
	public Post updatePost(long postId);
	public Comment updateComment(long commentId);
	public Category updateCategory(long categoryId);
	
	
	public void deleteUser(long userId);
	public void deleteRole(long roleId);
	public void deletePost(long postId);
	public void deleteComment(long commentId);
	public void deleteCategory(long categoryId);
	
	
	

}
