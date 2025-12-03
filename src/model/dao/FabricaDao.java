package model.dao;

import model.dao.implementacao.VendedorDaoJDBC;

public class FabricaDao {
	
	public static VendedorDao createVendedorDao() {
		
		return new VendedorDaoJDBC();
	}

}
