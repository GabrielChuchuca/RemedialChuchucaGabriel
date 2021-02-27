/**
 * 
 */
package ec.edu.ups.RemedialChuchucaGabriel.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author Gabriel Leonardo Chu
 *
 */

@Entity
public class Autor implements Serializable{
	private static  final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="id_autor")
	private int id;
	@Column
	private String nombre;
	@Column
	private String nacionalidad;
	
	@OneToMany(mappedBy = "autor",cascade = CascadeType.ALL)
	private List<Libro> libros;
	
	public Autor() {
		
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the nacionalidad
	 */
	public String getNacionalidad() {
		return nacionalidad;
	}

	/**
	 * @param nacionalidad the nacionalidad to set
	 */
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	/**
	 * @return the libros
	 */
	public List<Libro> getLibros() {
		return libros;
	}

	/**
	 * @param libros the libros to set
	 */
	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}

	/**
	 * @param id
	 * @param nombre
	 * @param nacionalidad
	 * @param libros
	 */
	public Autor(int id, String nombre, String nacionalidad, List<Libro> libros) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.libros = libros;
	}
	
}
