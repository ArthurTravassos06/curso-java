import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta :");
        int numero = scanner.nextInt();
        
        System.out.println("Por favor, digite o número da Agência :");
        String agencia = scanner.next();

        scanner.nextLine();
        System.out.println("Por favor, digite o seu nome completo :");
        String nomeCompleto = scanner.nextLine();

        System.out.println("Por favor, digite o seu saldo incial :");
        double saldo = scanner.nextDouble();
        
        
        
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque.", nomeCompleto, agencia, numero, saldo);
    }
    
}