public class Produtos {
//    atributos da classe model
    private int idProduto;
    private String descricao;
    private float preco;
    private String unidade;

//    metodos get e set, que eh definido pela regra de encapsulamento

    public int getIdProduto() {
        return idProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
}
