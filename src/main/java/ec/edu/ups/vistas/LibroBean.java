/**
 * 
 */
package ec.edu.ups.vistas;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import ec.edu.ups.RemedialChuchucaGabriel.modelo.Autor;
import ec.edu.ups.RemedialChuchucaGabriel.modelo.Categoria;
import ec.edu.ups.RemedialChuchucaGabriel.modelo.Libro;
import ec.edu.ups.on.GestionONLocal;

/**
 * @author Gabriel Leonardo Chu
 *
 */

@ManagedBean
@ViewScoped
public class LibroBean {
	@Inject
	private GestionONLocal gestionOnLocal;
	
	private Libro libro;
	private List<Autor> listasAutores;
	private List<Categoria> listasCategorias;
	//private List<Libro> listasLibros;
	
	
	@PostConstruct
	public void init() {
		libro = new Libro();
	}
	
	
	
	/**
	 * @return the gestionOnLocal
	 */
	public GestionONLocal getGestionOnLocal() {
		return gestionOnLocal;
	}



	/**
	 * @param gestionOnLocal the gestionOnLocal to set
	 */
	public void setGestionOnLocal(GestionONLocal gestionOnLocal) {
		this.gestionOnLocal = gestionOnLocal;
	}



	/**
	 * @return the libro
	 */
	public Libro getLibro() {
		return libro;
	}



	/**
	 * @param libro the libro to set
	 */
	public void setLibro(Libro libro) {
		this.libro = libro;
	}






	/**
	 * @return the listasAutores
	 */
	public List<Autor> getListasAutores() {
		return listasAutores;
	}



	/**
	 * @param listasAutores the listasAutores to set
	 */
	public void setListasAutores(List<Autor> listasAutores) {
		this.listasAutores = listasAutores;
	}
	
	



	/**
	 * @return the listasCategorias
	 */
	public List<Categoria> getListasCategorias() {
		return listasCategorias;
	}



	/**
	 * @param listasCategorias the listasCategorias to set
	 */
	public void setListasCategorias(List<Categoria> listasCategorias) {
		this.listasCategorias = listasCategorias;
	}



	public void guardarL() {
		gestionOnLocal.guardarLibro(libro);
		System.out.println("GUARDADO CON EXITO-libro");
	}
	
	public void loadDataA() {
		listasAutores = gestionOnLocal.listasAutores();
	}
	
	public void loadDataC() {
		listasCategorias = gestionOnLocal.listasCategorias();
	}
	

}
