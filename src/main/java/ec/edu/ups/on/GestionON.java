/**
 * 
 */
package ec.edu.ups.on;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.RemedialChuchucaGabriel.modelo.Autor;
import ec.edu.ups.RemedialChuchucaGabriel.modelo.Categoria;
import ec.edu.ups.RemedialChuchucaGabriel.modelo.Libro;
import ec.edu.ups.dao.AutorDAO;
import ec.edu.ups.dao.CategoriaDAO;
import ec.edu.ups.dao.LibroDAO;

/**
 * @author Gabriel Leonardo Chu
 *
 */

@Stateless
public class GestionON implements GestionONLocal{
	
	@Inject
	private LibroDAO libroDAO;
	
	@Inject
	private AutorDAO autorDAO;
	
	@Inject
	private CategoriaDAO categoriaDAO;
	
	private List<Autor> autorL;
	
	public void guardarLibro(Libro l) {
		libroDAO.insertlib(l);
	}
	
	public List<Autor> listasAutores(){
		return new ArrayList<>(autorDAO.getAutores());
	}
	
	public List<Categoria> listasCategorias(){
		return categoriaDAO.getCategorias();
	}

}
