package managedbean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entidade.Categoria;
import entidade.Cliente;

@ManagedBean
@SessionScoped
public class CategoriaMB {

	private ArrayList<Categoria> categorias = new ArrayList<Categoria>();
	private Categoria categoria = new Categoria();
	
	public void salvar()
	{
		categorias.add(categoria);
		categoria = new Categoria();
	}
	
	public ArrayList<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(ArrayList<Categoria> categorias) {
		this.categorias = categorias;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public void remover(Categoria categoria) {
		categorias.remove(categoria);
	}
	
}
