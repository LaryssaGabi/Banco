import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        Integer i = 0;

        try {
            Bank contaPrimaria = new Bank(1, 100, "Sede", 1);
            while (i != 5) {
                System.out.println("\nBem vindo ao nosso banco!\nQual operação deseja realizar hoje?\n"
                        + "\n| 1 -> creditar \n| 2 -> debitar \n| 3 -> consultar saldo \n| 4 -> encerrar conta \n|"
                        + " 5 -> sair");
                i = leia.nextInt();
                switch (i) {
                    case 1:
                        if (contaPrimaria.getTipo() != 4) {
                            System.out.println("Digite o valor a ser creditado: ");
                            contaPrimaria.creditar(leia.nextInt());
                            System.out.println("\nSeu saldo atual é de " + contaPrimaria.getSaldo());
                        } else {
                            System.out.println("Conta encerrada! Não é possivel realizar esta operação");
                        }

                        break;
                    case 2:
                        if (contaPrimaria.getTipo() != 4) {
                            System.out.println("Digite o valor a ser debitado: ");
                            contaPrimaria.debitar(leia.nextInt());
                            System.out.println("\nSeu saldo atual é de " + contaPrimaria.getSaldo());
                        } else {
                            System.out.println("Conta encerrada! Não é possivel realizar esta operação");
                        }
                        break;
                    case 3:
                        System.out.println("Seu saldo atual é de " + contaPrimaria.getSaldo());
                        break;
                    case 4:
                        if (contaPrimaria.getSaldo() <= 0) {
                            contaPrimaria.encerrarConta();
                            System.out.println(contaPrimaria.textoEncerrar());
                        } else {
                            System.out.println("Não é possivel encerrar a conta, retire todo o dinheiro");
                        }
                        break;
                    case 5:
                        System.out.println("\nVolte sempre!");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Fim do programa");
            leia.close();
        }
    }
}
