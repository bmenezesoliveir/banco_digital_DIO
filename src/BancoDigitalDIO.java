import java.util.Scanner;

public class BancoDigitalDIO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar contas exemplo
        Conta contaCorrente = new ContaCorrente(12345, 678, 1000.0);
        Conta contaPoupanca = new ContaPoupanca(54321, 678, 1500.0);

        while (true) {
            System.out.println("\n--- Banco Digital ---");
            System.out.println("1. Exibir informações da Conta Corrente");
            System.out.println("2. Exibir informações da Conta Poupança");
            System.out.println("3. Depositar em Conta Corrente");
            System.out.println("4. Depositar em Conta Poupança");
            System.out.println("5. Sacar da Conta Corrente");
            System.out.println("6. Sacar da Conta Poupança");
            System.out.println("7. Transferir de Conta Corrente para Conta Poupança");
            System.out.println("8. Transferir de Conta Poupança para Conta Corrente");
            System.out.println("9. Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    contaCorrente.exibirInformacoes();
                    break;
                case 2:
                    contaPoupanca.exibirInformacoes();
                    break;
                case 3:
                    System.out.print("Valor do depósito na Conta Corrente: R$ ");
                    double valorDepositoCC = scanner.nextDouble();
                    contaCorrente.depositar(valorDepositoCC);
                    break;
                case 4:
                    System.out.print("Valor do depósito na Conta Poupança: R$ ");
                    double valorDepositoPP = scanner.nextDouble();
                    contaPoupanca.depositar(valorDepositoPP);
                    break;
                case 5:
                    System.out.print("Valor do saque da Conta Corrente: R$ ");
                    double valorSaqueCC = scanner.nextDouble();
                    contaCorrente.sacar(valorSaqueCC);
                    break;
                case 6:
                    System.out.print("Valor do saque da Conta Poupança: R$ ");
                    double valorSaquePP = scanner.nextDouble();
                    contaPoupanca.sacar(valorSaquePP);
                    break;
                case 7:
                    System.out.print("Valor da transferência de Conta Corrente para Conta Poupança: R$ ");
                    double valorTransferenciaCCtoPP = scanner.nextDouble();
                    contaCorrente.transferir(contaPoupanca, valorTransferenciaCCtoPP);
                    break;
                case 8:
                    System.out.print("Valor da transferência de Conta Poupança para Conta Corrente: R$ ");
                    double valorTransferenciaPPtoCC = scanner.nextDouble();
                    contaPoupanca.transferir(contaCorrente, valorTransferenciaPPtoCC);
                    break;
                case 9:
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}