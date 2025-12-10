package model.dao;

import db.DB;
import model.dao.implementacao.DepartamentoDaoJDBC;
import model.dao.implementacao.VendedorDaoJDBC;

public class FabricaDao {
	
	public static VendedorDao createVendedorDao() {
		
		return new VendedorDaoJDBC(DB.getConnection());
	}
	
	public static DepartamentoDao createDepartamentoDao() {
		
		return new DepartamentoDaoJDBC(DB.getConnection());
	}

}
