/**
 * 
 */
package ec.edu.ups.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.RemedialChuchucaGabriel.modelo.Categoria;

/**
 * @author Gabriel Leonardo Chu
 *
 */

@Stateless
public class CategoriaDAO {
	@PersistenceContext(name = "RemedialChuchucaGabrielPersistenceUnit")
	private EntityManager em;
	
	public List<Categoria> getCategorias(){
		String jpql = "SELECT c FROM Categoria c";
		Query q = em.createQuery(jpql, Categoria.class);
		return q.getResultList();
	}

}
