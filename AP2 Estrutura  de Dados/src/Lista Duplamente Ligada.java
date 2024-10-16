class NodeDuplo {
    int id;
    String titulo;
    String autor;
    NodeDuplo prev, next;

    public NodeDuplo(int id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.prev = this.next = null;
    }
}
