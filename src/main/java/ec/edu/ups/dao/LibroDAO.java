/**
 * 
 */
package ec.edu.ups.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.RemedialChuchucaGabriel.modelo.Libro;

/**
 * @author Gabriel Leonardo Chu
 *
 */

@Stateless
public class LibroDAO {
	@PersistenceContext(name = "RemedialChuchucaGabrielPersistenceUnit")
	private EntityManager em;
	
	public void insertlib(Libro l) {
		em.persist(l);
	}
	
	public void updatelib(Libro l) {
		em.merge(l);
	}
	
	public List<Libro> getLibros(){
		String jpql = "SELECT l FROM Libro l";
		Query q = em.createQuery(jpql, Libro.class);
		return q.getResultList();
	}

}
