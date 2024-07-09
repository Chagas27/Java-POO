
public class Main {

	public static void main(String[] args) {
		Cliente Luiz = new Cliente();
		Luiz.setNome("Luiz");
		
		Cliente Amanda = new Cliente();
		Amanda.setNome("Amanda");
		
		Conta cc = new ContaCorrente(Amanda);
		Conta poupanca = new ContaPoupanca(Luiz);

		cc.depositar(100);
		cc.transferir(50, poupanca);
		
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}