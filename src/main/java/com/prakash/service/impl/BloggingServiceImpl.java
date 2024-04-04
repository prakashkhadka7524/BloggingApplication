package com.prakash.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
import com.prakash.repo.CategoryRepo;
import com.prakash.repo.CommentRepo;
import com.prakash.repo.PostRepo;
import com.prakash.repo.RoleRepo;
import com.prakash.repo.UserRepo;
import com.prakash.service.BloggingService;
@Service
public class BloggingServiceImpl implements BloggingService {
	@Autowired
	private UserRepo userRepo;
	@Autowired
	private RoleRepo roleRepo;
	@Autowired
	private PostRepo postRepo;
	@Autowired
	private CommentRepo commentRepo;
	@Autowired
	private CategoryRepo categoryRepo;

	@Override
	public User addUser(UserDto userDto) {
		User user= new User();
		BeanUtils.copyProperties(userDto, user);
		User saveUser=userRepo.save(user);
		return saveUser;
	}

	@Override
	public Role addRole(RoleDto roleDto) {
		Role role= new Role();
		BeanUtils.copyProperties(roleDto, role);
		Role saveRole=roleRepo.save(role);
		return saveRole;
	}

	@Override
	public Post addPost(PostDto postDto) {
		Post post= new Post();
		BeanUtils.copyProperties(postDto, post);
		Post savePost=postRepo.save(post);
		return savePost;
	}

	@Override
	public Comment addComment(CommentDto commentDto) {
		Comment comment= new Comment();
		BeanUtils.copyProperties(commentDto, comment);
		Comment saveComment=commentRepo.save(comment);
		return saveComment;
	}

	@Override
	public Category addCategory(CategoryDto categoryDto) {
		Category category= new Category();
		BeanUtils.copyProperties(categoryDto, category);
		Category saveCategory=categoryRepo.save(category);
		return saveCategory;
	}

	@Override
	public List<User> allUser() {
		List<User> users=userRepo.findAll();
		for (User user : users) {
			
		}
		return users;
	}

	@Override
	public List<Role> allRole() {
		List<Role> roles=roleRepo.findAll();
		for (Role role : roles) {
			
		}
		return roles;
	}

	@Override
	public List<Post> allPost() {
		List<Post> posts=postRepo.findAll();
		for (Post post : posts) {
			
		}
		return posts;
	}

	@Override
	public List<Comment> allComment() {
		List<Comment> comments=commentRepo.findAll();
		for (Comment comment : comments) {
			
		}
		return comments;
	}

	@Override
	public List<Category> allCategory() {
		List<Category> categories=categoryRepo.findAll();
		for (Category category : categories) {
			
		}
		return categories;
	}

	@Override
	public Optional<User> findUserById(long userId) {
		Optional<User> user= userRepo.findById(userId);
		if(user.isPresent()) {
			return user;
		}
		else
			
		return null;
	}

	@Override
	public Optional<Role> findRoleById(long roleId) {
		Optional<Role> role= roleRepo.findById(roleId);
		if(role.isPresent()) {
			return role;
		}
		else
			
		return null;
	}

	@Override
	public Optional<Comment> findCommentById(long commentId) {
		Optional<Comment> comment= commentRepo.findById(commentId);
		if(comment.isPresent()) {
			return comment;
		}
		else
			
		return null;
	}

	@Override
	public Optional<Category> findCategoryById(long categoryId) {
		Optional<Category> category= categoryRepo.findById(categoryId);
		if(!category.isPresent()) {
			return category;
		}
		else
			
		return null;
	}

	@Override
	public Optional<Post> findPostById(long postId) {
		Optional<Post> post= postRepo.findById(postId);
		if(post.isPresent()) {
			return post;
		}
		else
			
		return null;
	}

	@Override
	public User updateUser(long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role updateRole(long roleId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post updatePost(long postId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Comment updateComment(long commentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category updateCategory(long categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(long userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteRole(long roleId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePost(long postId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteComment(long commentId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCategory(long categoryId) {
		// TODO Auto-generated method stub
		
	}

	

}
