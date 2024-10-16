public class SistemaBiblioteca {
    public static void main(String[] args) {
        ListaDuplamenteLigada biblioteca = new ListaDuplamenteLigada();

        // Adicionar livros
        biblioteca.adicionarNoInicio(1, "Dom Quixote", "Miguel de Cervantes");
        biblioteca.adicionarNoFim(2, "1984", "George Orwell");
        biblioteca.adicionarNoFim(3, "O Senhor dos Anéis", "J.R.R. Tolkien");

        // Imprimir livros na ordem original e reversa
        biblioteca.imprimirOrdemOriginal();
        biblioteca.imprimirOrdemReversa();

        // Buscar livro por ID
        biblioteca.buscarPorID(2);

        // Remover livros
        biblioteca.removerDoInicio();
        biblioteca.removerDoFim();

        // Imprimir novamente
        biblioteca.imprimirOrdemOriginal();
    }
}
