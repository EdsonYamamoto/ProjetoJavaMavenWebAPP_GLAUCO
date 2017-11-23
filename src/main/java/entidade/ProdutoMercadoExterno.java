package entidade;

public class ProdutoMercadoExterno extends Produto {
	protected String destino;

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", categoria=" + categoria +", preco=" + preco +", imposto=" + imposto + " ,destino:"+this.destino+ "]";
	}
}
