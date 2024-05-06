import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
      
    //TODO:Conhecer e importar a classe Scanner

      //instanciando objeto
      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
     
     

      //Exibir as mensagens para o nosso usuário e capturar
    
      System.out.println("Por favor, digite o nome completo do cliente");
      String nomeCliente = scanner.nextLine();

      System.out.println("Por favor, digite a agência da conta do cliente");
      String agencia = scanner.next();

      System.out.println("Por favor, digite o número da conta do cliente (somente números)");
      int numeroConta = scanner.nextInt();

      System.out.println("Por favor, digite o saldo da conta do cliente (notação americana)");
      double saldo = scanner.nextDouble();

      //Exibir a mensagem da conta criada
      System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque!");

    }
}
