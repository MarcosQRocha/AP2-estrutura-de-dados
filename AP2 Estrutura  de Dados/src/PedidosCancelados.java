class Pilha {
    private Node topo;

    public Pilha() {
        this.topo = null;
    }

    public void push(int id, String descricao) {
        Node novo = new Node(id, descricao);
        novo.next = topo;
        topo = novo;
    }

    public Node pop() {
        if (topo == null) {
            System.out.println("Pilha vazia!");
            return null;
        }
        Node removido = topo;
        topo = topo.next;
        return removido;
    }

    public void printStack() {
        Node atual = topo;
        System.out.println("Pedidos Cancelados:");
        while (atual != null) {
            System.out.println("ID: " + atual.id + ", Descrição: " + atual.descricao);
            atual = atual.next;
        }
    }
}
