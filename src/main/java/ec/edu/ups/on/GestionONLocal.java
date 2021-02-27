/**
 * 
 */
package ec.edu.ups.on;

import java.util.List;

import javax.ejb.Local;

import ec.edu.ups.RemedialChuchucaGabriel.modelo.Autor;
import ec.edu.ups.RemedialChuchucaGabriel.modelo.Categoria;
import ec.edu.ups.RemedialChuchucaGabriel.modelo.Libro;

/**
 * @author Gabriel Leonardo Chu
 *
 */

@Local
public interface GestionONLocal {
	public void guardarLibro(Libro l);
	public List<Autor> listasAutores();
	public List<Categoria> listasCategorias();

}
