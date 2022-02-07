
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);
		ContaCorrenteEspecial cce = new ContaCorrenteEspecial(venilton);
		
		cce.setLimiteEspecial(1000);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		cce.depositar(500);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		cce.imprimirExtrato();
	}

}
;