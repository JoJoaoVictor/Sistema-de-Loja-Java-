public class Produto {
    private String nomep;
    private String descricao;
    private double precoUnitario;
    private int quantidadeEstoque;

    // Construtor para chamar cada objeto, getters e setters
    public  Produto( String nomep, String descricao, double precoUnitario, int quantidadeEstoque) {
        this.nomep = nomep;
        this.descricao = descricao;
        this.precoUnitario = precoUnitario;
        this.quantidadeEstoque = quantidadeEstoque;

    }

}
