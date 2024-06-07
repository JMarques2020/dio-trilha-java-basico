
import java.util.Scanner;

public class ContaTerminal
{
    public static void main(String[] args)throws Exception {
      //TODO: Conhecer  e importar a classe Scanner;
      // Exibir as mensagens para o nosso usuário;
      // Obter pela Scanner os valores digitados no terminal;
      // Exibir a mensagem conta criada.
      Scanner scanner = new Scanner(System.in);
      
      int numero = 1021;
      String agencia = "067-8";
      String nomeCliente = "Mario Andrade";
      double saldo = 237.8;
      
      System.out.println(" Por favor Digite o seu nome completo!");
        nomeCliente = scanner.nextLine();
        
      System.out.println(" Por favor Digite o número da sua Agencia:");
       agencia = scanner.nextLine();
       
      System.out.println(" Por favor Digite o número da sua Conta:");
        numero = scanner.nextInt();

      System.out.println(" Informe o seu saldo:");
        saldo = scanner.nextDouble();
      System.out.println("                           ");
      System.out.println("==========================================================================");
      System.out.println("Olá " +nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+ " já está disponível para saque.");
      System.out.println("==========================================================================");
        scanner.close();
    }
}
