package com.rd.dao;

import java.util.List;

import com.rd.pojo.entity.User;

public interface UserDao {

	public void save(User user);

	public List<User> list();

	public User findByUname(String uname);

}
