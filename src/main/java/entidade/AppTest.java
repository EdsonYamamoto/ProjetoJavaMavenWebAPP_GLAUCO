package entidade;

public class AppTest {
	public static void main(String[] args)
	{
		ProdutoMercadoExterno mercE = new ProdutoMercadoExterno();
		ProdutoMercadoInterno mercI = new ProdutoMercadoInterno();
		Categoria cat = new Categoria();
		cadastraMercExt(mercE, 0, "a", cat, 1, 5, "fusao");
		cadastraMercInt(mercI, 0, "a", cat, 1, 5, 2);
		
		Item i1 = new Item();

		i1.AdicionarProduto(mercE, 1);
		i1.AdicionarProduto(mercI, 5);
		i1.AdicionarProduto(mercE, 7);

		imprimiProduto(i1);
		
		
		
		Cliente c1 = new Cliente();
		cadastraCliente(c1, 1, "tteste");
		Pedido ped1 = new Pedido();
		cadastraPedido(ped1, 1, c1, i1, "15/26");
		System.out.println(ped1);
	}

	private static void cadastraPedido(Pedido p, int ID, Cliente c, Item i, String data)
	{
		p.setCliente(c);
		p.setItem(i);
		p.setId(ID);
		p.setData(data);
		
	}
	private static void cadastraCliente(Cliente c, int cod, String nome)
	{
		c.setCodigo(cod);
		c.setNome(nome);
	}
	private static void imprimiProduto(Item i)
	{
		for (ProdutoVenda p : i.getListaProduto())
		{
			System.out.println(p);
		}
	}
	private static void cadastraMercInt (ProdutoMercadoInterno merc, int cod, String nom, Categoria cat, double pre, double imp, double incentivo)
	{
		merc.codigo = cod;
		merc.nome=nom;
		merc.categoria=cat;
		merc.preco=pre;
		merc.imposto=imp;
		merc.setIncentivo(incentivo);
	}
	private static void cadastraMercExt (ProdutoMercadoExterno merc, int cod, String nom, Categoria cat, double pre, double imp, String destino)
	{
		merc.setCodigo(cod);
		merc.nome=nom;
		merc.categoria=cat;
		merc.preco=pre;
		merc.imposto=imp;
		merc.setDestino(destino);
	}
}
