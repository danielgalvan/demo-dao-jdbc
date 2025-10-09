package application;

import java.util.Date;
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
		
		for (Seller obj : sellers) {
			System.out.println(obj);
		}

		System.out.println("");
		
		System.out.println("-----Teste 3 -> seller findAll");
		sellers = sellerDao.findAll();
		
		for (Seller obj : sellers) {
			System.out.println(obj);
		}
		
		System.out.println("");
		
		System.out.println("-----Teste 4 -> seller insert");
		Seller newSeller = new Seller(null, "Homer J. Simpson", "homer@fox.com", new Date(), 4500.00, new Department(3, null));
		sellerDao.insert(newSeller);
		System.out.println("new id = " + newSeller.getId());
		
		System.out.println("");
		
		System.out.println("-----Teste 5 -> seller update");
		newSeller = new Seller(8, "Ash Ketchun", "ash@nintendo.com", new Date(), 3500.00, new Department(4, null));
		sellerDao.update(newSeller);
		System.out.println("alterado o id = " + newSeller.getId());
		
		System.out.println("");
		
		System.out.println("-----Teste 6 -> seller delete");
		sellerDao.deleteById(10);
		System.out.println("deletado o vendedor");
	}
}
