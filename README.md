# Bertoti
# bertoti
Vemos três diferenças críticas entre programação e engenharia de software: tempo, escala e as compensações em jogo. Em um projeto de engenharia de software, os engenheiros precisam estar mais preocupados com a passagem do tempo e a eventual necessidade de mudança. Em uma organização de engenharia de software, precisamos estar mais preocupados com escala e eficiência, tanto para o software que produzimos quanto para a organização que o está produzindo. Finalmente, como engenheiros de software, somos solicitados a tomar decisões mais complexas com resultados de maior risco, geralmente com base em estimativas imprecisas de tempo e crescimento.

O que é Engenharia de Software
Acredito que seja uma administração das funcionalidades, tecnologias, para poder dimensionar  tempo, escalabilidade ou seja a estrutura de um projeto

Exemplo de trade-offs

Desempenho vs. Segurança:

Trade-off: Melhorar a segurança de um sistema pode exigir a implementação de mecanismos como criptografia, autenticação em várias etapas, e verificações adicionais. Embora esses mecanismos aumentem a segurança, eles também podem adicionar latência e consumir mais recursos, o que pode impactar o desempenho do sistema.

Exemplo: Em um aplicativo bancário, o uso de criptografia forte para proteger dados do usuário pode reduzir a velocidade de transações ou aumentar o tempo de resposta das consultas.
Escalabilidade vs. Consistência:

Trade-off: Em sistemas distribuídos, aumentar a escalabilidade pode comprometer a consistência dos dados, especialmente em arquiteturas que seguem o modelo CAP (Consistência, Disponibilidade, Tolerância a Partições). Isso ocorre porque, para garantir alta disponibilidade e tolerância a falhas, é possível que o sistema permita leituras de dados desatualizados.

Exemplo: Em uma plataforma de e-commerce distribuída globalmente, garantir que todas as instâncias do banco de dados estejam sempre sincronizadas pode ser difícil e afetar a capacidade do sistema de escalar rapidamente.
Manutenibilidade vs. Tempo de Entrega:

Trade-off: Escrever código altamente modular, documentado e seguindo as melhores práticas de design de software facilita a manutenção e a evolução do sistema. No entanto, isso pode aumentar o tempo necessário para a entrega inicial do produto, especialmente em projetos com prazos apertados.


+----------------+
|     Produto    |
+----------------+
| - nome: String |
| - quant: String|
+----------------+
| + Produto(nome: String, quant: String) |
| + getNome(): String                    |
| + setNome(nome: String): void          |
| + getquant(): String                   |
| + setQuant(quant: String): void        |
+----------------+

+-------------------------+
|         Estoque         |
+-------------------------+
| - produtos: List<Produto> |
+-------------------------+
| + cadastrarproduto(produto: Produto): void         |
| + buscarProdutopornome(nome: String): List<Produto>|
| + getProdutos(): List<Produto>                     |
+-------------------------+

+----------------+
|      Main      |
+----------------+
| <<static>> main(args: String[]): void |
+----------------+
