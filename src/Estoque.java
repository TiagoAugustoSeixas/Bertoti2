import java.util.List;
import java.util.LinkedList;

public class Estoque {

    private List<Produto> produtos = new LinkedList<Produto>();

    public void cadastrarproduto(Produto produto) {produtos.add(produto);
    }

    public List<Produto> buscarProdutopornome(String nome){
        List<Produto> produtosEncontrados = new LinkedList<Produto>();
        for(Produto produto:produtos) {
            if(produto.getNome().equals(nome))
                produtosEncontrados.add(produto);
        }
        return produtosEncontrados;
    }

    public List<Produto> getProdutos(){
        return produtos;
    }

}
