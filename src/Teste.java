import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class  Teste {

    @Test
    void test() {

        Estoque mercado = new Estoque();

        Produto salgado = new Produto("Salgadinho", "122");
        Produto refrigerante = new Produto("Coca Cola", "443");

        mercado.cadastrarproduto(salgado);
        mercado.cadastrarproduto(refrigerante);

        assertEquals(mercado.getProdutos().size(), 2);

        List<Produto> disponivel = mercado.buscarProdutopornome("Salgadinho");
        assertEquals(disponivel.get(0).getquant(), salgado.getquant());
    }
}
