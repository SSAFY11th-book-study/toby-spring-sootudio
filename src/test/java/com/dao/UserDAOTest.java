package com.dao;

import com.domain.User;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class UserDAOTest {
    @Test
    public void addAndGet() throws SQLException, ClassNotFoundException {
        UserDAO userDao = new UserDAO();
        User user = new User();
        userDao.add(user);
    }
}