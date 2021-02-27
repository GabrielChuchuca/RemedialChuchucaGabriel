/**
 * 
 */
package ec.edu.ups.vistas;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;
import javax.inject.Inject;

import ec.edu.ups.RemedialChuchucaGabriel.modelo.Autor;
import ec.edu.ups.RemedialChuchucaGabriel.modelo.Categoria;
import ec.edu.ups.RemedialChuchucaGabriel.modelo.Libro;
import ec.edu.ups.dao.AutorDAO;
import ec.edu.ups.on.GestionONLocal;

/**
 * @author Gabriel Leonardo Chu
 *
 */

@ManagedBean
@ViewScoped
@RequestScoped
public class LibroBean {
	@Inject
	private GestionONLocal gestionOnLocal;
	
	private Libro libro;
	private Autor autor;
	private List<Autor> listasAutores;
	private List<Categoria> listasCategorias;
	
	private List<String> selectitemAutor;
	
	//private List<Libro> listasLibros;
	
	
	@PostConstruct
	public void init() {
		listasAutores = gestionOnLocal.listasAutores();
		libro = new Libro();
		autor = new Autor();
		loadDataA();
		loadDataC();
		selectitemAutor = new ArrayList<>();
		for (Autor a:listasAutores) {
			selectitemAutor.add(a);
		}
	}
	
	public LibroBean() {
		autor = new Autor();
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
	 * @return the autor
	 */
	public Autor getAutor() {
		return autor;
	}



	/**
	 * @param autor the autor to set
	 */
	public void setAutor(Autor autor) {
		this.autor = autor;
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
	
	/**
	 * @return the selectitemAutor
	 */
	public List<String> getSelectitemAutor() {
		return selectitemAutor;
	}

	/**
	 * @param selectitemAutor the selectitemAutor to set
	 */
	public void setSelectitemAutor(List<String> selectitemAutor) {
		this.selectitemAutor = selectitemAutor;
	}

	public void guardarL() {
		gestionOnLocal.guardarLibro(libro);
		System.out.println("GUARDADO CON EXITO-libro");
	}
	
	public void loadDataA() {
		listasAutores = gestionOnLocal.listasAutores();
		
	}
	
	/*public List<SelectItem> getA(){
		
		this.selectitemAutor = new ArrayList<SelectItem>();
		listasAutores = gestionOnLocal.listasAutores();
		selectitemAutor.clear();
		for (Autor a:listasAutores) {
			SelectItem selectItem = new SelectItem(a.getId(), a.getNombre());
			this.selectitemAutor.add(selectItem);
			
		}
		return selectitemAutor;
		
	}*/
	
	public void loadDataC() {
		listasCategorias= gestionOnLocal.listasCategorias();
	}
	

}
