package aplicacao;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.FabricaDao;
import model.dao.VendedorDao;
import model.entities.Departamento;
import model.entities.Vendedor;

public class ProgramaPrincipal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		VendedorDao vendedorDao = FabricaDao.createVendedorDao();
		
		System.out.println("=== TESTE 1: vendedor findById ===");
		Vendedor vendedor = vendedorDao.findById(3);
		System.out.println(vendedor);
		
		System.out.println("\n=== TESTE 2: vendedor findByDepartamento ===");
		
		Departamento departamento = new Departamento(2, null);
		List<Vendedor> list = vendedorDao.findByDepartamento(departamento);
		
		for (Vendedor obj : list) {
			
			System.out.println(obj);
		}
		
	    System.out.println("\n=== TESTE 3: vendedor findAll ===");
		
		list = vendedorDao.findAll();
		
		for (Vendedor obj : list) {
			
			System.out.println(obj);
		}
		
		System.out.println("\n=== TESTE 4: vendedor INSERT ===");
		
		Vendedor novoVendedor = new Vendedor(null, "Greg", "greg@gmail.com", new Date(), 4000.0, departamento);
		vendedorDao.insert(novoVendedor);
		System.out.println("Inserted! Novo id = " + novoVendedor.getId());
		
		System.out.println("\n=== TESTE 5: vendedor UPDATE ===");
		
		vendedor = vendedorDao.findById(1);
		vendedor.setNome("Joao Neto");
		vendedor.setSalarioBase(3000.0);
		vendedorDao.update(vendedor);
		System.out.println("Update Completo");
		
		System.out.println("\n=== TESTE 6: vendedor DELETE ===");
		
		System.out.println("Entre com id para excluir o teste: ");
		int id = sc.nextInt();
		vendedorDao.deleteById(id);
		System.out.println("Delete completo");
		
		sc.close();
	}
	
}

