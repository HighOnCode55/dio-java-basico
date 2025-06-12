import java.math.BigDecimal;
import java.util.Scanner;



public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da agência:");
        String agenciaCliente = scanner.nextLine();
        System.out.println("Por favor, digite o número da conta:");
        int contaCliente = scanner.nextInt();
        String nomeCliente = "MARIO ANDRADE";
        BigDecimal saldoCliente = new BigDecimal("237.48");

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco.%n" +
                  "Sua agência é %s, conta %d e seu saldo %s já está disponível para saque.%n",
                  nomeCliente, agenciaCliente, contaCliente, saldoCliente.toPlainString());
        
                  scanner.close();

    }
}
