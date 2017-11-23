package entidade;

public class ProdutoMercadoInterno extends Produto{
	protected double incentivo;

	public double getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}
	@Override
	public String toString() {
		return "Produto [codigo=" + this.codigo + ", nome=" + nome + ", categoria=" + categoria +", preco=" + preco +", imposto=" + imposto +" ,incentivo:"+this.incentivo +"]";
	}
	
}
