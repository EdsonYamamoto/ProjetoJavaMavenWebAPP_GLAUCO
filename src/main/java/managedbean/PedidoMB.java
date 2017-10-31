package managedbean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entidade.Pedido;

@ManagedBean
@SessionScoped
public class PedidoMB {
	private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
	private Pedido pedido = new Pedido();
	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public void salvar()
	{
		pedidos.add(pedido);
		pedido = new Pedido();
	}
	public void remover(Pedido pedido)
	{
		pedidos.remove(pedido);
	}
}
