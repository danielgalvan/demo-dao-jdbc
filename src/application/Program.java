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
		Seller seller = sellerDao.findById(3);		
		System.out.println(seller);

		System.out.println("");
		
		System.out.println("-----Teste 2 -> seller findByDepartment");
		List<Seller> sellers = sellerDao.findByDepartment(new Department(2, null));
		
		for (Seller forSeller : sellers) {
			System.out.println(forSeller);
		}		
		
	}
}
