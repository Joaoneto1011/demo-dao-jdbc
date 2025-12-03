package aplicacao;

import model.dao.FabricaDao;
import model.dao.VendedorDao;
import model.entities.Vendedor;

public class ProgramaPrincipal {
	
	public static void main(String[] args) {
		
		VendedorDao vendedorDao = FabricaDao.createVendedorDao();
		
		System.out.println("=== TESTE 1: vendedor findById ===");
		Vendedor vendedor = vendedorDao.findById(3);
		System.out.println(vendedor);
	}

}
