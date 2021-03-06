package bean;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateful;

import dao.ClientJPA_DAO;
import entity.Client;

@Stateful
@Local
public class ClientBean {
	
	private ClientJPA_DAO clientJPA_DAO = ClientJPA_DAO.getInstance();

	public void create(Client client) throws SQLException{
		
		clientJPA_DAO.persist(client);
	}

	public void delete(Client client) throws SQLException{
		
		clientJPA_DAO.remove(client);
	}

	public void deleteById(int id) throws SQLException{
		
		clientJPA_DAO.removeById(id);
	}

	public Client signIn(String email, String password) throws SQLException{
		
		return clientJPA_DAO.signIn(email, password);
	}

	public List<Client> read() throws SQLException{
		
		return clientJPA_DAO.findAll();
	}

	public Client readById(final int id) throws SQLException{
		
		return clientJPA_DAO.getById(id);
	}

	public Client update(Client client) throws SQLException{
		
		return clientJPA_DAO.merge(client);
	}
}
