public class ExemploForArray {
    public static void main(String[] args) {

        //em arrays o indice de elementos inicia em ZERO
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        for (int x=0; x<alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }

        /**For Each
            O uso do for / each está fortemente relacionado com um cenário onde contenha um array ou coleção,
            e assim, a interação é baseada aos elementos da coleção. */

        //Forma abreviada
        for(String aluno : alunos){
            System.out.println("nome do aluno é: " + aluno);
        }
    }
}
