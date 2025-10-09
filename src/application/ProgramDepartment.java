package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class ProgramDepartment {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("-----Teste 1 -> department findByIde");
		Department department = departmentDao.findById(3);
		System.out.println(department);

		System.out.println("");
		
		System.out.println("-----Teste 2 -> department findAll");
		List<Department> departments = departmentDao.findAll();
		
		for (Department obj : departments) {
			System.out.println(obj);
		}
		
		System.out.println("");
		
		System.out.println("-----Teste 3 -> department insert");
		Department newDepartment = new Department(null, "Pokebolas");
		departmentDao.insert(newDepartment);
		System.out.println("new id = " + newDepartment.getId());
		
		System.out.println("");
		
		System.out.println("-----Teste 4 -> department update");
		newDepartment = new Department(6, "Potions");
		departmentDao.update(newDepartment);
		System.out.println("alterado o id = " + newDepartment.getId());
		
		System.out.println("");
		
		System.out.println("-----Teste 6 -> department delete");
		departmentDao.deleteById(15);
		System.out.println("deletado o departmento");

	}

}
