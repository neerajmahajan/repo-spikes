package com.rd.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.rd.pojo.entity.Area;
import com.rd.pojo.entity.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao{

	@Autowired
	@Qualifier("hibernate3AnnotatedSessionFactory")
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(User user) {
		sessionFactory.openSession().save(user);
	}

	@Override
	public List<User> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByUname(String uname) {
		Session session = this.sessionFactory.openSession();
		Query query = session.createQuery("from User u where u.uname=:uname");
		query.setString("uname", uname);
		List<User> user = query.list();
		session.close();
		return user.get(0);
	}

}
