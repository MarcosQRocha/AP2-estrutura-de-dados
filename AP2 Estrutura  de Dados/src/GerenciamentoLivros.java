    class ListaDuplamenteLigada {
    private NodeDuplo head, tail;

    public ListaDuplamenteLigada() {
        this.head = this.tail = null;
    }

    public void adicionarNoInicio(int id, String titulo, String autor) {
        NodeDuplo novo = new NodeDuplo(id, titulo, autor);
        if (head != null) {
            novo.next = head;
            head.prev = novo;
        } else {
            tail = novo;
        }
        head = novo;
    }

    public void adicionarNoFim(int id, String titulo, String autor) {
        NodeDuplo novo = new NodeDuplo(id, titulo, autor);
        if (tail != null) {
            tail.next = novo;
            novo.prev = tail;
        } else {
            head = novo;
        }
        tail = novo;
    }

    public NodeDuplo removerDoInicio() {
        if (head == null) {
            System.out.println("Lista vazia!");
            return null;
        }
        NodeDuplo removido = head;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        return removido;
    }

    public NodeDuplo removerDoFim() {
        if (tail == null) {
            System.out.println("Lista vazia!");
            return null;
        }
        NodeDuplo removido = tail;
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        } else {
            head = null;
        }
        return removido;
    }

    public void buscarPorID(int id) {
        NodeDuplo atual = head;
        while (atual != null) {
            if (atual.id == id) {
                System.out.println("Livro Encontrado: " + atual.titulo + " por " + atual.autor);
                return;
            }
            atual = atual.next;
        }
        System.out.println("Livro com ID " + id + " não encontrado.");
    }

    public void imprimirOrdemOriginal() {
        NodeDuplo atual = head;
        System.out.println("Livros em Ordem Original:");
        while (atual != null) {
            System.out.println(atual.titulo + " por " + atual.autor);
            atual = atual.next;
        }
    }

    public void imprimirOrdemReversa() {
        NodeDuplo atual = tail;
        System.out.println("Livros em Ordem Reversa:");
        while (atual != null) {
            System.out.println(atual.titulo + " por " + atual.autor);
            atual = atual.prev;
        }
    }
}
