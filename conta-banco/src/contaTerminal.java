
import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numeroConta =1021;
        String nomeTitular="MÁRIO ANDRADE";
        String agencia="067-8";
        double saldo= 237.48;
       
        System.out.println(" Bom dia, digite o número da sua agência: ");
        agencia = scanner.nextLine();
        System.out.println(" Bom dia, digite o nome do seu titular: ");
        nomeTitular = scanner.nextLine();
        System.out.println(" Bom dia, digite o número da sua conta: ");   
        numeroConta = scanner.nextInt();
        
        
        System.out.println("Olá, "+ nomeTitular + ", obrigado por criar uma conta em nosso banco, sua agência é" + agencia + " sua conta é:" + numeroConta + "e o saldo inicial é: "+ saldo); 
    }
}
