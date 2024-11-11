package Model;

public class Pedidos {
	private int id;
	private Mesa mesa;
	private Funcionarios funcionario;
	private String data;
	private Tipo Status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Mesa getMesa() {
		return mesa;
	}
	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}
	public Funcionarios getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionarios funcionario) {
		this.funcionario = funcionario;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Tipo getStatus() {
		return Status;
	}
	public void setStatus(Tipo status) {
		Status = status;
	}
	
}
