import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        
        int numero;
        String agencia, nomeCliente;
        double saldo;

        Scanner s = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta: ");
        numero = s.nextInt();

        System.out.println("Por favor, digite o número da sua agência: ");
        agencia = s.next();

        System.out.println("Por favor, digite o seu nome: ");
        nomeCliente = s.next();

        System.out.println("Por favor, digite o seu saldo: ");
        saldo = s.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");;

    }
}
