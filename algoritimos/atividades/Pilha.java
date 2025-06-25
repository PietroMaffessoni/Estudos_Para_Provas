class Entrada {
    String chave;
    String valor;
    Entrada proximo;

    Entrada(String chave, String valor) {
        this.chave = chave;
        this.valor = valor;
    }
}

class TabelaHash {
    Entrada[] tabela = new Entrada[5];

    private int hash(String chave) {
        return Math.abs(chave.hashCode()) % tabela.length;
    }

    public void put(String chave, String valor) {
        int indice = hash(chave);
        Entrada nova = new Entrada(chave, valor);
        nova.proximo = tabela[indice];
        tabela[indice] = nova;
    }

    public String get(String chave) {
        
    }
}
