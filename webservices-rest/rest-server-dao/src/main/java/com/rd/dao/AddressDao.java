package com.rd.dao;

import java.util.List;

import com.rd.pojo.entity.Area;

public interface AddressDao {

	public void save(Area area);

	public List<Area> list();

	public List<Area> listByPincode(String pin);

}
