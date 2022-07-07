import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;


public class Contador {
    public static void main(String[] args) {
        try {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();
        contar(parametroUm,parametroDois);
        }
        catch ( InputMismatchException e) {
            System.out.println("Os parâmetros devem ser inteiros");
    
        }
        
        catch( Exception ParametrosInvalidosException) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }


        
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if ( parametroDois < parametroUm) {
            throw new ParametrosInvalidosException();
        }


        int contagem = parametroDois - parametroUm ;
        
        int i;

        for (i = 0; i < contagem;i++) {
            System.out.println( "Imprimindo o número " + (i+1));

        }

    }
}
