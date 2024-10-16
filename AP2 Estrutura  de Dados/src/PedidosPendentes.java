class Fila {
    private Node inicio;
    private Node fim;

    public Fila() {
        this.inicio = this.fim = null;
    }

    public void enqueue(int id, String descricao) {
        Node novo = new Node(id, descricao);
        if (fim != null) {
            fim.next = novo;
        } else {
            inicio = novo;
        }
        fim = novo;
    }

    public Node dequeue() {
        if (inicio == null) {
            System.out.println("Fila vazia!");
            return null;
        }
        Node removido = inicio;
        inicio = inicio.next;
        if (inicio == null) fim = null;
        return removido;
    }

    public void printQueue() {
        Node atual = inicio;
        System.out.println("Pedidos Pendentes:");
        while (atual != null) {
            System.out.println("ID: " + atual.id + ", Descrição: " + atual.descricao);
            atual = atual.next;
        }
    }
}
