import java.util.Scanner;

/**
 * <h1>Desafio Controle de Fluxo </h1>
 * A Classe tem como objetivo atender o desafio proposto para DIO trilha java Basico
 * sobre o módulo de Controle de Fluxo, proposto por Gleyson Sampaio
 * <p>
 * O sistema deverá receber dois parâmetros via terminal que representarão dois números inteiros, com estes dois números você deverá obter a 
 * quantidade de interações (for) e realizar a impressão no console (System.out.print) dos números incrementados, exemplo:
 * Se você passar os números 12 e 30, logo teremos uma interação (for) com 18 ocorrências para imprimir os números, exemplo: 
 * "Imprimindo o número 1", "Imprimindo o número 2" e assim por diante.
 * Se o primeiro parâmetro for MAIOR que o segundo parâmetro, você deverá lançar a exceção customizada chamada de ParametrosInvalidosException 
 * com a segunda mensagem: "O segundo parâmetro deve ser maior que o primeiro"
 * <p>
 * <b>Nota:</b> Controle de Fluxo - Desafio
 *
 * @author Edcarlos Almeida
 * @version 1.0
 * @since 13/05/2024
 */
public class Contador {
    /**
     * Este metodo principal do programa
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner scanTerminal = new Scanner(System.in);
        
        do{
            for(int i = 1; i <=20;i++){
                System.out.println("\n");
            }
            
            System.out.println("Bem vindo a solução do desafio controle de fluxo em JAVA.\n "
                                + "o usuario deverá fornecer dois parâmetros via terminal \n "
                                +"que representarão dois números inteiros \n");

            try {
                System.out.println("Digite o primeiro parâmetro");
                int parametroUm = scanTerminal.nextInt();

                System.out.println("Digite o Segundo parâmetro");
                int parametroDois = scanTerminal.nextInt();
                
                try {
                    contar(parametroUm, parametroDois);
                } catch (Exception e) {
                    System.out.println("Tipo de erro: " + e + "\n O segundo parâmetro deve ser maior que o primeiro");
                }

            } catch (Exception e) {
                System.out.println("Tipo de erro: " + e + "\n O valor digitado deve ser numerico");
            }

            scanTerminal.nextLine();
            System.out.println("Deseja finalizar a aplicação? S/N");
        }while(!scanTerminal.nextLine().equalsIgnoreCase("s"));

        scanTerminal.close();
        System.out.println("Aplicação finalizada com sucesso!");
    }
    /**
     * 
     * @param parametroUm este é o primeiro parâmetro do método, deve ser variavel do tipo inteiro
     * @param parametroDois este é osegundo parâmetro do método, deve ser variavel do tipo inteiro
     * @throws ParametrosInvalidosException Classe de Exception customizada
     */
    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if(parametroDois <= parametroUm){
            throw new ParametrosInvalidosException();
        }
            int contagem = parametroDois - parametroUm;

            for(int contador = 1;contador <= contagem;contador++){
                System.out.println("Imprimindo o numero: " + contador);
            }
    }
}
