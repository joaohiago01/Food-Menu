package dao;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import entity.Menu;

public class MenuJPA_DAO {

	private static MenuJPA_DAO instance;
	@PersistenceContext
	protected EntityManager entityManager;
	
	public static MenuJPA_DAO getInstance(){
		if (instance == null){
			instance = new MenuJPA_DAO();
		}

		return instance;
	}

	private MenuJPA_DAO() {
		entityManager = getEntityManager();
	}

	private EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("food-menu");
		if (entityManager == null) {
			entityManager = factory.createEntityManager();
		}

		return entityManager;
	}
	
	public Menu getById(final int id) throws SQLException{
		return entityManager.find(Menu.class, id);
	}
	
	public Menu findByRestaurant(int id) {
		return (Menu) entityManager.createQuery("FROM " + 
				Menu.class.getName() + " WHERE RESTAURANT_ID = :id").setParameter("id", id).getSingleResult();
	}
	
	@SuppressWarnings("unchecked")
	public List<Menu> findAll() throws SQLException{
		return entityManager.createQuery("FROM " + 
				Menu.class.getName()).getResultList();
	}

	public void persist(Menu menu) throws SQLException{
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(menu);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	public Menu merge(Menu menu) throws SQLException{
		try {
			entityManager.getTransaction().begin();
			menu = entityManager.merge(menu);
			entityManager.getTransaction().commit();
			entityManager.flush();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
		return menu;
	}

	public void remove(Menu menu) throws SQLException{
		try {
			entityManager.getTransaction().begin();
			menu = entityManager.find(Menu.class, menu.getId());
			entityManager.remove(menu);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	public void removeById(final int id) throws SQLException{
		try {
			Menu menu = getById(id);
			remove(menu);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
