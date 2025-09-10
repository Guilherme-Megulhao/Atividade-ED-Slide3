class Cliente {
    String nome;
    Cliente proximo;

    public Cliente(String nome) {
        this.nome = nome;
        this.proximo = null;
    }
}

class FilaClientes {
    private Cliente inicio, fim;

    public void enfileirar(String nome) {
        Cliente novo = new Cliente(nome);
        if (fim != null) {
            fim.proximo = novo;
        } else {
            inicio = novo;
        }
        fim = novo;
    }

    public String desenfileirar() {
        if (inicio == null) return null;
        String nome = inicio.nome;
        inicio = inicio.proximo;
        if (inicio == null) fim = null;
        return nome;
    }

    public void exibirFila() {
        Cliente atual = inicio;
        while (atual != null) {
            System.out.print(atual.nome + " -> ");
            atual = atual.proximo;
        }
        System.out.println("null");
    }
}