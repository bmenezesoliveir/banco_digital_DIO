public class ContaPoupanca extends Conta {
    public ContaPoupanca(int numero, int agencia, double saldo) {
        super(numero, agencia, saldo);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Conta Poupança");
        System.out.println("Número: " + getNumero());
        System.out.println("Agência: " + getAgencia());
        System.out.println("Saldo: R$ " + getSaldo());
    }
}