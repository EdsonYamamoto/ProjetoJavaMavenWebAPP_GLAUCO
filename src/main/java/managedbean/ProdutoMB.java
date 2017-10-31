package managedbean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entidade.Produto;

@ManagedBean
@SessionScoped
public class ProdutoMB {

	private ArrayList<Produto> produtos = new ArrayList<Produto>();
	private Produto produto = new Produto();
	public void salvar()
	{
		produtos.add(produto);
		produto = new Produto();
	}
	
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public void remover(Produto produto)
	{
		produtos.remove(produto);
	}
}
