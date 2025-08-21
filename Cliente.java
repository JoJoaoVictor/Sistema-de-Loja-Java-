public class Cliente {
    private String nomeC;
    private String endereco;
    private int telefone;
    

    // Construtor, getters e setters
    //Construtor para chamar cada objeto
    public Cliente(String nomeC, String endereco, int telefone) {
        this.nomeC = nomeC;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    // metado para add o client na onterface 
    public void adicionarClinete(String nome) {
        System.out.println("Nome adicionado: " + nomeC);
        
    }


}
