public class Produto {

    private String nome;
    private String quant;

    public Produto(String nome, String quant  ){

        this.nome = nome;
        this.quant = quant;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) { this.nome = nome; }
    public String getquant() { return quant;}
    public void setQuant(String quant) { this.quant = quant;}

}

