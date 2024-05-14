public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota =4;

        //Controle de fluxo se, senão se, senão
        if(nota >=7)
            System.out.println("Aprovado");
        else if(nota>=5 && nota <7)
            System.out.println("Prova de Recupeção");
        else
            System.out.println("Reprovado");
        
        // Operador Ternário encadeado
        String resultado = nota>=7 ? "Aprovado ternária": nota >=5 && nota<7 ? "Recuperação ternária" : "Reprovado ternária";
        System.out.println(resultado);
    }
}
