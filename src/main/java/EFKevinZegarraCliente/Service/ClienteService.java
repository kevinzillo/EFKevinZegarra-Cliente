package EFKevinZegarraCliente.Service;

import java.util.List;

import EFKevinZegarraCliente.Model.Cliente;

public interface ClienteService {
	List<Cliente> listar();
	Cliente ObtenerId(Integer id);	
	void guardar(Cliente cliente);
	void eliminar(Integer id);
	void actualizar(Cliente cliente);	

}
