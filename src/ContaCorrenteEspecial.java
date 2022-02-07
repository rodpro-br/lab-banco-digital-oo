
public class ContaCorrenteEspecial extends Conta {

	private double limiteEspecial = 0;
	
	public ContaCorrenteEspecial(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente Especial ===");
		imprimirInfosComuns();
	}

	public double getLimiteEspecial() {
		return limiteEspecial;
	}

	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}
	
	@Override
	public double getSaldo() {
		return saldo + getLimiteEspecial();
	}
	
	@Override
	public void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		System.out.println(String.format("Limite Especial: %.2f", this.limiteEspecial));
	}
}
