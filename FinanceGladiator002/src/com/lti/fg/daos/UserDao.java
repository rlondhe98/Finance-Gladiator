package com.lti.fg.daos;

import java.util.List;

import com.lti.fg.entities.Product;
import com.lti.fg.entities.User;
import com.lti.fg.exceptions.UsersException;

public interface UserDao {
	 public List<User> getAllUsers() throws UsersException;

	    public boolean insertUser(User user) throws UsersException;
	    public List<Product> viewCartDetailsByUserId(int userId) throws UsersException;
	    public boolean logIn(User user)throws UsersException;
}
