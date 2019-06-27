package com.schoolofnet.Helpdesk.services;

import java.util.List;

import com.schoolofnet.Helpdesk.models.User;

public interface UserService {
	
	public List<User> findAll();
	public User create(User user);
	public Boolean delete(Long id);
	public Boolean update(Long id, User user);
	public User show(Long id);
}
