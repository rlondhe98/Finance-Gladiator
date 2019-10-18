package com.lti.fg.services;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.fg.daos.UserDao;
import com.lti.fg.entities.Product;
import com.lti.fg.entities.User;
import com.lti.fg.exceptions.UsersException;

@Service
@Transactional(propagation=Propagation.REQUIRED)
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserDao dao;
    
    @Override
    public List<User> getAllUsers() throws UsersException {
        return dao.getAllUsers();
    }

    @Override
    public boolean insertUser(User user) throws UsersException {
        return dao.insertUser(user);
    }

    @Override
    public List<Product> viewCartDetailsByUserId(int userId) throws UsersException {
        return dao.viewCartDetailsByUserId(userId);
    }

	@Override
	public boolean logIn(User user) throws UsersException {
		
		return dao.logIn(user);
	}

	
}
