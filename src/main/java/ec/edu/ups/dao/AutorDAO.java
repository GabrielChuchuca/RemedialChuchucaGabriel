/**
 * 
 */
package ec.edu.ups.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.RemedialChuchucaGabriel.modelo.Autor;

/**
 * @author Gabriel Leonardo Chu
 *
 */

@Stateless
public class AutorDAO {
	@PersistenceContext(name = "RemedialChuchucaGabrielPersistenceUnit")
	private EntityManager em;
	
	public List<Autor> getAutores(){
		String jpql = "SELECT a FROM Autor a";
		Query q = em.createQuery(jpql, Autor.class);
		return q.getResultList();
	}
	
	

}
