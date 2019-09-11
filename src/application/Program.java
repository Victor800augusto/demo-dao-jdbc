package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {


		SellerDao selleDao = DaoFactory.createSellerDao();
		
		Seller seller = selleDao.findById(3);

		System.out.println(seller);
		

	}

}
