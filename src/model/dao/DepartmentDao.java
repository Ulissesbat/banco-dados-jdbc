package model.dao;

import java.util.List;

public interface DepartmentDao {

	void insert (DepartmentDao obj);
	void update(DepartmentDao obj);
	void deletById(Integer id);
	DepartmentDao findById(Integer id);
	List<DepartmentDao> findAll();
}
