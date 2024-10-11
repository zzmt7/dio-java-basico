import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //Criação do Scanner
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        //Entrada dos dados
        System.out.println("Por favor, seu primeiro nome: ");
        String nomeCliente = sc.next();

        System.out.println("Por favor, seu último nome: ");
        String sobrenomeCliente = sc.next();


        System.out.println("Digite o número da conta: ");
        String numeroConta = sc.next();

        //Declarando as variáveis
        String agencia = "067-8";
        double saldo = 237.48;

        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
}
}