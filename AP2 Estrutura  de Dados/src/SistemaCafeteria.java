public class SistemaCafeteria {
    public static void main(String[] args) {
        Fila filaPedidos = new Fila();
        Pilha pilhaCancelados = new Pilha();

        // Adicionar novos pedidos
        filaPedidos.enqueue(1, "Café");
        filaPedidos.enqueue(2, "Cappuccino");
        filaPedidos.enqueue(3, "Latte");

        // Atender um pedido
        System.out.println("Atendendo Pedido:");
        Node atendido = filaPedidos.dequeue();
        if (atendido != null) System.out.println("Atendido: " + atendido.descricao);

        // Cancelar um pedido
        System.out.println("Cancelando Pedido:");
        Node cancelado = filaPedidos.dequeue();
        if (cancelado != null) {
            pilhaCancelados.push(cancelado.id, cancelado.descricao);
            System.out.println("Cancelado: " + cancelado.descricao);
        }

        // Imprimir pedidos pendentes e cancelados
        filaPedidos.printQueue();
        pilhaCancelados.printStack();
    }
}
