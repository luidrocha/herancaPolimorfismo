package entities;

public class Tercerizado extends Funcionario {

	private Double adicionalDespesa;
	

	public Tercerizado() {
		super();
	}


	public Tercerizado(String nome, Integer hsTrabalhadas, Double valHora, Double adicionalDespesa) {
		super(nome, hsTrabalhadas, valHora);
		this.adicionalDespesa = adicionalDespesa;
	}


	public Double getAdicionalDespesa() {
		return adicionalDespesa;
	}


	public void setAdicionalDespesa(Double adicionalDespesa) {
		this.adicionalDespesa = adicionalDespesa;
	}
	
	@Override
	
	public Double Pagamento() {
		
		// super chama o metodo da classe principal
		return super.Pagamento() + adicionalDespesa * 1.1; //110%
	}
	
	
	
}
