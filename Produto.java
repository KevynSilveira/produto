package produto;
public class Produto {
    
    
    //atributos
    private String nome;
    private float peso;
    private double preço;
    
    public Produto() {
        
    }

    public Produto(String nome, float peso, double preço) {
        this.nome = nome;
        this.peso = peso;
        this.preço = preço;
    }
    
    
    
    
    //getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public double getPreço() {
        return preço;
    }
    public void setPreço(double preço) {
        this.preço = preço;
    }
}
