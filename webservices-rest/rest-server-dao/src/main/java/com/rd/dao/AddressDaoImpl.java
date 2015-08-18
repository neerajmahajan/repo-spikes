package com.rd.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.rd.pojo.entity.Area;

@Component("addressDao")
@Repository
public class AddressDaoImpl implements AddressDao{

	@Autowired
	@Qualifier("hibernate3AnnotatedSessionFactory")
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void save(Area area) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Area> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Area> listByPincode(String pin) {
		 Session session = this.sessionFactory.openSession();
	        Query query = session.createQuery("from Area a where a.pinCode=:pin");
	        query.setString("pin", pin);
	        List<Area> areas = query.list();
	        session.close();
		return areas;
	}



}
