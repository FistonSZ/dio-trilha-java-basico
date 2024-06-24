import java.util.Locale;
import java.util.Scanner;

public class BancoTerminal {
    public static void main(String[] args) {
        
        //TODO: Conhecer e importar a classe Scanner

       //Exibir as mensagens para o nosso usuário

      //Obter pela scanner os valores digitados no terminal
     
     //exibir a mensagem da conta criada
      
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
     
         String nomeCliente;
         String agencia;
         int conta;
         double saldo;
     
      System.out.println("Digite o nome do cliente");
      nomeCliente = scanner.next();
      System.out.println("");

      System.out.println("Digite a agência do cliente");
      agencia = scanner.next(); 
      System.out.println("");

      System.out.println("Digite a conta");
      conta = scanner.nextInt();
      System.out.println(""); 
        
      System.out.println("Digite o saldo");
      saldo = scanner.nextDouble();
      System.out.println("");  

  
     
      System.out.println("Cliente: " + nomeCliente); 
      System.out.println("Sua Agência: " + agencia);
      System.out.println("Numero da Conta: " + conta ); 
      System.out.println("Seu Saldo Atual = " + saldo + " R$"); 


    }
}
