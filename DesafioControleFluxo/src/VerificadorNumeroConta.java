import java.util.Scanner;

public class VerificadorNumeroConta {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String numeroConta = scanner.next();
            verificarNumeroConta( numeroConta);
              // Imprime que o número de conta é válido:
            System.out.println("Numero de conta valido.");
        }  catch(Exception e){
          // TODO: Capture a exceção do tipo IllegalArgumentException, que pode ser lançada pelo método verificarNumeroConta:
          // Aqui é impresso uma mensagem de erro, mostrando a mensagem associada à exceção:
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }


    private static void verificarNumeroConta(String numeroConta) {
        if(numeroConta.length() != 8)
            throw new IllegalArgumentException();
    }
}
