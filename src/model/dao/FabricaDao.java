package model.dao;

import db.DB;
import model.dao.implementacao.VendedorDaoJDBC;

public class FabricaDao {
	
	public static VendedorDao createVendedorDao() {
		
		return new VendedorDaoJDBC(DB.getConnection());
	}

}
