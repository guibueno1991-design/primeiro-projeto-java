import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 1000.00;
        int opcao = 0;

        System.out.println("=== BEM-VINDO AO GUI-BANK ===");

        while (opcao != 3) {
            System.out.println("\nSaldo atual: R$ " + saldo);
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.print("Digite o valor do depósito: R$ ");
                double deposito = scanner.nextDouble();
                saldo += deposito;
                System.out.println("Depósito realizado com sucesso!");
            } else if (opcao == 2) {
                System.out.print("Digite o valor do saque: R$ ");
                double saque = scanner.nextDouble();
                if (saque > saldo) {
                    System.out.println("Saldo insuficiente!");
                } else {
                    saldo -= saque;
                    System.out.println("Saque realizado com sucesso!");
                }
            } else if (opcao == 3) {
                System.out.println("Obrigado por usar o Dev-Bank!");
            } else {
                System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}
