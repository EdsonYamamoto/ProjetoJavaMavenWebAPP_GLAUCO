package entidade;

public class Pedido {
	private int id;
	private String data;
	private Produto produto;
	private int quantidade;
}
/*
 * Guarda-se igualmente a informação dos pedidos feitos pelos clientes. 
 * Cada pedido possui um número e guarda-se a data de elaboração do pedido. 
 * Cada pedido pode envolver de um a vários produtos, e para cada produto, indica-se a quantidade deste pedida.
 */