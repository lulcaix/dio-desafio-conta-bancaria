import java.util.Scanner;
import java.util.Locale;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeCliente;
        Double saldo;

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da agência: ");
        numero = sc.nextInt();

        System.out.println("Por favor, digite o número da agência: ");
        agencia = sc.next();

        System.out.println("Por favor, informe o seu nome: ");
        nomeCliente = sc.next();

        System.out.println("Por favor, digite o valor que deseja depositar: ");
        saldo = sc.nextDouble();

        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponivel." );
    }
}
