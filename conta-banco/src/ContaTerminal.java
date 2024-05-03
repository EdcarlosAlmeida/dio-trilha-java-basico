import java.util.Scanner;

/**
 * <h1>ContaTerminal</h1>
 * A Classe tem como objetivo atender o desafio proposto para DIO trilha java Basico
 * sobre sintsxe Java, proposto por Gleyson Sampaio
 * <p>
 * <b>Nota:</b> SINTAXE - DESAFIO
 * 
 * @author Edcarlos Almeida
 * @version 1.0
 * @since 02/05/2024
 */

public class ContaTerminal {
    /**
     * Este metodo principal do programa, utilizado para simular o cadastro de uma conta bancaria
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Olá Seja bem vindo ao banco JAVA INVESTIMENTOS!");

        System.out.println("Por favor, digite o nome do cliente!");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o sobre nome do cliente!");
        String sobrenomeCliente = scanner.next();

        System.out.println("Por favor, digite o número da agência!");
        String numeroAgencia = scanner.next();

        System.out.println("Por favor, digite o numero da conta!");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o saldo da conta!");
        double saldoConta = scanner.nextDouble();

        System.out.println("Olá " +nomeCliente+ " "+sobrenomeCliente+ ", obrigado por criar uma conta em nosso banco,\n sua agência é "
        +numeroAgencia+" conta "+numeroConta+ " \n e seu saldo R$ "+saldoConta+" já está disponível para saque.");

        scanner.close();

    }
}
