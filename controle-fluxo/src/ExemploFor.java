/**estrutura do controle de fluxo for

for (bloco de inicialização; expressão booleana de validação; bloco de atualização)
{
     // comando que será executado até que a
     // expressão de validação torne-se falsa
} */

public class ExemploFor {
    public static void main(String[] args) {
        //estrutura 1
        for (int carneirinhos = 1; carneirinhos<=20;carneirinhos++){
            System.out.println("contado carneirinhos: " + carneirinhos);
        }

        System.out.println("joãozinho dormiu");

        //estrutura 2
        //o que importa é somente o bloco condicional
        int carneirinhos = 1;
        for( ; carneirinhos <=20; ) {
            System.out.println(carneirinhos + " - Carneirinho(s)");
            carneirinhos ++;
        }

        int numero = 1;

        for (int x=1; x<2; x++){
            numero = numero + x;
        }
        System.out.println("O valor de número é: " + numero);

        String[] nomes = {"Camila", "Venilton", "Leonardo", "Renan", "Rafael"};
        System.out.print(nomes.length);

        for(int x=1;x<=10;x++){
            if(x % 2==0) //% operador que representa módulo de uma divisão
                System.out.println(x);
        }
    }
}