package com.lti.finance.services;

import com.lti.finance.entity.Users;
import com.lti.finance.exception.UsersException;

import java.util.List;

public interface UsersServices
{
    public List<Users> getAllUsers() throws UsersException;

    public boolean insertUser(Users user) throws UsersException;

    public List<String> viewCartDetailsByUserId(int userId) throws UsersException;
}
