package Model;

public class ItensPedidos {
	private int id;
	private Pedidos pedido;
	private String descriaoo;
	private int quantidade;
	private double preco;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Pedidos getPedido() {
		return pedido;
	}
	public void setPedido(Pedidos pedido) {
		this.pedido = pedido;
	}
	public String getDescriaoo() {
		return descriaoo;
	}
	public void setDescriaoo(String descriaoo) {
		this.descriaoo = descriaoo;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	

}
