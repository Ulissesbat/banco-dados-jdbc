package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("\n=== TEST 1: department findById =====");
		Department department = departmentDao.findById(1);
		System.out.println(department);
		
		System.out.println("\n=== TEST 2: department findAll =====");
		List<Department> list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
		
		/*System.out.println("\n=== TEST 3: department insert =====");
		Department newdepartment = new Department(0, "Foods");
		departmentDao.insert(newdepartment);
		System.out.println("Inserted! New id = " + newdepartment.getId());*/

		System.out.println("\n=== TEST 5: department update =====");
		
		department = departmentDao.findById(4);
		department.setName("Livro");
		departmentDao.update(department);
		System.out.println("Update completed");
	}

}
