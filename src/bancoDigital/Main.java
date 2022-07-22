package bancoDigital;


public class Main {

	public static void main(String[] args) {
		Cliente arthur = new Cliente();
		arthur.setNome("Arthur");
		
		Conta cc = new ContaCorrente(arthur);
		Conta poupanca = new ContaPoupanca(arthur);
		
		Cliente fany = new Cliente();
		fany.setNome("Fany");
		
		Conta cc1 = new ContaCorrente(fany);
		Conta poupanca1 = new ContaPoupanca(fany);

		cc.depositar(900);
		cc.transferir(200, poupanca1);
		cc.sacar(100);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		System.out.println();
		
		cc1.imprimirExtrato();
		poupanca1.imprimirExtrato();

	}

}
