package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("-----Teste 1 -> seller findByIde");
		Seller sellerById = sellerDao.findById(3);		
		System.out.println(sellerById);

		System.out.println("");
		
		System.out.println("-----Teste 2 -> seller findByDepartment");
		List<Seller> sellers = sellerDao.findByDepartment(new Department(2, null));
		
		for (Seller seller : sellers) {
			System.out.println(seller);
		}
		
		System.out.println("");
		
		System.out.println("-----Teste 3 -> seller findAll");
		sellers = sellerDao.findAll();
		
		for (Seller seller : sellers) {
			System.out.println(seller);
		}	
		
	}
}
