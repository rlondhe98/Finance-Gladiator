package com.lti.finance.services;

import com.lti.finance.daos.UsersDao;
import com.lti.finance.daos.UsersDaoImpl;
import com.lti.finance.entity.Users;
import com.lti.finance.exception.UsersException;

import java.util.List;

public class UsersServicesImpl implements UsersServices
{
    private UsersDao dao;
    public UsersServicesImpl()
    {
        dao = new UsersDaoImpl();
    }

    @Override
    public List<Users> getAllUsers() throws UsersException {
        return dao.getAllUsers();
    }

    @Override
    public boolean insertUser(Users user) throws UsersException {
        return dao.insertUser(user);
    }

    @Override
    public List<String> viewCartDetailsByUserId(int userId) throws UsersException {
        return dao.viewCartDetailsByUserId(userId);
    }
}
