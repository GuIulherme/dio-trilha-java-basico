import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite seu nome: ");
        String nome = scanner.next();

        System.out.print("Digite o numero da sua agencia: ");
        String agencia = scanner.next();

        System.out.print("Digite o numero da sua conta: ");
        int conta = scanner.nextInt();

        System.out.print("Digite seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Ola " + nome + " obrigado por criar uma conta em nosso banco, sua agencia é " + agencia
                + ", conta" + conta + " e seu saldo de R$" + saldo + " ja esta disponivel para saque");
    }
}