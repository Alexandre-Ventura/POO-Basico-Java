package Model;

public class Produto {
    // Atributos
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    private int estoque;
    private String validade;
    // Método Construtor de Objeto Vazio
    public Produto() {
        
    }
    
    // Método Construtor de Objeto, inserindo dados
    public Produto(int id, String nome, String descricao, double preco, int estoque, String validade) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.estoque = estoque;
        this.validade = validade;
    }
    
    // Métodos GET e SET
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public int getEstoque() {
        return estoque;
    }
    
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    
    public String getValidade() {
        return validade;
    }
    
    public void setValidade(String validade) {
        this.validade = validade;
    }
}

