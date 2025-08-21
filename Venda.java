import java.util.ArrayList;
import java.util.List;

public class Venda {

    private double valorTotal;
    private String formaPagamento;
    private Cliente cliente;
    private List<Produto> produtos;

    // Construtor para chamar cada objeto, getters e setters
    public Venda( double valorTotal, String formaPagamento) {
        this.valorTotal = valorTotal;
        this.formaPagamento = formaPagamento;
        this.cliente = cliente;

    }
    // metado para adiconar produto
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }
    //metado caso o cliente queira remover algum produto
    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }
    
        
}
