package dao;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import entity.Menu;
import entity.Product;

public class ProductJPA_DAO {

	private static ProductJPA_DAO instance;
	@PersistenceContext
	protected EntityManager entityManager;
	
	public static ProductJPA_DAO getInstance(){
		if (instance == null){
			instance = new ProductJPA_DAO();
		}

		return instance;
	}

	private ProductJPA_DAO() {
		entityManager = getEntityManager();
	}

	private EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("food-menu");
		if (entityManager == null) {
			entityManager = factory.createEntityManager();
		}

		return entityManager;
	}

	public Product getById(final int id) throws SQLException{
		return entityManager.find(Product.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Product> findAllProducts(Menu menu) throws SQLException{
		return entityManager.createQuery("FROM " + Product.class.getName() +
				" P JOIN FETCH P.menu M WHERE M.id = :menu ORDER BY P.name ASC").setParameter("menu", menu.getId()).getResultList();
	}

	public void persist(Product product) throws SQLException{
		try {
			entityManager.getTransaction().begin();
			entityManager.persist(product);
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	public Product merge(Product product) throws SQLException{
		try {
			entityManager.getTransaction().begin();
			product = entityManager.merge(product);
			entityManager.getTransaction().commit();
			entityManager.flush();
			entityManager.refresh(product);
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
		return product;
	}

	public void remove(Product product) throws SQLException{
		try {
			entityManager.getTransaction().begin();
			entityManager.find(Product.class, product.getId());
			entityManager.remove(product);
			entityManager.getTransaction().commit();
			entityManager.flush();
		} catch (Exception ex) {
			ex.printStackTrace();
			entityManager.getTransaction().rollback();
		}
	}

	public void removeById(final int id) throws SQLException{
		try {
			Product product = getById(id);
			remove(product);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
