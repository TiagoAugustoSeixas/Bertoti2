import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Criando o estoque
        Estoque mercado = new Estoque();

        // Criando produtos
        Produto salgado = new Produto("Salgadinho", "122");
        Produto refrigerante = new Produto("Coca Cola", "443");

        // Cadastrando produtos no estoque
        mercado.cadastrarproduto(salgado);
        mercado.cadastrarproduto(refrigerante);

        // Exibindo os produtos cadastrados
        System.out.println("Produtos cadastrados no estoque:");
        for (Produto produto : mercado.getProdutos()) {
            System.out.println("- " + produto.getNome() + " (Quantidade: " + produto.getquant() + ")");
        }

        // Buscando um produto pelo nome
        String nomeBusca = "Salgadinho";
        System.out.println("\nBuscando produtos com o nome: " + nomeBusca);
        List<Produto> encontrados = mercado.buscarProdutopornome(nomeBusca);

        if (encontrados.isEmpty()) {
            System.out.println("Nenhum produto encontrado com o nome: " + nomeBusca);
        } else {
            System.out.println("Produtos encontrados:");
            for (Produto produto : encontrados) {
                System.out.println("- " + produto.getNome() + " (Quantidade: " + produto.getquant() + ")");
            }
        }
    }
}
