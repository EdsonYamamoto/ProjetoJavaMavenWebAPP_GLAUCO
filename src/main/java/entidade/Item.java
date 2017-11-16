package entidade;

import java.util.ArrayList;

public class Item {
	
	public Item(){
		listaProduto = new ArrayList<ProdutoVenda>();
		listaQuantidade = new ArrayList<Integer>();
	}	
	public void AdicionarProduto(ProdutoVenda produto, int qtd)
	{
		listaProduto.add(produto);
		listaQuantidade.add(qtd);
	}
	
	private ArrayList<ProdutoVenda> listaProduto;
	private ArrayList<Integer> listaQuantidade;
	public ArrayList<ProdutoVenda> getListaProduto() {
		return listaProduto;
	}
	public void setListaProduto(ArrayList<ProdutoVenda> listaProduto) {
		this.listaProduto = listaProduto;
	}
	public ArrayList<Integer> getListaQuantidade() {
		return listaQuantidade;
	}
	public void setListaQuantidade(ArrayList<Integer> listaQuantidade) {
		this.listaQuantidade = listaQuantidade;
	}
	/*
	private Produto produto;
	private int quantidade;
	
	
	public Item(){
		listaProduto = new ArrayList<Produto>();
		listaQuantidade = new ArrayList<Integer>();
	}	
	public void AdicionarProduto(Produto produto, int qtd)
	{
		listaProduto.add(produto);
		listaQuantidade.add(qtd);
	}
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
	
	
	private ArrayList<Produto> listaProduto;
	private ArrayList<Integer> listaQuantidade;
	public ArrayList<Produto> getListaProduto() {
		return listaProduto;
	}
	public void setListaProduto(ArrayList<Produto> listaProduto) {
		this.listaProduto = listaProduto;
	}
	public ArrayList<Integer> getListaQuantidade() {
		return listaQuantidade;
	}
	public void setListaQuantidade(ArrayList<Integer> listaQuantidade) {
		this.listaQuantidade = listaQuantidade;
	}
	*/
}
