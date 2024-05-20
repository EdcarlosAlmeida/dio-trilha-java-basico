import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        System.out.println("1. Depositar");
        System.out.println("2. Sacar");
        System.out.println("3. Consultar Saldo");
        System.out.println("0. Encerrar");

        while(true) {
            int opcao = scanner.nextInt();
            
            switch (opcao){
                case 1 :{
                    double deposito = scanner.nextDouble();
                    saldo = saldo + deposito;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                }
                case 2 :{
                    double saque = scanner.nextDouble();
                    if(saldo < saque){
                        System.out.println("Saldo insuficiente.");
                    }else{
                        saldo = saldo - saque;
                        System.out.println("Saldo atual: " + saldo);
                    }
                    break;
                }
                case 3 :{
                    System.out.println("Saldo atual: " + saldo);
                    break;
                }
                case 0 :{
                    System.out.println("Programa encerrado.");
                    break;
                }
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            if (opcao == 0){
                break;
            }
        }
        scanner.close();

    }
}