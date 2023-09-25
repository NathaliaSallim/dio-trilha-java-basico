import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: conhecer e importar a classe Scanner
        //Exibir as mensagem par o nosso usuario
        //Obter pela classe scanner os valores digitados no terminal
        //Exibir a mensagem final.
        
        double saldo = 237.48;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da sua Conta: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da sua Agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$ " + saldo + ", já está disponível para saque.");


    }
}
