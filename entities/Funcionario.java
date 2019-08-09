package entities;

public class Funcionario {

	private String nome;
	protected Integer horasTrabalhada;
	protected Double valHora;

	public Funcionario() {

		super();

	}

	public Funcionario(String nome, Integer hsTrabalhadas, Double valHora) {

		this.nome = nome;
		this.horasTrabalhada = hsTrabalhadas;
		this.valHora = valHora;

	}

	public String getNome() {

		return this.nome;
	}

	public void setNome(String nome) {

		this.nome = nome;

	}

	public Integer getHorasTrabalhadas() {

		return this.horasTrabalhada;
	}

	public void setHorasTrabalhadas(Integer horasTrabalhadas) {

		this.horasTrabalhada = horasTrabalhadas;

	}

	public Double getValHora() {

		return this.valHora;

	}

	public void setValHora(Double valHora) {

		this.valHora = valHora;

	}

	public Double Pagamento() {

		return horasTrabalhada * valHora;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("nome:");
		sb.append(nome);
		sb.append("\nA Receber"+ String.format("%.f",Paramento)));
		
		
		
		return sb.toString();
	}

}
