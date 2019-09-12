package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Department> list = new ArrayList<>();
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("==== TEST 1: department findById ====");
		Department dep = departmentDao.findById(2);
		System.out.println(dep);

		System.out.println("==== TEST 2: department findAll ====");
		list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("==== TEST 3: department insert ====");
		Department dep1 = new Department(null, "Rock");
		departmentDao.insert(dep1);
		System.out.println("Inserted! New id = " + dep1.getId());
		
		System.out.println("==== TEST 4: department update ====");
		dep1 = departmentDao.findById(1);
		dep1.setName("Music");
		departmentDao.update(dep1);
		System.out.println("Update completed");
		
		System.out.println("==== TEST 5: department delete ====");
		System.out.println("Enter id for delete test:");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");
	}

}
